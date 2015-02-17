/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Article;
import fr.simpleblog.model.interfaces.IdaoModelArticle;

/**
 * @author dao303
 *
 */
public class ImpServiceArticle extends ImpService<Article> implements IserviceArticle {

	public IdaoModelArticle impAccessDaoArticle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceArticle#listerArticle()
	 */
	@Override
	@Transactional
	public Set<Article> listArticle() {
		return impAccessDaoArticle.listArticle();

	}

	/**
	 * @return the impAccessDaoArticle
	 */
	public IdaoModelArticle getImpAccessDaoArticle() {
		return impAccessDaoArticle;
	}

	/**
	 * @param impAccessDaoArticle the impAccessDaoArticle to set
	 */
	public void setImpAccessDaoArticle(IdaoModelArticle impAccessDaoArticle) {
		this.impAccessDaoArticle = impAccessDaoArticle;
	}

}
