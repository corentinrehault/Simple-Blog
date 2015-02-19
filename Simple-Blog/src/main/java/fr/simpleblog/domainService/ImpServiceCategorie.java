/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Categorie;
import fr.simpleblog.model.interfaces.IdaoModelCategorie;

/**
 * @author dao303
 *
 */
public class ImpServiceCategorie extends ImpService<Categorie> implements IserviceCategorie {

	public IdaoModelCategorie impAccessDaoCategorie;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCategorie#listerCategorie()
	 */
	@Override
	@Transactional
	public Set<Categorie> listCategorie() {
		return impAccessDaoCategorie.listCategorie();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCategorie#readCategorieByName()
	 */
	@Override
	public Categorie readCategorieByName(Categorie categorie) {
		return impAccessDaoCategorie.readCategorieByName(categorie);
	}

	/**
	 * @return the impAccessDaoCategorie
	 */
	public IdaoModelCategorie getImpAccessDaoCategorie() {
		return impAccessDaoCategorie;
	}

	/**
	 * @param impAccessDaoCategorie the impAccessDaoCategorie to set
	 */
	public void setImpAccessDaoCategorie(IdaoModelCategorie impAccessDaoCategorie) {
		this.impAccessDaoCategorie = impAccessDaoCategorie;
	}

}
