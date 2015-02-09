package fr.simpleblog.beans;

import java.util.*;

import org.springframework.security.core.userdetails.UserDetails;

public class Utilisateur implements UserDetails, Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9116652847523411387L;

	private String nom;
	private String prenom;
	private String username;
	private String password;
	private String mail;
	private int id;
	private String avatar;
	private String langue;

	// Les Foreign Keys ne doivent pas être présentes
	// dans les objets. Exemple :
	//private int ficheId;
	//private int styleId;

	private boolean isEnabled;
	private boolean isAccountNonExpired;
	private boolean isAccountNonLocked;
	private boolean isCredentialsNonExpired;

	public Set<Commentaire> commentaireredige ;
	public Set<Article> articleecrit;
	public FicheUtilisateur ficheUtilisateur;
	public Style style;
	public Set<Authority> authorities;

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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * @return the isEnabled
	 */
	public boolean isEnabled() {
		return isEnabled;
	}

	/**
	 * @param isEnabled the isEnabled to set
	 */
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * @return the isAccountNonExpired
	 */
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	/**
	 * @param isAccountNonExpired the isAccountNonExpired to set
	 */
	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	/**
	 * @return the isAccountNonLocked
	 */
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	/**
	 * @param isAccountNonLocked the isAccountNonLocked to set
	 */
	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	/**
	 * @return the isCredentialsNonExpired
	 */
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	/**
	 * @param isCredentialsNonExpired the isCredentialsNonExpired to set
	 */
	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	/**
	 * @return the commentaireredige
	 */
	public Set<Commentaire> getCommentaireredige() {
		return commentaireredige;
	}

	/**
	 * @param commentaireredige the commentaireredige to set
	 */
	public void setCommentaireredige(Set<Commentaire> commentaireredige) {
		this.commentaireredige = commentaireredige;
	}

	/**
	 * @return the articleecrit
	 */
	public Set<Article> getArticleecrit() {
		return articleecrit;
	}

	/**
	 * @param articleecrit the articleecrit to set
	 */
	public void setArticleecrit(Set<Article> articleecrit) {
		this.articleecrit = articleecrit;
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

	/**
	 * @return the authorities
	 */
	public Set<Authority> getAuthorities() {
		return authorities;
	}

	/**
	 * @param authorities the authorities to set
	 */
	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", username="
				+ username + ", password=" + password + ", mail=" + mail
				+ ", id=" + id + ", avatar=" + avatar + ", langue=" + langue
				+ ", isEnabled=" + isEnabled + ", isAccountNonExpired="
				+ isAccountNonExpired + ", isAccountNonLocked="
				+ isAccountNonLocked + ", isCredentialsNonExpired="
				+ isCredentialsNonExpired + ", commentaireredige="
				+ commentaireredige + ", articleecrit=" + articleecrit
				+ ", ficheUtilisateur=" + ficheUtilisateur + ", style=" + style
				+ ", authorities=" + authorities + "]";
	}

}