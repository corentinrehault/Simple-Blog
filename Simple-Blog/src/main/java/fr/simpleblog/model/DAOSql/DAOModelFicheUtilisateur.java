/**
 * 
 */
package fr.simpleblog.model.DAOSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.beans.Pays;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;
import fr.simpleblog.model.interfaces.IDAOModelFicheUtilisateur;

/**
 * @author dao303
 *
 */
public class DAOModelFicheUtilisateur extends DAOModel implements IDAOModelFicheUtilisateur {
	
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
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#read(java.lang.Object)
	 */
	@Override
	public FicheUtilisateur read(FicheUtilisateur ficheUtilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;

		try {
			connection=super.getConnection();
			stringRequest="SELECT * FROM utilisateur WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, ficheUtilisateur.getId());
			System.out.println(ficheUtilisateur.getId());
			result=request.executeQuery();
			if(result!=null) {
				if(result.next()) {
					ficheUtilisateur= Mapper.ficheUtilisateurMapper(result);
				}
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
		// TODO Auto-generated method stub
		return null;
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
	public void listerFicheUtilisateur() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return
	 */
	public List<Pays> getListePays() {
		// TODO Auto-generated method stub
		return null;
	}

}
