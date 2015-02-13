package fr.simpleblog.beans;

public class Style implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6019152418840692507L;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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
		return "Style [nom=" + nom + ", id=" + id + "]";
	}
	
	

}