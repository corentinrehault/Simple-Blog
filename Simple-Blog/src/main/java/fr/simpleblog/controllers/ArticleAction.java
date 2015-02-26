package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import fr.simpleblog.domainService.IserviceArticle;

import java.util.*;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 15591032911455913L;

	/**
	 *  Log4J logger
	 */
	private static final Logger LOG = Logger.getLogger(ArticleAction.class);

	private Article article;
	private List<Article> articles;
	private int nbreArticles;
	private int premier;
	private int nbreParPage;

	private IserviceArticle impServiceArticle;

	public String afficherArticle() {
		articles = impServiceArticle.readByDate(premier, nbreParPage);
		return SUCCESS;
	}

	public String compterArticle() {
		nbreArticles = impServiceArticle.countArticle();
		LOG.error("NOMBRE D'ARTICLES DANS LA BASE = " + nbreArticles);
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
	 * @return the nbreArticles
	 */
	public int getNbreArticles() {
		return nbreArticles;
	}

	/**
	 * @param nbreArticles the nbreArticles to set
	 */
	public void setNbreArticles(int nbreArticles) {
		this.nbreArticles = nbreArticles;
	}

	/**
	 * @return the premier
	 */
	public int getPremier() {
		return premier;
	}

	/**
	 * @param premier the premier to set
	 */
	public void setPremier(int premier) {
		this.premier = premier;
	}

	/**
	 * @return the nbreParPage
	 */
	public int getNbreParPage() {
		return nbreParPage;
	}

	/**
	 * @param nbreParPage the nbreParPage to set
	 */
	public void setNbreParPage(int nbreParPage) {
		this.nbreParPage = nbreParPage;
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