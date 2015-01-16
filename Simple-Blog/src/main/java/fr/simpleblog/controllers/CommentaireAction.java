package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import java.util.*;

public class CommentaireAction {
	private Commentaire commentaire;
	private ArrayList<String> commentaires;

	/**
	 * @return the commentaire
	 */
	public Commentaire getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}

	/**
	 * @return the commentaires
	 */
	public ArrayList<String> getCommentaires() {
		return commentaires;
	}

	/**
	 * @param commentaires the commentaires to set
	 */
	public void setCommentaires(ArrayList<String> commentaires) {
		this.commentaires = commentaires;
	}

	public String listerCommentaire() {
		throw new UnsupportedOperationException();
	}

	public void creerCommentaire() {
		throw new UnsupportedOperationException();
	}

	public void supprimerCommentaire() {
		throw new UnsupportedOperationException();
	}

	public void modifierCommentaire() {
		throw new UnsupportedOperationException();
	}

	public void validerCommentaire() {
		throw new UnsupportedOperationException();
	}
}