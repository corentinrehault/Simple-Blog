package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.Authority;

public interface IserviceAuthority extends Iservice<Authority> {

	public Set<Authority> listAuthority();
	
	public Set<Authority> listAuthorityByUserId(int i);
}