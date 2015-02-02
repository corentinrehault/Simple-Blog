package fr.simpleblog.model.interfaces;

import fr.simpleblog.beans.Article;

public interface IdaoModelArticle extends IdaoCrud<Article> {

	public void listerArticle();
}