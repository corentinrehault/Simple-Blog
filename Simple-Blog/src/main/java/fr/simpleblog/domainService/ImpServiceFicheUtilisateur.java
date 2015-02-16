/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.model.DaoHql.ImpDaoHqlFicheUtilisateur;

/**
 * @author dao303
 *
 */
public class ImpServiceFicheUtilisateur extends ImpService<FicheUtilisateur> implements IserviceFicheUtilisateur {

	public ImpDaoHqlFicheUtilisateur impDaoHqlFicheUtilisateur;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceFicheUtilisateur#listerFicheUtilisateur()
	 */
	@Override
	@Transactional
	public Set<FicheUtilisateur> listFicheUtilisateur() {
		return impDaoHqlFicheUtilisateur.listFicheUtilisateur();
	}

	@Override
	public FicheUtilisateur updateById(Class<FicheUtilisateur> clazz, int i) {
		return impDaoHqlFicheUtilisateur.updateById(clazz, i);
	}

	/**
	 * @return the impDaoHqlFicheUtilisateur
	 */
	public ImpDaoHqlFicheUtilisateur getImpDaoHqlFicheUtilisateur() {
		return impDaoHqlFicheUtilisateur;
	}

	/**
	 * @param impDaoHqlFicheUtilisateur the impDaoHqlFicheUtilisateur to set
	 */
	public void setImpDaoHqlFicheUtilisateur(
			ImpDaoHqlFicheUtilisateur impDaoHqlFicheUtilisateur) {
		this.impDaoHqlFicheUtilisateur = impDaoHqlFicheUtilisateur;
	}

}
