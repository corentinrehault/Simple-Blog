package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.Article;

public interface IserviceArticle extends Iservice<Article> {

	public Set<Article> listArticle();
}