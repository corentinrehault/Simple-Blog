package fr.simpleblog.model.interfaces;

import fr.simpleblog.beans.Article;

public interface IDAOModelArticle extends IDAOCRUD<Article> {

	public void listerArticle();
}