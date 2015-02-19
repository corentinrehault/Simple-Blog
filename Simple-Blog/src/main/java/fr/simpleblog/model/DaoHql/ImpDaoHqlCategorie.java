/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

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

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelCategorie#readCategorieByName()
	 */
	@Override
	public Categorie readCategorieByName(Categorie categorie) {
		
		getSession();
		Criteria criteria = session.createCriteria(Categorie.class);		

		if (categorie.getNom()!=null) {
			criteria.add(Restrictions.like("nom", categorie.getNom()));
			return (Categorie) criteria.uniqueResult();
		} else {
			return categorie;
		}

		
	}

}
