package fr.simpleblog.model.DAOSql;

import java.util.List;

import fr.simpleblog.beans.Pays;

public interface IDAOModelPays extends IDAOCRUD<Pays> {

	public List<Pays> listerPays();
}