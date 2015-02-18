	/**
 * 
 */
package fr.simpleblog.services.parser;


import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import fr.simpleblog.beans.Article;
import fr.simpleblog.beans.Categorie;
import fr.simpleblog.beans.Utilisateur;

/**
 * @author dao303
 *
 */
public class ArticlesHandler extends DefaultHandler {

	//résultats de notre parsing
	private List<Article> articles;
	
	private Article article;
	private Categorie categorie;
	private Utilisateur utilisateur;
	
	//flags nous indiquant la position du parser
	@SuppressWarnings("unused")
	private boolean inListearticles, inArticle, inTitre, inContenu, inDatepublication, inAuteur, inCategorie;
	
	//buffer nous permettant de récupérer les données
	private StringBuffer buffer;

	/**
	 * Simple constructeur hérité de la superclasse 
	 */
	public ArticlesHandler() {
		super();
	}

	//Détection d'ouverture de balise
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if(qName.equals("listearticles")) {

			articles = new ArrayList<Article>();
			inListearticles = true;

		} else if(qName.equals("article")) {

			article = new Article();
			inArticle = true;

		} else {

			buffer = new StringBuffer();
			if (qName.equals("titre")) {
				inTitre = true;
			} else if(qName.equals("contenu")) {
				inContenu = true;
			} else if(qName.equals("datepublication")) {
				inDatepublication = true;
			} else if(qName.equals("auteur")) {
				utilisateur = new Utilisateur();
				inAuteur = true;
			} else if(qName.equals("categorie")) {
				categorie = new Categorie();
				inCategorie = true;
			} else {
				throw new SAXException("Balise "+qName+" inconnue.");
			}

		}

	}

	//Détection de fin de balise
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void endElement(String uri, String localName, String qName) throws SAXException {

		if(qName.equals("listearticles")) {

			inListearticles = false;

		} else if(qName.equals("article")) {

			articles.add(article);
			article = null;
			inArticle = false;

		} else if(qName.equals("titre")) {

			article.setTitre(buffer.toString());
			buffer = null;
			inTitre = false;			

		} else if(qName.equals("contenu")) {

			article.setContenu(buffer.toString());
			buffer = null;
			inContenu = false;

		} else if(qName.equals("datepublication")) {

			//article.setDateCreation(buffer.toString());
			buffer = null;
			inDatepublication = false;
			
		} else if(qName.equals("auteur")) {

			utilisateur.setNom(buffer.toString());
			article.setAuteur(utilisateur);
			
			buffer = null;
			inAuteur = false;
			
		} else if(qName.equals("categorie")) {

			categorie.setNom(buffer.toString());
			article.setCategorie(categorie);
			buffer = null;
			inCategorie = false;

		} else {

			throw new SAXException("Balise "+qName+" inconnue.");

		}

	}

	//Détection de cartactères
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	public void characters(char [] ch, int start, int length) throws SAXException {
		String lecture = new String(ch, start, length);
		if(buffer != null) {
			buffer.append(lecture);
		}
	}

	//Début du parsing
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startDocument()
	 */
	public void startDocument() throws SAXException {
		System.out.println("Début du parsing");
	}

	//Fin du parsing
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#endDocument()
	 */
	public void endDocument() throws SAXException {
		System.out.println("Fin du parsing");
		//System.out.println("Résultats du parsing");
		//for(Article a : articles) {
		//System.out.println(p);
		//}
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

}
