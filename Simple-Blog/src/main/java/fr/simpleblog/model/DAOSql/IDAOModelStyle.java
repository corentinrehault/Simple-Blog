package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.Style;

public interface IDAOModelStyle extends IDAOCRUD<Style> {

	public void listerStyle();
}