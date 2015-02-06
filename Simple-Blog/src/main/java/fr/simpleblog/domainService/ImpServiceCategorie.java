/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.Categorie;
import fr.simpleblog.model.DaoHql.ImpDaoHqlCategorie;

/**
 * @author dao303
 *
 */
public class ImpServiceCategorie extends ImpService<Categorie> implements IserviceCategorie {

	ImpDaoHqlCategorie impDaoHqlCategorie;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCategorie#listerCategorie()
	 */
	@Override
	public Set<Categorie> listCategorie() {
		return impDaoHqlCategorie.listCategorie();
	}

	/**
	 * @return the impDaoHqlCategorie
	 */
	public ImpDaoHqlCategorie getImpDaoHqlCategorie() {
		return impDaoHqlCategorie;
	}

	/**
	 * @param impDaoHqlCategorie the impDaoHqlCategorie to set
	 */
	public void setImpDaoHqlCategorie(ImpDaoHqlCategorie impDaoHqlCategorie) {
		this.impDaoHqlCategorie = impDaoHqlCategorie;
	}

}
