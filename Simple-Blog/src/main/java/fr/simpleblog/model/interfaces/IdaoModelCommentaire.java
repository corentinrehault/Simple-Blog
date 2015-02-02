package fr.simpleblog.model.interfaces;

import fr.simpleblog.beans.Commentaire;

public interface IdaoModelCommentaire extends IdaoCrud<Commentaire> {

	public void validerCommentaire();

	public void listerCommentaire();
}