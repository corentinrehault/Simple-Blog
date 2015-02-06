package fr.simpleblog.model.interfaces;

import java.util.Set;

import fr.simpleblog.beans.Article;

public interface IdaoModelArticle extends IdaoCrud<Article> {

	public Set<Article> listArticle();
}