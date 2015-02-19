package fr.simpleblog.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import fr.simpleblog.beans.Article;
import fr.simpleblog.beans.Categorie;
import fr.simpleblog.domainService.IserviceArticle;
import fr.simpleblog.domainService.IserviceCategorie;
import fr.simpleblog.services.parser.ParsingService;

public class AdminAction extends ActionSupport {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1118609495940961301L;

	/**
	 *  Log4J logger
	 */
	private static final Logger LOG = Logger.getLogger(AdminAction.class);

	private IserviceArticle impServiceArticle;
	private IserviceCategorie impServiceCategorie;
	private List<Article> articles;
	private Categorie categorie;

	private ParsingService parsingArticles = new ParsingService();

	/**
	 * @return SUCCESS
	 */
	public String fetchArticles() {

		try {
			articles = parsingArticles.listArticles();
		} catch (MalformedURLException e) {
			LOG.error("Erreur d'URL");
			LOG.error("Dans la méthode recupererListArticles()");
			e.printStackTrace();
		} catch (IOException e) {
			LOG.error("Erreur d'entrée/sortie");
			LOG.error("Dans la méthode recupererListArticles()");
			e.printStackTrace();
		}

		LOG.error("fetchArticles : " + articles);
		for (Article a : articles) {
			LOG.error(a.getCategorie());
			categorie = impServiceCategorie.readCategorieByName(a.getCategorie());
			LOG.error(categorie);
			a.setCategorie(categorie);
			LOG.error(a.getCategorie());
		}
		impServiceArticle.createList(articles);

		return SUCCESS;
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

	/**
	 * @return the impServiceCategorie
	 */
	public IserviceCategorie getImpServiceCategorie() {
		return impServiceCategorie;
	}

	/**
	 * @param impServiceCategorie the impServiceCategorie to set
	 */
	public void setImpServiceCategorie(IserviceCategorie impServiceCategorie) {
		this.impServiceCategorie = impServiceCategorie;
	}

}
