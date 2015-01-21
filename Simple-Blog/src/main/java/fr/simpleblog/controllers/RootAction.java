package fr.simpleblog.controllers;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class RootAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4448517924375834371L;
	private Date dateAujourdhui;

	public void recupererListePays() {
		throw new UnsupportedOperationException();
	}

	public void recupererArticle() {
		throw new UnsupportedOperationException();
	}

	public void recupererStylepardefaut() {
		throw new UnsupportedOperationException();
	}

	public void changerStylepardefaut() {
		throw new UnsupportedOperationException();
	}

	public void changerLangue() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return SUCCESS
	 * 
	 * méthode pour accéder à l'index
	 * 
	 */
	public String initApplication() {
		//dateAujourdhui();
		return SUCCESS;
	}

	public void dateAujourdhui() {
		setDateAujourdhui(new Date());
		//return SUCCESS;
	}

	/**
	 * @return the dateAujourdhui
	 */
	public Date getDateAujourdhui() {
		return dateAujourdhui;
	}

	/**
	 * @param dateAujourdhui the dateAujourdhui to set
	 */
	public void setDateAujourdhui(Date dateAujourdhui) {
		this.dateAujourdhui = dateAujourdhui;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 * 
	 *  Permet d'afficher la pile d'interception
	 * dans la console
	 * 
	 */
	@Override
	public void prepare() throws Exception {
		UtilTimerStack.setActive(true);
	}
}