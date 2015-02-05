/**
 * 
 */
package fr.simpleblog.beans;

import java.io.Serializable;

/**
 * @author dao303
 *
 */
public class HibernateTestBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5476066501765213576L;

	private int id;
	
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HibernateTestBean [id=" + id + ", name=" + name + "]";
	}
	
	

}
