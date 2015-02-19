package fr.simpleblog.model.DaoSql;

import java.util.List;
import java.util.Set;

import fr.simpleblog.beans.Article;
import fr.simpleblog.model.interfaces.IdaoModelArticle;

public class DaoModelArticle extends DaoModel implements IdaoModelArticle {


	@Override
	public Article read(Class<?> clazz, int id) {
		return null;
	}

	public Article create(Article article) {
		throw new UnsupportedOperationException();
	}

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
	public List<Article> readByDate() {
		return null;
	}


	public Article update(Article article) {
		throw new UnsupportedOperationException();
	}

	public boolean delete(Article article) {
		throw new UnsupportedOperationException();
	}

	public Set<Article> listArticle() {
		throw new UnsupportedOperationException();
	}

}