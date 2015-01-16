package fr.simpleblog.controllers;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class RootController extends ActionSupport  implements Preparable,SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 468951742807560565L;


	private String login;
	private String password;

	private Map<String,Object> sessionMap;

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



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

		//		UtilTimerStack.setActive(true);
		return SUCCESS;
	}

	public String connexionUtilisateur() {

		//		UtilTimerStack.setActive(true);
		if(sessionMap instanceof SessionMap)
		{
			this.sessionMap.put("sessionlogin",login);
			this.sessionMap.put("passwordlogin",password);
		}

		return SUCCESS;
	}

	public String deconnexionUtilisateur()
	{
		this.sessionMap.clear();
		return SUCCESS;
	}



	public String utilisateurAutorite() {
		String reponse = SUCCESS;
		if (sessionMap.containsValue("toto")){
			reponse = INPUT;
		}
		return reponse;

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

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;
	}

}
