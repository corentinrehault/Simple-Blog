package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.Authority;

public interface IDAOModelAuthority extends IDAOCRUD<Authority> {

	public void listerAuthority();
}