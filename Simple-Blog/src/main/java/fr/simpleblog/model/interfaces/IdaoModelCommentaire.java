package fr.simpleblog.model.interfaces;

import java.util.Set;

import fr.simpleblog.beans.Commentaire;

public interface IdaoModelCommentaire extends IdaoCrud<Commentaire> {

	public boolean validerCommentaire();

	public Set<Commentaire> listCommentaire();
}