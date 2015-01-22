/**
 * 
 */
package fr.simpleblog.model.DAOSql;

import java.sql.ResultSet;
//import java.sql.SQLException;

import org.apache.log4j.Logger;

import fr.simpleblog.beans.Authority;
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

			if (result.getString("username") == "") {
				utilisateur.setUsername("");
			} else {
				utilisateur.setUsername(result.getString("username"));

			}

			if (result.getString("password") == "") {
				utilisateur.setPassword("");
			} else {
				utilisateur.setPassword(result.getString("password"));
			}

			if (result.getString("prenom") == "") {
				utilisateur.setPrenom("");
			} else {
				utilisateur.setPrenom(result.getString("prenom"));
			}

			if (result.getString("Id") == "") {
				utilisateur.setId(0);
			} else {
				utilisateur.setId(Integer.valueOf(result.getString("Id")));
			}

		} catch (Exception e) {
			utilisateur=null;
			System.out.println("Erreur lors du mapping des attributs d'un utilisateur dans la classe Mapper method utilisateurMapper");
			LOG.fatal("GRAVE ERROR IN MAPPER FOR ORM UTILISATEUR" + e);
		}

		System.out.println("--MAPPER--" + utilisateur);
		return utilisateur;

	}

	/**
	 * @param result
	 * @return
	 */
	public static Authority authorityParUtilMapper(ResultSet result) {

		Authority authority = new Authority();

		try {

			if (result.getString("AuthorityId_a_u") == "") {

				authority.setId(0);
			} else {

				authority.setId(Integer.valueOf(result.getString("AuthorityId_a_u")));
			}

		} catch (Exception e) {
			authority=null;
			System.out.println("Erreur lors du mapping des attributs d'une authority dans la classe Mapper method authorityParUtilMapper");
			LOG.fatal("GRAVE ERROR IN MAPPER FOR ORM AUTHORITYPARUTIL" + e);
		}

		System.out.println("--MAPPER--" + authority);
		return authority;
	}

	public static Authority authorityMapper(ResultSet result) {

		Authority authority = new Authority();

		try {

			if (result.getString("id") == "") {
				authority.setId(0);
			} else {
				authority.setId(Integer.valueOf(result.getString("id")));
			}

			if (result.getString("authority") == "") {
				authority.setAuthority("");
			} else {
				authority.setAuthority(result.getString("authority"));
			}

		} catch (Exception e) {
			authority=null;
			System.out.println("Erreur lors du mapping des attributs d'une authority dans la classe Mapper method authorityMapper");
			LOG.fatal("GRAVE ERROR IN MAPPER FOR ORM AUTHORITY" + e);
		}

		System.out.println("--MAPPER--" + authority);
		return authority;
	}

}
