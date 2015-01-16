package fr.simpleblog.controllers;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class RootAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4448517924375834371L;

	public void recupererListePays() {
		throw new UnsupportedOperationException();
	}

	public void recupererArticle() {
		throw new UnsupportedOperationException();
	}

	public void recupererStylepardefaut() {
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
		return SUCCESS;
	}

	public void dateAujourdhui() {
		throw new UnsupportedOperationException();
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