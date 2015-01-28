package fr.simpleblog.beans;

public class Categorie implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2827747845208416484L;

	private String nom;
	private int id;

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categorie [nom=" + nom + ", id=" + id + "]";
	}

}