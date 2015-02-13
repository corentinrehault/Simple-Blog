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

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceFicheUtilisateur#readById(int)
	 */
	@Override
	@Transactional
	public FicheUtilisateur readById(int i) {
		return impDaoHqlFicheUtilisateur.readById(i);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceFicheUtilisateur#updateById(fr.simpleblog.beans.FicheUtilisateur, int)
	 */
	@Override
	@Transactional
	public FicheUtilisateur updateById(FicheUtilisateur ficheUtilisateur, int i) {
		return impDaoHqlFicheUtilisateur.updateById(ficheUtilisateur, i);
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
