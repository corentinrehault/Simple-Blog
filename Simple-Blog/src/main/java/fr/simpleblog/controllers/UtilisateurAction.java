package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import fr.simpleblog.controllers.othercontrollers.UtilisateurAware;
import fr.simpleblog.model.DAOSql.DAOModelUtilisateur;

import java.util.*;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

/*
 * Pour afficher la pile d'interception dans la console
 */

import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class UtilisateurAction extends ActionSupport implements Preparable,SessionAware, UtilisateurAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6018595130219853453L;

	private Utilisateur utilisateur;
	private ArrayList<Utilisateur> utilisateurs;
	private String login;
	private String password;
	private Map<String,Object> sessionMap;

	DAOModelUtilisateur daoModelUtilisateur=new DAOModelUtilisateur();



	public List<Utilisateur> listerUtilisateur() {

		utilisateurs=(ArrayList<Utilisateur>)daoModelUtilisateur.listerUtilisateur();

		return utilisateurs;
	}

	/**
	 * @return SUCCESS
	 */
	public String supprimerUtilisateur() {

		daoModelUtilisateur.delete();
		return SUCCESS;
	}

	public String ajouterUtilisateur() {

		daoModelUtilisateur.create();
		return SUCCESS;
	}

	public String modifierUtilisateur() {

		daoModelUtilisateur.update();
		return SUCCESS;
	}

	/**
	 * @return SUCCESS
	 * 
	 * 
	 */
	public String connecterUtilisateur(Utilisateur utilisateur) {

		daoModelUtilisateur.login(utilisateur);

		//		if(sessionMap instanceof SessionMap)
		//		{
		//			this.sessionMap.put("sessionlogin",login);
		//		}
		return SUCCESS;
	}

	/**
	 * @return
	 */
	public String changerStyle() {
		return SUCCESS;
	}

	/**
	 * @return SUCCESS
	 * 
	 * déconnecte l'utilisateur en nettoyant la Map
	 */
	public String deconnecterUtilisateur() {

		this.sessionMap.clear();

		System.err.println("========> "+ sessionMap.isEmpty());

		return SUCCESS;
	}

	public void envoyerMailUtilisateur() {
		throw new UnsupportedOperationException();
	}

	public void changerStylepardefaut() {
		throw new UnsupportedOperationException();
	}

	public void listerAvatar() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return autorité de l'utilisateur
	 */
	public String utilisateurAutorite() {
		String reponse = INPUT;
		if (sessionMap.containsValue("admin")){
			reponse = SUCCESS;
		}
		return reponse;
	}

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the utilisateurs
	 */
	public ArrayList<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	/**
	 * @param utilisateurs the utilisateurs to set
	 */
	public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

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

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;
	}


	//	/* (non-Javadoc)
	//	 * @see com.opensymphony.xwork2.Preparable#prepare()
	//	 */
	//	@Override
	//	public void prepare() throws Exception {
	//		DAOModelUtilisateur daoModelUtilisateur = new DAOModelUtilisateur();
	//
	//		if(idUtilisateurEnCours==0) {
	//			utilisateur=new Utilisateur();
	//		} else {
	//			utilisateur=daoModelUtilisateur.read(idUtilisateurEnCours);
	//		}
	//	}

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