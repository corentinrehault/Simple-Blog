package fr.simpleblog.services.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagPaginator extends SimpleTagSupport {

	/**
	 * Le nombre de pages
	 */
	private int nbreDePages;
	/**
	 * Le nombre d'éléments par page
	 */
	private int nbreParPages;
	/**
	 * La page actuelle
	 */
	private int pageCourante;
	/**
	 * Le nombre total d'éléments
	 */
	private int nbreElements;
	/**
	 * Le numéro du premier élément de la page actuelle
	 */
	private int premierElementDeLaPage;
	/**
	 * Le numéro du dernier élément de la page actuelle
	 */
	private int dernierElementDeLaPage;

	private String url;


	/**
	 * @return le nombre total de pages
	 */
	public int calculNbreDePages() {

		if ((nbreElements != 0) && (nbreParPages != 0)) {

			if (nbreElements % nbreParPages != 0) {
				nbreDePages = nbreElements / nbreParPages + 1;
			} else {
				nbreDePages = nbreElements / nbreParPages;
			}

		} else {		
			nbreDePages = 1;
		}

		return nbreDePages;
	}

	/**
	 * @return le premier élément de la page
	 */
	public int calculPremierElementDeLaPage(int page) {

		premierElementDeLaPage = (page - 1) * nbreParPages;
		return premierElementDeLaPage;
	}

	public int calculDernierElementDeLaPage(int page) {

		dernierElementDeLaPage = ((page - 1) * nbreParPages) + nbreParPages -1;
		return dernierElementDeLaPage;		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
	 */
	public void doTag() throws IOException {

		if (pageCourante==0) {
			pageCourante=1;
		}

		if (nbreParPages==0) {
			nbreParPages=1;
		}

		calculNbreDePages();
		calculPremierElementDeLaPage(pageCourante);
		calculDernierElementDeLaPage(pageCourante);

		JspWriter sortie = getJspContext().getOut();

		if (nbreDePages!=1) {

			if (pageCourante!=1) {
				sortie.println("<a href=\"" + url + "?debut=" 
						+ calculPremierElementDeLaPage(pageCourante-1) 
						+ "&fin=" + calculDernierElementDeLaPage(pageCourante-1)
						+ "&nbre=" + nbreParPages 
						+ "&page=" + (pageCourante-1) +"\">PREC</a>");
			}

			if (nbreDePages>10 && pageCourante>5) {
				for (int i=pageCourante-5; i<pageCourante+5; i++) {
					sortie.println("<a href=\"" + url + "?debut="
							+ calculPremierElementDeLaPage(i) 
							+ "&fin=" + calculDernierElementDeLaPage(i)
							+ "&nbre=" + nbreParPages 
							+ "&page=" + i +"\">"+ i +"</a>");
				}
			} else if (nbreDePages>10) {
				for (int i=1; i<11; i++) {
					sortie.println("<a href=\"" + url + "?debut="
							+ calculPremierElementDeLaPage(i) 
							+ "&fin=" + calculDernierElementDeLaPage(i)
							+ "&nbre=" + nbreParPages 
							+ "&page=" + i +"\">"+ i +"</a>");
				}
			} else {
				for (int i=1; i<nbreDePages+1; i++) {
					sortie.println("<a href=\"" + url + "?debut="
							+ calculPremierElementDeLaPage(i) 
							+ "&fin=" + calculDernierElementDeLaPage(i)
							+ "&nbre=" + nbreParPages 
							+ "&page=" + i +"\">"+ i +"</a>");
				}
			}

			if (pageCourante!=nbreDePages) {
				sortie.println("<a href=\"" + url + "?debut="
						+ calculPremierElementDeLaPage(pageCourante+1) 
						+ "&fin=" + calculDernierElementDeLaPage(pageCourante+1)
						+ "&nbre=" + nbreParPages 
						+ "&page=" + (pageCourante+1) +"\">SUIV</a>");
			}
		}

	}

	/**
	 * @return the nbreDePages
	 */
	public int getNbreDePages() {
		return nbreDePages;
	}

	/**
	 * @param nbreDePages the nbreDePages to set
	 */
	public void setNbreDePages(int nbreDePages) {
		this.nbreDePages = nbreDePages;
	}

	/**
	 * @return the nbreParPages
	 */
	public int getNbreParPages() {
		return nbreParPages;
	}

	/**
	 * @param nbreParPages the nbreParPages to set
	 */
	public void setNbreParPages(int nbreParPages) {
		this.nbreParPages = nbreParPages;
	}

	/**
	 * @return the pageCourante
	 */
	public int getPageCourante() {
		return pageCourante;
	}

	/**
	 * @param pageCourante the pageCourante to set
	 */
	public void setPageCourante(int pageCourante) {
		this.pageCourante = pageCourante;
	}

	/**
	 * @return the nbreElements
	 */
	public int getNbreElements() {
		return nbreElements;
	}

	/**
	 * @param nbreElements the nbreElements to set
	 */
	public void setNbreElements(int nbreElements) {
		this.nbreElements = nbreElements;
	}

	/**
	 * @return the premierElementDeLaPage
	 */
	public int getPremierElementDeLaPage() {
		return premierElementDeLaPage;
	}

	/**
	 * @param premierElementDeLaPage the premierElementDeLaPage to set
	 */
	public void setPremierElementDeLaPage(int premierElementDeLaPage) {
		this.premierElementDeLaPage = premierElementDeLaPage;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
