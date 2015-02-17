/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.Set;

import fr.simpleblog.beans.Article;
import fr.simpleblog.model.interfaces.IdaoModelArticle;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlArticle extends ImpDaoHql<Article> implements IdaoModelArticle {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelArticle#listerArticle()
	 */
	@Override
	public Set<Article> listArticle() {

		return null;

	}

}
