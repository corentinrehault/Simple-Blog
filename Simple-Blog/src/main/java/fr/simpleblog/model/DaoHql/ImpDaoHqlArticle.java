/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
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
	
	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelArticle#readByDate()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> readByDate() {
		
		getSession();
		Criteria criteria = session.createCriteria(Article.class);
		criteria.addOrder(Order.desc("dateCreation"));
		return (List<Article>) criteria.list();
		
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelArticle#createList(java.util.List)
	 */
	@Override
	public List<Article> createList(List<Article> articles) {

		getSession();

		try {

			for (int i = 0; i < articles.size(); i++) {
				Article a = (Article)articles.get(i);
				System.out.println("==>" + a);
				session.save(a);
			}

			//session.flush();

		} catch (HibernateException e) {
			articles=null;
			e.printStackTrace();
		}

		return articles;

	}

}
