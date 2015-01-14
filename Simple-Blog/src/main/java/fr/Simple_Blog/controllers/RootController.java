package fr.Simple_Blog.controllers;

import com.opensymphony.xwork2.ActionSupport;

public class RootController extends ActionSupport {

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





}
