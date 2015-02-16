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

	public FicheUtilisateur updateById (Class<FicheUtilisateur> clazz, int i);

}
