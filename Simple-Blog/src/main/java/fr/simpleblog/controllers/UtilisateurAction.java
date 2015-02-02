package fr.simpleblog.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.beans.Interet;
import fr.simpleblog.beans.Pays;
import fr.simpleblog.beans.Style;
import fr.simpleblog.beans.Utilisateur;

import fr.simpleblog.domainService.IserviceAuthority;
import fr.simpleblog.domainService.IserviceFicheUtilisateur;
import fr.simpleblog.domainService.IservicePays;
import fr.simpleblog.domainService.IserviceStyle;
import fr.simpleblog.domainService.IserviceUtilisateur;

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
	private HashSet<Interet> interets = new HashSet<Interet>();
	private Set<Authority> authorities;

	private String login;
	private String password;
	private String prenom;
	private String nom;
	private String mail;

	private Map<String,Object> sessionMap;

	public FicheUtilisateur ficheUtilisateur;
	public Style style;
	public Pays pays;

	public IserviceUtilisateur daoModelUtilisateur;
	public IserviceAuthority daoModelAuthority;
	public IserviceFicheUtilisateur daoModelFicheUtilisateur;
	public IserviceStyle daoModelStyle;
	public IservicePays daoModelPays;

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
		pays = daoModelPays.readByName(ficheUtilisateur.pays.getNom());
		ficheUtilisateur = daoModelFicheUtilisateur.updateById(ficheUtilisateur, (int) sessionMap.get("ficheId"));

		return SUCCESS;
	}

	/**
	 * @return SUCCESS
	 */
	public String connecterUtilisateur() {

		
		utilisateur = daoModelUtilisateur.login(utilisateur);

		//System.out.println(utilisateur.toString());

		if (utilisateur != null) {

			utilisateur.setPassword(null);
			this.sessionMap.put("login", utilisateur.getUsername());
			this.sessionMap.put("prenom", utilisateur.getPrenom());
			this.sessionMap.put("nom", utilisateur.getNom());
			this.sessionMap.put("mail", utilisateur.getMail());		
			this.sessionMap.put("ficheId", utilisateur.ficheUtilisateur.getId());
			this.sessionMap.put("styleId", utilisateur.style.getId());

			authorities = daoModelAuthority.listAuthorityByUserId(utilisateur.getId());

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

	/**
	 * @return the sessionMap
	 */
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	/**
	 * @param sessionMap the sessionMap to set
	 */
	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	/**
	 * @return the interets
	 */
	public HashSet<Interet> getInterets() {
		return interets;
	}

	/**
	 * @param interets the interets to set
	 */
	public void setInterets(HashSet<Interet> interets) {
		this.interets = interets;
	}

	/**
	 * @param authorities the authorities to set
	 */
	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	/**
	 * @return the ficheUtilisateur
	 */
	public FicheUtilisateur getFicheUtilisateur() {
		return ficheUtilisateur;
	}

	/**
	 * @param ficheUtilisateur the ficheUtilisateur to set
	 */
	public void setFicheUtilisateur(FicheUtilisateur ficheUtilisateur) {
		this.ficheUtilisateur = ficheUtilisateur;
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

	/**
	 * @return the style
	 */
	public Style getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(Style style) {
		this.style = style;
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



	/**
	 * @return the daoModelAuthority
	 */
	public IserviceAuthority getDaoModelAuthority() {
		return daoModelAuthority;
	}

	/**
	 * @param daoModelAuthority the daoModelAuthority to set
	 */
	public void setDaoModelAuthority(IserviceAuthority daoModelAuthority) {
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

	/**
	 * @return the daoModelFicheUtilisateur
	 */
	public IserviceFicheUtilisateur getDaoModelFicheUtilisateur() {
		return daoModelFicheUtilisateur;
	}

	/**
	 * @param daoModelFicheUtilisateur the daoModelFicheUtilisateur to set
	 */
	public void setDaoModelFicheUtilisateur(
			IserviceFicheUtilisateur daoModelFicheUtilisateur) {
		this.daoModelFicheUtilisateur = daoModelFicheUtilisateur;
	}

	/**
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * @return the daoModelStyle
	 */
	public IserviceStyle getDaoModelStyle() {
		return daoModelStyle;
	}

	/**
	 * @param daoModelStyle the daoModelStyle to set
	 */
	public void setDaoModelStyle(IserviceStyle daoModelStyle) {
		this.daoModelStyle = daoModelStyle;
	}

	/**
	 * @return the daoModelPays
	 */
	public IservicePays getDaoModelPays() {
		return daoModelPays;
	}

	/**
	 * @param daoModelPays the daoModelPays to set
	 */
	public void setDaoModelPays(IservicePays daoModelPays) {
		this.daoModelPays = daoModelPays;
	}

}