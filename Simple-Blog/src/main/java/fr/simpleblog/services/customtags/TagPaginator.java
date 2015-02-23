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
	 * La page actuelle récupérée
	 */
	private String pageCourante;

	/**
	 * La page actuelle
	 */
	private int pageCouranteNum;
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

	private String url = "";

	private StringBuffer buffer;


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
	public int calculPremierElementDeLaPage() {

		premierElementDeLaPage = (pageCouranteNum-1) * nbreParPages;
		return premierElementDeLaPage;
	}

	public int calculDernierElementDeLaPage() {

		dernierElementDeLaPage = premierElementDeLaPage + nbreParPages -1;
		return dernierElementDeLaPage;		
	}

	public String urlAppend() {

		//Ajout des paramètres debut, fin et page

		return url;

	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
	 */
	public void doTag() throws IOException {

		if (pageCourante=="") {
			pageCouranteNum=1;
		} else {
			pageCouranteNum = Integer.parseInt(pageCourante);
		}

		calculNbreDePages();
		calculPremierElementDeLaPage();
		calculDernierElementDeLaPage();
		urlAppend();



		JspWriter sortie = getJspContext().getOut();
		sortie.println("Nombre d'articles = " + nbreElements + " Nombre de pages = " + nbreDePages + " Premier élément dans la page = " + premierElementDeLaPage );


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
	public String getPageCourante() {
		return pageCourante;
	}

	/**
	 * @param pageCourante the pageCourante to set
	 */
	public void setPageCourante(String pageCourante) {
		this.pageCourante = pageCourante;
	}

	/**
	 * @return the pageCouranteNum
	 */
	public int getPageCouranteNum() {
		return pageCouranteNum;
	}

	/**
	 * @param pageCouranteNum the pageCouranteNum to set
	 */
	public void setPageCouranteNum(int pageCouranteNum) {
		this.pageCouranteNum = pageCouranteNum;
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

	/**
	 * @return the buffer
	 */
	public StringBuffer getBuffer() {
		return buffer;
	}

	/**
	 * @param buffer the buffer to set
	 */
	public void setBuffer(StringBuffer buffer) {
		this.buffer = buffer;
	}

}
