/**
 * 
 */
package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.FicheUtilisateur;

/**
 * @author dao303
 *
 */
public interface IDAOModelFicheUtilisateur extends IDAOCRUD<FicheUtilisateur>{

	public void listerFicheUtilisateur ();

}
