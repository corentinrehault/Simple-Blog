package fr.simpleblog.model.DaoSql;

import java.util.Set;

import fr.simpleblog.beans.Categorie;
import fr.simpleblog.model.interfaces.IdaoModelCategorie;

public class DaoModelCategorie extends DaoModel implements IdaoModelCategorie {

	public Categorie create(Categorie categorie) {
		throw new UnsupportedOperationException();
	}

	public Categorie read(Categorie categorie) {
		throw new UnsupportedOperationException();
	}

	public Categorie update(Categorie categorie) {
		throw new UnsupportedOperationException();
	}

	public boolean delete(Categorie categorie) {
		throw new UnsupportedOperationException();
	}

	public Set<Categorie> listCategorie() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#read(java.lang.Class, int)
	 */
	@Override
	public Categorie read(Class<?> clazz, int id) {
		// TODO Auto-generated method stub
		return null;
	}
}