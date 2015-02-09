package fr.simpleblog.beans;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

public class Authority  implements GrantedAuthority, Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7662907453041660508L;

	private String authority;
	private int id;

	public Set<Utilisateur> utilisateurs;



	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * @return the utilisateurs
	 */
	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	/**
	 * @param utilisateurs the utilisateurs to set
	 */
	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Authority [authority=" + authority + ", id=" + id + "]";
	}

}