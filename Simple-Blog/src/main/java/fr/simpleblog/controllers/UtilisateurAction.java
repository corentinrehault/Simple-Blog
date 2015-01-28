package fr.simpleblog.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.domainService.IserviceUtilisateur;
import fr.simpleblog.model.DAOSql.DAOModelAuthority;


/*
 * Pour afficher la pile d'interception dans la console
 */
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class UtilisateurAction extends ActionSupport implements Preparable,SessionAware  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6018595130219853453L;

	private Utilisateur utilisateur;
	private ArrayList<Utilisateur> utilisateurs;
	private String login;
	private String password;
	private Map<String,Object> sessionMap;
	private String prenom;
	private Set<Authority> authorities;
	private String nom;
	private String mail;

	IserviceUtilisateur daoModelUtilisateur;
	DAOModelAuthority daoModelAuthority;

	/**
	 * @return utilisateurs
	 */
	public List<Utilisateur> listerUtilisateur() {

		utilisateurs = (ArrayList<Utilisateur>) daoModelUtilisateur.listerUtilisateur();
		return utilisateurs;
	}

	/**
	 * @return SUCCESS
	 */
	public String supprimerUtilisateur() {

		boolean ok = false;
		ok = daoModelUtilisateur.delete(utilisateur);
		if (ok) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	/**
	 * @return
	 */
	public String ajouterUtilisateur() {

		utilisateur = daoModelUtilisateur.create(utilisateur);
		return SUCCESS;
	}

	/**
	 * @return
	 */
	public String modifierUtilisateur() {

		utilisateur = daoModelUtilisateur.update(utilisateur);
		return SUCCESS;
	}

	/**
	 * @return SUCCESS
	 */
	public String connecterUtilisateur() {

		utilisateur = daoModelUtilisateur.login(utilisateur);

		if (utilisateur != null) {

			utilisateur.setPassword(null);
			this.sessionMap.put("login",utilisateur.getUsername());
			this.sessionMap.put("prenom",utilisateur.getPrenom());
			this.sessionMap.put("id", utilisateur.getId());
			this.sessionMap.put("nom", utilisateur.getNom());
			this.sessionMap.put("mail", utilisateur.getMail());
			this.sessionMap.put("ficheId", utilisateur.getFicheId());

			authorities = daoModelAuthority.listerAuthorityParUtil(utilisateur);

			if (authorities != null) {
				authorities.iterator();
				System.out.println(authorities.iterator());
				this.sessionMap.put("authority"+authorities.iterator().next().getAuthority(),authorities.iterator().next().getAuthority());
			}

		}

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

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the authority
	 */
	public Set<Authority> getAuthorities() {
		return authorities;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
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



	/**
	 * @return the daoModelAuthority
	 */
	public DAOModelAuthority getDaoModelAuthority() {
		return daoModelAuthority;
	}

	/**
	 * @param daoModelAuthority the daoModelAuthority to set
	 */
	public void setDaoModelAuthority(DAOModelAuthority daoModelAuthority) {
		this.daoModelAuthority = daoModelAuthority;
	}

	/**
	 * @return the daoModelUtilisateur
	 */
	public IserviceUtilisateur getDaoModelUtilisateur() {
		return daoModelUtilisateur;
	}

	/**
	 * @param daoModelUtilisateur the daoModelUtilisateur to set
	 */
	public void setDaoModelUtilisateur(IserviceUtilisateur daoModelUtilisateur) {
		this.daoModelUtilisateur = daoModelUtilisateur;
	}

}