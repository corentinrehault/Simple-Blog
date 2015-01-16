package fr.simpleblog.beans;

import java.util.*;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String mail;
	private int id;
	private String avatar;
	private String langue;
	private String authority;
	public HashSet<Commentaire> commentaireredige = new HashSet<Commentaire>();
	public HashSet<Article> articleecrit = new HashSet<Article>();
	public FicheUtilisateur ficheUtilisateur;
	public Style style;

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return this.login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return this.mail;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getLangue() {
		return this.langue;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return this.authority;
	}
}