package fr.simpleblog.model.DaoSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;
import fr.simpleblog.domainService.IserviceUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelUtilisateur;

public class DaoModelUtilisateur extends DaoModel implements IdaoModelUtilisateur, IserviceUtilisateur, UserDetailsService{

	Connection connection=null;
	ResultSet result=null;

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#create(int)
	 */
	public Utilisateur create(Utilisateur utilisateur) {

		PreparedStatement requestUtil=null;
		PreparedStatement requestAuth=null;
		String insertUtilisateur=null;
		String insertAuthority=null;

		@SuppressWarnings("unused")
		int errorCode;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			System.out.println(utilisateur);

			//Début du bloc de transaction
			//connection.setAutoCommit(false);

			insertUtilisateur="INSERT INTO Utilisateur (Nom,Prenom,Username,Password,Mail) VALUES(?,?,?,?,?)";
			requestUtil=connection.prepareStatement(insertUtilisateur);
			requestUtil.setString(1, utilisateur.getNom());
			requestUtil.setString(2, utilisateur.getPrenom());
			requestUtil.setString(3, utilisateur.getUsername());
			requestUtil.setString(4, utilisateur.getPassword());
			requestUtil.setString(5, utilisateur.getMail());
			utilisateur=null;
			System.out.println("request --->" + requestUtil.executeUpdate());
			errorCode=requestUtil.executeUpdate();

			insertAuthority="INSERT INTO Authority_Utilisateur (AuthorityId_a_u,UtilisateurId_a_u) VALUES('1',LAST_INSERT_ID())";
			requestAuth=connection.prepareStatement(insertAuthority);
			System.out.println("request --->" + requestAuth.executeUpdate());
			errorCode=requestAuth.executeUpdate();

			//Fin du bloc de transaction
			//System.out.println("connection.commit()");
			//connection.commit();

		} catch(Exception e) {
			utilisateur=null;
			errorCode=0;
			System.out.println("Erreur dans la requête dans la classe DAOModelUtilisateur method create");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(requestUtil!=null) {
					DBAdministration.closeRequest(requestUtil);
				}
				if(requestAuth!=null) {
					DBAdministration.closeRequest(requestAuth);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelUtilisateur method create");
			}
		}

		return utilisateur;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#read(int)
	 */
	public Utilisateur read(Utilisateur utilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;

		try {
			connection=super.getConnection();
			stringRequest="SELECT * FROM utilisateur WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, utilisateur.getId());
			System.out.println(utilisateur.getId());
			result=request.executeQuery();
			if(result!=null) {
				if(result.next()) {
					utilisateur= Mapper.utilisateurMapper(result);
				}
			}
		} catch(Exception e) {
			utilisateur=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelUtilisateur method read");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelUtilisateur method read");
			}
		}

		return utilisateur;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#update(int)
	 */
	public Utilisateur update(Utilisateur utilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;

		@SuppressWarnings("unused")
		int errorCode;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			System.out.println(utilisateur);

			//Début du bloc de transaction
			connection.setAutoCommit(false);

			stringRequest="UPDATE Utilisateur SET Mail=?,Password=?,Username=?,Prenom=?,Nom=?,StyleId_uti=? WHERE Username=?";

			request=connection.prepareStatement(stringRequest);

			request.setString(1, utilisateur.getMail());
			request.setString(2, utilisateur.getPassword());
			request.setString(3, utilisateur.getUsername());
			request.setString(4, utilisateur.getPrenom());
			request.setString(5, utilisateur.getNom());
			request.setInt(6, utilisateur.style.getId());
			//request.setString(7, utilisateur.getLangue());
			//request.setString(8, utilisateur.getAvatar());
			request.setString(7, utilisateur.getUsername());

			//utilisateur=null;
			errorCode = request.executeUpdate();
			System.out.println(request.executeUpdate());

			//Fin du bloc de transaction
			System.out.println("connection.commit()");
			connection.commit();

		} catch(Exception e) {
			errorCode = 0;
			utilisateur = null;
			System.out.println("Erreur dans la requête dans la classe DAOModelUtilisateur method updateUtilisateur");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelClient method editClient");
			}
		}

		return utilisateur;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#delete(int)
	 */
	public boolean delete(Utilisateur utilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;
		boolean reussi=false;

		try {
			connection=super.getConnection();
			stringRequest="DELETE FROM Utilisateur WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, utilisateur.getId());
			request.executeUpdate(stringRequest);
			reussi=true;
		} catch(Exception e) {
			reussi=false;
			utilisateur=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelUtilisateur method delete");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelUtilisateur method delete");
			}
		}

		return reussi;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOModelUtilisateur#listerUtilisateur()
	 */
	public List<Utilisateur> listerUtilisateur() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @param utilisateur
	 * @return
	 */
	public Utilisateur login(Utilisateur utilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;

		System.out.println("---------Dans login utilisateur----------- " + utilisateur);

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			stringRequest="SELECT * FROM Utilisateur WHERE Username=? AND Password=?";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, utilisateur.getUsername());
			request.setString(2, utilisateur.getPassword());

			result=request.executeQuery();

			System.out.println("--->" + request);

			if(result.first()) {
				utilisateur = Mapper.utilisateurMapper(result);
			} else {
				utilisateur = null;
			}
		} catch(Exception e) {
			utilisateur=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelUtilisateur method login");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelUtilisateur method login");
			}
		}

		return utilisateur;

	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username)
	
			throws UsernameNotFoundException {

		PreparedStatement request=null;
		PreparedStatement requestAuth=null;
		String stringRequest=null;
		String stringAuth=null;

		System.out.println("---------Dans login spring sec----------- " + username);

		Utilisateur utilisateur;
		HashSet<Authority> authorities = new HashSet<Authority>();
		Authority authority;
		UserDetails proxyUser;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			stringRequest="SELECT * FROM Utilisateur WHERE Username = ?";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, username);

			result=request.executeQuery();

			System.out.println("--->" + request);

			if(result.first()) {
				utilisateur = Mapper.utilisateurMapper(result);
				
				stringAuth="SELECT * FROM authority INNER JOIN authority_utilisateur ON authority.id=authority_utilisateur.authorityId_a_u WHERE UtilisateurId_a_u=?";
				requestAuth=connection.prepareStatement(stringAuth);
				requestAuth.setInt(1, utilisateur.getId());
				
				result=requestAuth.executeQuery();
				
				if(result!=null) {
					while (result.next()) {
						authority = Mapper.authorityMapper(result);
						authorities.add(authority);	
					}
					System.out.println(authorities);
					utilisateur.setAuthorities(authorities);
				} else {
					utilisateur = null;
				}
				
			} else {
				utilisateur = null;
			}
		} catch(Exception e) {
			utilisateur=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelUtilisateur method login");
		} finally {
			try {
				
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
				
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelUtilisateur method login");
			}
		}





//		Authority mockaut = new Authority();
//		mockaut.setAuthority("ROLE_USER");
//
//		HashSet<Authority> auths = new HashSet<Authority>();
//		auths.add(mockaut);
//
//		utilisateur.setAuthorities(auths);

		proxyUser = utilisateur;

		System.err.println(" credential ? " + utilisateur);

		return proxyUser;
	}

}