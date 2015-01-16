package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import java.util.*;

public class ArticleAction {
	private Article article;
	private ArrayList<String> articles;

	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}

	/**
	 * @return the articles
	 */
	public ArrayList<String> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(ArrayList<String> articles) {
		this.articles = articles;
	}

	public void listerArticle() {
		throw new UnsupportedOperationException();
	}

	public void creerArticle() {
		throw new UnsupportedOperationException();
	}

	public void supprimerArticle() {
		throw new UnsupportedOperationException();
	}

	public void modifierArticle() {
		throw new UnsupportedOperationException();
	}
}