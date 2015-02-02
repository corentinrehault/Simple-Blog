/**
 * 
 */
package fr.simpleblog.model.interfaces;

import fr.simpleblog.beans.FicheUtilisateur;

/**
 * @author dao303
 *
 */
public interface IdaoModelFicheUtilisateur extends IdaoCrud<FicheUtilisateur>{

	public void listerFicheUtilisateur ();

	public FicheUtilisateur readById (int i);

	public FicheUtilisateur updateById (FicheUtilisateur ficheUtilisateur, int i);

}
