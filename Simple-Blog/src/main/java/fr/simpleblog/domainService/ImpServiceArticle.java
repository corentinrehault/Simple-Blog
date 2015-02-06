/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.Article;
import fr.simpleblog.model.DaoHql.ImpDaoHqlArticle;

/**
 * @author dao303
 *
 */
public class ImpServiceArticle extends ImpService<Article> implements IserviceArticle {

	ImpDaoHqlArticle impDaoHqlArticle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceArticle#listerArticle()
	 */
	@Override
	public Set<Article> listArticle() {
		return impDaoHqlArticle.listArticle();

	}

	/**
	 * @return the impDaoHqlArticle
	 */
	public ImpDaoHqlArticle getImpDaoHqlArticle() {
		return impDaoHqlArticle;
	}

	/**
	 * @param impDaoHqlArticle the impDaoHqlArticle to set
	 */
	public void setImpDaoHqlArticle(ImpDaoHqlArticle impDaoHqlArticle) {
		this.impDaoHqlArticle = impDaoHqlArticle;
	}

}
