/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Commentaire;
import fr.simpleblog.model.DaoHql.ImpDaoHqlCommentaire;

/**
 * @author dao303
 *
 */
public class ImpServiceCommentaire extends ImpService<Commentaire> implements IserviceCommentaire {

	public ImpDaoHqlCommentaire impDaoHqlCommentaire;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCommentaire#validerCommentaire()
	 */
	@Override
	@Transactional
	public boolean validerCommentaire() {
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCommentaire#listerCommentaire()
	 */
	@Override
	@Transactional
	public Set<Commentaire> listCommentaire() {
		return impDaoHqlCommentaire.listCommentaire();
	}

	/**
	 * @return the impDaoHqlCommentaire
	 */
	public ImpDaoHqlCommentaire getImpDaoHqlCommentaire() {
		return impDaoHqlCommentaire;
	}

	/**
	 * @param impDaoHqlCommentaire the impDaoHqlCommentaire to set
	 */
	public void setImpDaoHqlCommentaire(ImpDaoHqlCommentaire impDaoHqlCommentaire) {
		this.impDaoHqlCommentaire = impDaoHqlCommentaire;
	}

}
