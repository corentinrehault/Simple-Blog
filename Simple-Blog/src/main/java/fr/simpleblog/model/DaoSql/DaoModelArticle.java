package fr.simpleblog.model.DaoSql;

import java.util.List;
import java.util.Set;

import fr.simpleblog.beans.Article;
import fr.simpleblog.model.interfaces.IdaoModelArticle;

public class DaoModelArticle extends DaoModel implements IdaoModelArticle {

	public Article create(Article article) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#read(java.lang.Class, int)
	 */
	@Override
	public Article read(Class<?> clazz, int id) {
		// TODO Auto-generated method stub
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

	@Override
	public List<Article> createList(List<Article> articles) {
		// TODO Auto-generated method stub
		return null;
	}

}