package fr.simpleblog.model.DaoSql;

import java.util.Set;

import fr.simpleblog.beans.Commentaire;
import fr.simpleblog.model.interfaces.IdaoModelCommentaire;

public class DaoModelCommentaire extends DaoModel implements IdaoModelCommentaire {

	public Commentaire create(Commentaire commentaire) {
		throw new UnsupportedOperationException();
	}

	public Commentaire update(Commentaire commentaire) {
		throw new UnsupportedOperationException();
	}

	public boolean delete(Commentaire commentaire) {
		throw new UnsupportedOperationException();
	}

	public boolean validerCommentaire() {
		throw new UnsupportedOperationException();
	}

	public Set<Commentaire> listCommentaire() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#read(java.lang.Class, int)
	 */
	@Override
	public Commentaire read(Class<?> clazz, int id) {
		// TODO Auto-generated method stub
		return null;
	}
}