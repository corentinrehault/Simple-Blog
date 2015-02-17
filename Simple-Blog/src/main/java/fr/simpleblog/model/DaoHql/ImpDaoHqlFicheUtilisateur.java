/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.Set;

import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlFicheUtilisateur extends ImpDaoHql<FicheUtilisateur> implements IdaoModelFicheUtilisateur {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur#listerFicheUtilisateur()
	 */
	@Override
	public Set<FicheUtilisateur> listFicheUtilisateur() {
		return null;
	}

	@Override
	public FicheUtilisateur updateById(Class<FicheUtilisateur> clazz, int i) {
		return null;
	}

}
