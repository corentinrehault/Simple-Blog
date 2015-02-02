package fr.simpleblog.controllers;

import java.util.HashSet;

import fr.simpleblog.beans.*;
import fr.simpleblog.model.DaoSql.DaoModelAuthority;

public class AuthorityAction {
	
	private Authority authority;
	private HashSet<Authority> authorities;

	DaoModelAuthority daoModelAuthority = new DaoModelAuthority();

	public HashSet<Authority> listAuthority() {
		authorities = (HashSet<Authority>) daoModelAuthority.listAuthority();
		return authorities;
	}

	public HashSet<Authority> listAuthorityByUserId(int i) {
		authorities = (HashSet<Authority>) daoModelAuthority.listAuthorityByUserId(i);
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