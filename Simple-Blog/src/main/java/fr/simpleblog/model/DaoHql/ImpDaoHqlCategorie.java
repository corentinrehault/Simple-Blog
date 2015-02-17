/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.Set;

import fr.simpleblog.beans.Categorie;
import fr.simpleblog.model.interfaces.IdaoModelCategorie;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlCategorie extends ImpDaoHql<Categorie> implements IdaoModelCategorie {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelCategorie#listerCategorie()
	 */
	@Override
	public Set<Categorie> listCategorie() {
		return null;
	}

}
