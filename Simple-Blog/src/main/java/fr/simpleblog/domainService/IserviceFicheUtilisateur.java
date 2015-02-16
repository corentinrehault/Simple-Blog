/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.FicheUtilisateur;

/**
 * @author dao303
 *
 */
public interface IserviceFicheUtilisateur extends Iservice<FicheUtilisateur>{

	public Set<FicheUtilisateur> listFicheUtilisateur ();

	public FicheUtilisateur updateById (Class<FicheUtilisateur> clazz, int i);

}
