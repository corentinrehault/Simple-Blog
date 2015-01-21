package fr.simpleblog.controllers;

import java.util.ArrayList;

import fr.simpleblog.beans.*;

public class AuthorityAction {
	private Authority authority;
	private ArrayList<String> authorities;

	public String listerAuthority() {
		throw new UnsupportedOperationException();
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

	public void setAuthorities(ArrayList<String> authorities) {
		this.authorities = authorities;
	}

	public ArrayList<String> getAuthorities() {
		return this.authorities;
	}
}