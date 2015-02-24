package fr.simpleblog.services.customtags;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHead extends SimpleTagSupport {
	
	private int nbreElements;
	private int nbreParPages;
	private int nbreDePages;
	private int premierElementDeLaPage;
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

}
