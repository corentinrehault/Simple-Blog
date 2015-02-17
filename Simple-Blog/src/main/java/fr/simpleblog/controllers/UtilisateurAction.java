package fr.simpleblog.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import fr.simpleblog.domainService.IserviceStyle;
import fr.simpleblog.domainService.IserviceUtilisateur;

/*
 * Pour afficher la pile d'interception dans la console
 */
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;



public class UtilisateurAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6018595130219853453L;

	private Utilisateur utilisateur;
	private ArrayList<Utilisateur> utilisateurs;
	private HashSet<Interet> interets = new HashSet<Interet>();
	private Set<Authority> authorities;

	private String username;
	private String password;
	private String prenom;
	private String nom;
	private String mail;

	private FicheUtilisateur ficheUtilisateur;
	private Style style;
	private Pays pays;

	private IserviceUtilisateur impServiceUtilisateur;
	private IserviceAuthority impServiceAuthority;
	private IserviceFicheUtilisateur impServiceFicheUtilisateur;
	private IserviceStyle impServiceStyle;

	/**
	 * @return utilisateurs
	 */
	public List<Utilisateur> listerUtilisateur() {

		utilisateurs = (ArrayList<Utilisateur>) impServiceUtilisateur.listUtilisateur();
		return utilisateurs;
	}

	/**
	 * @return SUCCESS
	 */
	public String supprimerUtilisateur() {

		boolean ok = false;
		ok = impServiceUtilisateur.delete(utilisateur);
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

		utilisateur = impServiceUtilisateur.create(utilisateur);
		return SUCCESS;
	}

	



	// OBSOLETE SUITE A L'UTILISATION DE SPRING SECURITY

	//	/**
	//	 * @return SUCCESS
	//	 */
	//	public String connecterUtilisateur() {
	//
	//
	//		utilisateur = daoModelUtilisateur.login(utilisateur);
	//
	//		//System.out.println(utilisateur.toString());
	//
	//		if (utilisateur != null) {
	//
	//			utilisateur.setPassword(null);
	//			this.sessionMap.put("login", utilisateur.getUsername());
	//			this.sessionMap.put("prenom", utilisateur.getPrenom());
	//			this.sessionMap.put("nom", utilisateur.getNom());
	//			this.sessionMap.put("mail", utilisateur.getMail());		
	//			this.sessionMap.put("ficheId", utilisateur.ficheUtilisateur.getId());
	//			this.sessionMap.put("styleId", utilisateur.style.getId());
	//
	//			authorities = daoModelAuthority.listAuthorityByUserId(utilisateur.getId());
	//
	//			if (authorities != null) {
	//				authorities.iterator();
	//				System.out.println(authorities);
	//				for(Authority a : authorities) {
	//					this.sessionMap.put("authority"+a.getAuthority(),a.getAuthority());
	//				}
	//			}
	//
	//		}
	//
	//		return SUCCESS;
	//	}

	/**
	 * @return
	 */
	public String changerStyle() {
		return SUCCESS;
	}

	// OBSOLETE SUITE A L'UTILISATION DE SPRING SECURITY

	//	/**
	//	 * @return SUCCESS
	//	 * 
	//	 * déconnecte l'utilisateur en nettoyant la Map
	//	 */
	//	public String deconnecterUtilisateur() {
	//
	//		this.sessionMap.clear();
	//
	//		System.err.println("========> "+ sessionMap.isEmpty());
	//
	//		return SUCCESS;
	//	}

	public void envoyerMailUtilisateur() {
		throw new UnsupportedOperationException();
	}

	public void listerAvatar() {
		throw new UnsupportedOperationException();
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
	public String getUsername() {
		return username;
	}

	/**
	 * @param login the login to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @return the impServiceUtilisateur
	 */
	public IserviceUtilisateur getImpServiceUtilisateur() {
		return impServiceUtilisateur;
	}

	/**
	 * @param impServiceUtilisateur the impServiceUtilisateur to set
	 */
	public void setImpServiceUtilisateur(IserviceUtilisateur impServiceUtilisateur) {
		this.impServiceUtilisateur = impServiceUtilisateur;
	}

	/**
	 * @return the impServiceAuthority
	 */
	public IserviceAuthority getImpServiceAuthority() {
		return impServiceAuthority;
	}

	/**
	 * @param impServiceAuthority the impServiceAuthority to set
	 */
	public void setImpServiceAuthority(IserviceAuthority impServiceAuthority) {
		this.impServiceAuthority = impServiceAuthority;
	}

	/**
	 * @return the impServiceFicheUtilisateur
	 */
	public IserviceFicheUtilisateur getImpServiceFicheUtilisateur() {
		return impServiceFicheUtilisateur;
	}

	/**
	 * @param impServiceFicheUtilisateur the impServiceFicheUtilisateur to set
	 */
	public void setImpServiceFicheUtilisateur(
			IserviceFicheUtilisateur impServiceFicheUtilisateur) {
		this.impServiceFicheUtilisateur = impServiceFicheUtilisateur;
	}

	/**
	 * @return the impServiceStyle
	 */
	public IserviceStyle getImpServiceStyle() {
		return impServiceStyle;
	}

	/**
	 * @param impServiceStyle the impServiceStyle to set
	 */
	public void setImpServiceStyle(IserviceStyle impServiceStyle) {
		this.impServiceStyle = impServiceStyle;
	}

}