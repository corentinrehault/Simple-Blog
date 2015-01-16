package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;

import java.util.*;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class UtilisateurAction extends ActionSupport implements Preparable,SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6018595130219853453L;

	private Utilisateur utilisateur;
	private ArrayList<String> utilisateurs;
	private String login;
	private String password;

	private Map<String,Object> sessionMap;

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
	public ArrayList<String> getUtilisateurs() {
		return utilisateurs;
	}

	/**
	 * @param utilisateurs the utilisateurs to set
	 */
	public void setUtilisateurs(ArrayList<String> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public void listerUtilisateur() {
		throw new UnsupportedOperationException();
	}

	public void supprimerUtilisateur() {
		throw new UnsupportedOperationException();
	}

	public String ajouterUtilisateur() {
		return SUCCESS;
	}

	public void modifierUtilisateur() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return SUCCESS
	 * 
	 * 
	 */
	public String connecterUtilisateur() {
		if(sessionMap instanceof SessionMap)
		{
			this.sessionMap.put("sessionlogin",login);
			this.sessionMap.put("passwordlogin",password);
			this.sessionMap.put("authentifie", true);
		}
		return SUCCESS;
	}

	public void changerStyle() {
		throw new UnsupportedOperationException();
	}

	public String deconnecterUtilisateur() {
		this.sessionMap.clear();
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
		String reponse = SUCCESS;
		if (sessionMap.containsValue("toto")){
			reponse = INPUT;
		}
		return reponse;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;
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