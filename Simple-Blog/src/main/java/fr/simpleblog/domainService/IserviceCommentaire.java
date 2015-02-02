package fr.simpleblog.domainService;

import fr.simpleblog.beans.Commentaire;

public interface IserviceCommentaire extends Iservice<Commentaire> {

	public void validerCommentaire();

	public void listerCommentaire();
}