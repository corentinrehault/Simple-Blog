package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.Commentaire;

public interface IDAOModelCommentaire extends IDAOCRUD<Commentaire> {

	public void validerCommentaire();

	public void listerCommentaire();
}