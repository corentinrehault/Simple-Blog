/**
 * 
 */
package fr.simpleblog.model.DaoSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Set;

import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.beans.Pays;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;
import fr.simpleblog.domainService.IserviceFicheUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur;

/**
 * @author dao303
 *
 */
public class DaoModelFicheUtilisateur extends DaoModel implements IdaoModelFicheUtilisateur, IserviceFicheUtilisateur {

	Connection connection=null;
	ResultSet result=null;

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#create(java.lang.Object)
	 */
	@Override
	public FicheUtilisateur create(FicheUtilisateur ficheUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#read(java.lang.Class, int)
	 */
	@Override
	public FicheUtilisateur read(Class<?> clazz, int id) {

		PreparedStatement request=null;
		String stringRequest=null;
		FicheUtilisateur ficheUtilisateur = null;

		try {
			connection=super.getConnection();
			stringRequest="SELECT * FROM FicheUtilisateur WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, id);
			System.out.println(id);
			result=request.executeQuery();
			System.out.println(result.toString());
			if(result.first()) {
				ficheUtilisateur = Mapper.ficheUtilisateurMapper(result);
			} else {
				ficheUtilisateur = null;
			}
		} catch(Exception e) {
			ficheUtilisateur=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelFicheUtilisateur method read");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelFicheUtilisateur method read");
			}
		}

		return ficheUtilisateur;

	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#update(java.lang.Object)
	 */
	@Override
	public FicheUtilisateur update(FicheUtilisateur ficheUtilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			System.out.println(ficheUtilisateur);

			stringRequest="UPDATE FicheUtilisateur set adresse=?,ville=?,codepostal=?,paysId=? WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, ficheUtilisateur.getAdresse());
			request.setString(2, ficheUtilisateur.getVille());
			request.setInt(3, ficheUtilisateur.getCodePostal());
//			request.setInt(4, ficheUtilisateur.pays.getId());
			request.setInt(5, ficheUtilisateur.getId());
			ficheUtilisateur=null;
			request.executeUpdate(stringRequest);
		} catch(Exception e) {
			ficheUtilisateur=null;
			System.out.println("Erreur dans la requête dans la classe"
					+ " DAOModelFicheUtilisateur method updateFicheUtilisateur");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données"
						+ " dans la classe DAOModelFicheUtilisateur method updateFicheUtilisateur");
			}
		}

		return ficheUtilisateur;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(FicheUtilisateur ficheUtilisateur) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOModelFicheUtilisateur#listerFicheUtilisateur()
	 */
	@Override
	public Set<FicheUtilisateur> listFicheUtilisateur() {
		return null;
	}

	/**
	 * @return
	 */
	public List<Pays> getListePays() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param i
	 */
	public FicheUtilisateur readById(int i) {

		PreparedStatement request=null;
		String stringRequest=null;
		FicheUtilisateur ficheUtilisateur = null;

		try {
			connection=super.getConnection();
			stringRequest="SELECT * FROM FicheUtilisateur WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, i);
			result=request.executeQuery();
			System.out.println(result.toString());
			if(result.first()) {
				ficheUtilisateur = Mapper.ficheUtilisateurMapper(result);
			} else {
				ficheUtilisateur = null;
			}
		} catch(Exception e) {
			ficheUtilisateur=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelFicheUtilisateur method read");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelFicheUtilisateur method read");
			}
		}

		return ficheUtilisateur;

	}

	/**
	 * @param ficheId
	 * @return
	 */
	public FicheUtilisateur updateById(Class<FicheUtilisateur> clazz, int ficheId) {
		
		FicheUtilisateur ficheUtilisateur = new FicheUtilisateur();
		PreparedStatement request=null;
		String stringRequest=null;
		@SuppressWarnings("unused")
		int errorCode = 0;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			System.out.println(ficheUtilisateur);
			System.out.println(ficheId);
			stringRequest="UPDATE FicheUtilisateur SET adresse=?,ville=?,codepostal=?,PaysId=? WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, ficheUtilisateur.getAdresse());
			request.setString(2, ficheUtilisateur.getVille());
			request.setInt(3, ficheUtilisateur.getCodePostal());
//			request.setInt(4, ficheUtilisateur.pays.getId());
			request.setInt(5, ficheId);
			System.out.println(ficheUtilisateur);
			//ficheUtilisateur=null;
			errorCode = request.executeUpdate();
		} catch(Exception e) {
			ficheUtilisateur=null;
			errorCode = 0;
			System.out.println("Erreur dans la requête dans la classe"
					+ " DAOModelFicheUtilisateur method updateFicheUtilisateur");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données"
						+ " dans la classe DAOModelFicheUtilisateur method updateFicheUtilisateur");
			}
		}

		return ficheUtilisateur;
	}

}
