package fr.simpleblog.domainService;

import fr.simpleblog.beans.Article;

public interface IserviceArticle extends Iservice<Article> {

	public void listerArticle();
}