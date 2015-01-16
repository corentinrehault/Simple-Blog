package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.Pays;

public interface IDAOModelPays extends IDAOCRUD<Pays> {

	public void listerPays();
}