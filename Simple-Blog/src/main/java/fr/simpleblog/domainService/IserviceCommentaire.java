package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.Commentaire;

public interface IserviceCommentaire extends Iservice<Commentaire> {

	public boolean validerCommentaire();

	public Set<Commentaire> listCommentaire();
}