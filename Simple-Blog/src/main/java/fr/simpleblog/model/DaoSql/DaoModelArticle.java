package fr.simpleblog.model.DaoSql;

import java.util.List;
import java.util.Set;

import fr.simpleblog.beans.Article;
import fr.simpleblog.model.interfaces.IdaoModelArticle;

public class DaoModelArticle extends DaoModel implements IdaoModelArticle {


	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelArticle#createList(java.util.List)
	 */
	@Override
	public List<Article> createList(List<Article> articles) {
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelArticle#readByDate()
	 */
	@Override
	public List<Article> readByDate(int premier, int nbreParPage) {
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelArticle#countArticle()
	 */
	@Override
	public int countArticle() {
		return 0;
	}
	
	@Override
	public Article read(Class<?> clazz, int id) {
		return null;
	}

	public Article create(Article article) {
		return null;
	}

	public Article update(Article article) {
		return null;
	}

	public boolean delete(Article article) {
		return false;
	}

	public Set<Article> listArticle() {
		return null;
	}

}