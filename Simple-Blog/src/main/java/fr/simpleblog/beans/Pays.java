package fr.simpleblog.beans;

public class Pays implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4209610911404888033L;

	private int id;
	private String nom;
	private String codepays;

	/**
	 * @param the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @param the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @return the codepays
	 */
	public String getCodepays() {
		return codepays;
	}

	/**
	 * @param codepays the codepays to set
	 */
	public void setCodepays(String codepays) {
		this.codepays = codepays;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pays [id=" + id + ", nom=" + nom + ", codepays=" + codepays
				+ "]";
	}
}