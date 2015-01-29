package fr.simpleblog.model.DAOSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;
import fr.simpleblog.domainService.IserviceUtilisateur;
import fr.simpleblog.model.interfaces.IDAOModelUtilisateur;

public class DAOModelUtilisateur extends DAOModel implements IDAOModelUtilisateur, IserviceUtilisateur {

	Connection connection=null;
	ResultSet result=null;

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#create(int)
	 */
	public Utilisateur create(Utilisateur utilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;
		@SuppressWarnings("unused")
		int errorCode;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			System.out.println(utilisateur);
			stringRequest="INSERT INTO Utilisateur (Nom,Prenom,Login,Password,Mail) VALUES(?,?,?,?,?)";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, utilisateur.getNom());
			request.setString(2, utilisateur.getPrenom());
			request.setString(3, utilisateur.getUsername());
			request.setString(4, utilisateur.getPassword());
			request.setString(5, utilisateur.getMail());
			utilisateur=null;
			System.out.println("request --->" + request.executeUpdate());
			errorCode=request.executeUpdate();
		} catch(Exception e) {
			utilisateur=null;
			errorCode=0;
			System.out.println("Erreur dans la requête dans la classe DAOModelUtilisateur method create");
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

		try {
			connection=super.getConnection();
			stringRequest="UPDATE Utilisateur set Langue=?,Avatar=?,Mail=?,Password=?,Username=?,Prenom=?,Nom=?,StyleId_uti=? WHERE Login=?";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, utilisateur.getLangue());
			request.setString(2, utilisateur.getAvatar());
			request.setString(3, utilisateur.getMail());
			request.setString(4, utilisateur.getPassword());
			request.setString(5, utilisateur.getUsername());
			request.setString(6, utilisateur.getPrenom());
			request.setString(7, utilisateur.getNom());
			request.setInt(8, utilisateur.getStyleId());
			request.setString(9, utilisateur.getUsername());
			utilisateur=null;
			request.executeUpdate(stringRequest);
		} catch(Exception e) {
			utilisateur=null;
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

}