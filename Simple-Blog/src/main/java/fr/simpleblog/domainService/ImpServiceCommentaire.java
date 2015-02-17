/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Commentaire;
import fr.simpleblog.model.interfaces.IdaoModelCommentaire;

/**
 * @author dao303
 *
 */
public class ImpServiceCommentaire extends ImpService<Commentaire> implements IserviceCommentaire {

	public IdaoModelCommentaire impAccessDaoCommentaire;

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
		return impAccessDaoCommentaire.listCommentaire();
	}

	/**
	 * @return the impAccessDaoCommentaire
	 */
	public IdaoModelCommentaire getImpAccessDaoCommentaire() {
		return impAccessDaoCommentaire;
	}

	/**
	 * @param impAccessDaoCommentaire the impAccessDaoCommentaire to set
	 */
	public void setImpAccessDaoCommentaire(
			IdaoModelCommentaire impAccessDaoCommentaire) {
		this.impAccessDaoCommentaire = impAccessDaoCommentaire;
	}

}
