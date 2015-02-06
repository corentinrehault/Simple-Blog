/**
 * 
 */
package fr.simpleblog.model.interfaces;

import java.util.Set;

import fr.simpleblog.beans.FicheUtilisateur;

/**
 * @author dao303
 *
 */
public interface IdaoModelFicheUtilisateur extends IdaoCrud<FicheUtilisateur>{

	public Set<FicheUtilisateur> listFicheUtilisateur ();

	public FicheUtilisateur readById (int i);

	public FicheUtilisateur updateById (FicheUtilisateur ficheUtilisateur, int i);

}
