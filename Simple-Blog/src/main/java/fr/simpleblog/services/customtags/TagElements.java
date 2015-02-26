package fr.simpleblog.services.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagElements extends SimpleTagSupport {

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
	 * @param page
	 * @return le premier élément de la page actuelle
	 */
	public int calculPremierElementDeLaPage(int page) {

		premierElementDeLaPage = (page - 1) * nbreParPages;
		return premierElementDeLaPage;
	}

	/**
	 * @param page
	 * @return le dernier élément de la page actuelle
	 */
	public int calculDernierElementDeLaPage(int page) {

		dernierElementDeLaPage = ((page - 1) * nbreParPages) + nbreParPages -1;
		return dernierElementDeLaPage;		
	}

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

		sortie.println("Nombre d'articles = " + nbreElements + "<br />" + 
				"Nombre de pages = " + nbreDePages + "<br />" + 
				"Premier élément dans la page = " + premierElementDeLaPage + "<br />" +
				"Page actuelle = " + pageCourante + "<br />");

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
	 * @return the dernierElementDeLaPage
	 */
	public int getDernierElementDeLaPage() {
		return dernierElementDeLaPage;
	}

	/**
	 * @param dernierElementDeLaPage the dernierElementDeLaPage to set
	 */
	public void setDernierElementDeLaPage(int dernierElementDeLaPage) {
		this.dernierElementDeLaPage = dernierElementDeLaPage;
	}

}
