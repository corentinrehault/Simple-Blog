package fr.simpleblog.model.DAOSql;

import java.util.Set;

import fr.simpleblog.beans.Authority;

public interface IDAOModelAuthority extends IDAOCRUD<Authority> {

	public Set<Authority> listerAuthority();
}