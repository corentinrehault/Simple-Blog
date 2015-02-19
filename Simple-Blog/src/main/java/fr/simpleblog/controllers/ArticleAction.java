package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import fr.simpleblog.domainService.IserviceArticle;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 15591032911455913L;

	private Article article;
	private List<Article> articles;

	private IserviceArticle impServiceArticle;

	public String afficherArticle() {
		articles = impServiceArticle.readByDate();
		return SUCCESS;
	}

	public void listerArticle() {

	}

	public void creerArticle() {

	}

	public void supprimerArticle() {

	}

	public void modifierArticle() {

	}

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
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	/**
	 * @return the impServiceArticle
	 */
	public IserviceArticle getImpServiceArticle() {
		return impServiceArticle;
	}

	/**
	 * @param impServiceArticle the impServiceArticle to set
	 */
	public void setImpServiceArticle(IserviceArticle impServiceArticle) {
		this.impServiceArticle = impServiceArticle;
	}

}