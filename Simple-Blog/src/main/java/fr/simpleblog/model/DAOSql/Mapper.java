/**
 * 
 */
package fr.simpleblog.model.DAOSql;

import java.sql.ResultSet;
import java.sql.SQLException;









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

		} catch (SQLException e) {

			LOG.fatal("GRAVE ERROR IN MAPPER FOR ORM UTILISATEUR" + e);
		}


		return utilisateur;
	}

}
