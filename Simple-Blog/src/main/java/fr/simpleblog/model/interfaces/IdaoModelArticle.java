package fr.simpleblog.model.interfaces;

import java.util.List;
import java.util.Set;

import fr.simpleblog.beans.Article;

public interface IdaoModelArticle extends IdaoCrud<Article> {

	public Set<Article> listArticle();

	public List<Article> createList(List<Article> articles);

	public List<Article> readByDate(int premier, int nbreParPage);

	/**
	 * @return le nombre d'articles
	 */
	public int countArticle();

}