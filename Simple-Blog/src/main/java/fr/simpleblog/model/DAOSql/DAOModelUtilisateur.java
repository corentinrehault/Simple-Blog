package fr.simpleblog.model.DAOSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;

public class DAOModelUtilisateur extends DAOModel implements IDAOModelUtilisateur {

	Connection connection=null;
	ResultSet result=null;

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#create(int)
	 */
	public Utilisateur create() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#read(int)
	 */
	@SuppressWarnings("null")
	public Utilisateur read() {
		PreparedStatement request=null;
		Utilisateur utilisateur = null;
		String stringRequest=null;

		try {
			connection=super.getConnection();
			stringRequest="SELET * FROM utilisateur WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, utilisateur.getId());
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
	public Utilisateur update() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOCRUD#delete(int)
	 */
	public Utilisateur delete() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.IDAOModelUtilisateur#listerUtilisateur()
	 */
	public List<Utilisateur> listerUtilisateur() {
		throw new UnsupportedOperationException();
	}


	/**
	 * @param utilisateur
	 */
	public Utilisateur login(Utilisateur utilisateur) {
		PreparedStatement request=null;
		String stringRequest=null;

		try {
			connection=super.getConnection();
			stringRequest="SELECT * FROM utilisateur WHERE login=? AND password=?";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, utilisateur.getLogin());
			request.setString(2, utilisateur.getPassword());

			result=request.executeQuery();

			if(result!=null) {

				if(result.first()) {
					utilisateur = Mapper.utilisateurMapper(result);
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

}