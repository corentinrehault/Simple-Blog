/**
 * 
 */
package fr.simpleblog.model.DAOSql;

import java.sql.ResultSet;
//import java.sql.SQLException;

import org.apache.log4j.Logger;

import fr.simpleblog.beans.Utilisateur;

/**
 * @author dao303
 *
 */
public class Mapper {

	final static Logger LOG = Logger.getLogger(Mapper.class);

	/**
	 * @param result
	 * @return
	 */
	public static Utilisateur utilisateurMapper(ResultSet result) {
		// orm
		Utilisateur utilisateur = new Utilisateur();

		// utilisation d'un metadataResultset qui permet d'étudier en détail le résultset

		try {

			if (result.getString("login") == "") {
				utilisateur.setLogin("");
			} else {
				utilisateur.setLogin(result.getString("login"));

			}

			if (result.getString("password") == "") {
				utilisateur.setPassword("");
			} else {
				utilisateur.setPassword(result.getString("password"));
			}

			if (result.getString("authority") == "") {
				utilisateur.setAuthority("");
			} else {
				utilisateur.setAuthority(result.getString("authority"));
			}

			if (result.getString("prenom") == "") {
				utilisateur.setPrenom("");
			} else {
				utilisateur.setPrenom(result.getString("prenom"));
			}


		} catch (Exception e) {
			utilisateur=null;
			System.out.println("Erreur lors du mapping des attributs d'un utilisateur dans la classe Mapper method utilisateurMapper");
			LOG.fatal("GRAVE ERROR IN MAPPER FOR ORM UTILISATEUR" + e);
		}

		System.out.println("--MAPPER--" + utilisateur);
		return utilisateur;

	}

}
