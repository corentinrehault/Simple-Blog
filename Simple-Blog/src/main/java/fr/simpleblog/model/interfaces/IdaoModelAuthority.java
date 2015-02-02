package fr.simpleblog.model.interfaces;

import java.util.Set;

import fr.simpleblog.beans.Authority;

public interface IdaoModelAuthority extends IdaoCrud<Authority> {

	public Set<Authority> listAuthority();
	
	public Set<Authority> listAuthorityByUserId(int i);
}