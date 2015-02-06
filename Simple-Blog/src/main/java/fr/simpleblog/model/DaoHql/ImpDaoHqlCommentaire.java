/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.Set;

import fr.simpleblog.beans.Commentaire;
import fr.simpleblog.domainService.IserviceCommentaire;
import fr.simpleblog.model.interfaces.IdaoModelCommentaire;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlCommentaire extends ImpDaoHql<Commentaire> implements IdaoModelCommentaire, IserviceCommentaire {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelCommentaire#validerCommentaire()
	 */
	@Override
	public boolean validerCommentaire() {
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelCommentaire#listerCommentaire()
	 */
	@Override
	public Set<Commentaire> listCommentaire() {
		return null;
	}

}
