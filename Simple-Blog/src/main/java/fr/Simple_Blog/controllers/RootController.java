package fr.Simple_Blog.controllers;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class RootController extends ActionSupport implements Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 468951742807560565L;



	private String test;


	/* Struts Methods */


	public String initApplication() {



		System.err.println("<================== initApplication ==================>");

		setTest("oooooooooooooooooooooooooooooo");

		return SUCCESS;
	}

	public String initApplication2() {



		System.err.println("<================== initApplication ==================>");

		setTest("aaaaaaaaaaaaaaaaaaaaaaaaa");

		return SUCCESS;
	}

	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}


	public String ajouterUtilisateur() {

		UtilTimerStack.setActive(true);
		return SUCCESS;
	}

	public String connexionUtilisateur() {

		UtilTimerStack.setActive(true);
		return SUCCESS;
	}
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 * 
	 * Permet d'afficher la pile d'interception
	 * dans la console
	 * 
	 */
	@Override
	public void prepare() throws Exception {
		UtilTimerStack.setActive(true);

	}


}
