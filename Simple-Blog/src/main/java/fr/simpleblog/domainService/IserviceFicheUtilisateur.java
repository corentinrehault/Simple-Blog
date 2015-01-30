/**
 * 
 */
package fr.simpleblog.domainService;

import fr.simpleblog.beans.FicheUtilisateur;

/**
 * @author dao303
 *
 */
public interface IserviceFicheUtilisateur extends Iservice<FicheUtilisateur>{

	public void listerFicheUtilisateur ();

	public FicheUtilisateur readById (int i);
	
	public FicheUtilisateur updateById (FicheUtilisateur ficheUtilisateur, int i);

}
