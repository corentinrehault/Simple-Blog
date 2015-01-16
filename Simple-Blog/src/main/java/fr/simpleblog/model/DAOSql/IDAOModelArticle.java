package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.Article;

public interface IDAOModelArticle extends IDAOCRUD<Article> {

	public void listerArticle();
}