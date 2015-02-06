/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.Set;

import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.domainService.IserviceFicheUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlFicheUtilisateur extends ImpDaoHql<FicheUtilisateur> implements IdaoModelFicheUtilisateur, IserviceFicheUtilisateur {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur#listerFicheUtilisateur()
	 */
	@Override
	public Set<FicheUtilisateur> listFicheUtilisateur() {
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur#readById(int)
	 */
	@Override
	public FicheUtilisateur readById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur#updateById(fr.simpleblog.beans.FicheUtilisateur, int)
	 */
	@Override
	public FicheUtilisateur updateById(FicheUtilisateur ficheUtilisateur, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
