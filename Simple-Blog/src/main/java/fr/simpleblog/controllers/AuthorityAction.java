package fr.simpleblog.controllers;

import java.util.HashSet;

import fr.simpleblog.beans.*;
import fr.simpleblog.model.DAOSql.DAOModelAuthority;

public class AuthorityAction {
	private Authority authority;
	private HashSet<Authority> authorities;

	DAOModelAuthority daoModelAuthority = new DAOModelAuthority();

	public HashSet<Authority> listerAuthority() {
		authorities = (HashSet<Authority>) daoModelAuthority.listerAuthority();
		return authorities;
	}

	public HashSet<Authority> listerAuthorityParUtil(Utilisateur utilisateur) {
		authorities = (HashSet<Authority>) daoModelAuthority.listerAuthorityParUtil(utilisateur);
		return authorities;
	}

	public void creerAuthority() {
		throw new UnsupportedOperationException();
	}

	public void supprimerAuthority() {
		throw new UnsupportedOperationException();
	}

	public void modifierAuthority() {
		throw new UnsupportedOperationException();
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	public Authority getAuthority() {
		return this.authority;
	}

	public void setAuthorities(HashSet<Authority> authorities) {
		this.authorities = authorities;
	}

	public HashSet<Authority> getAuthorities() {
		return this.authorities;
	}
}