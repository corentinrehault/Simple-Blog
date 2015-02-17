/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur;

/**
 * @author dao303
 *
 */
public class ImpServiceFicheUtilisateur extends ImpService<FicheUtilisateur> implements IserviceFicheUtilisateur {

	public IdaoModelFicheUtilisateur impAccessDaoFicheUtilisateur;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceFicheUtilisateur#listerFicheUtilisateur()
	 */
	@Override
	@Transactional
	public Set<FicheUtilisateur> listFicheUtilisateur() {
		return impAccessDaoFicheUtilisateur.listFicheUtilisateur();
	}

	@Override
	public FicheUtilisateur updateById(Class<FicheUtilisateur> clazz, int i) {
		return impAccessDaoFicheUtilisateur.updateById(clazz, i);
	}

	/**
	 * @return the impAccessDaoFicheUtilisateur
	 */
	public IdaoModelFicheUtilisateur getImpAccessDaoFicheUtilisateur() {
		return impAccessDaoFicheUtilisateur;
	}

	/**
	 * @param impAccessDaoFicheUtilisateur the impAccessDaoFicheUtilisateur to set
	 */
	public void setImpAccessDaoFicheUtilisateur(
			IdaoModelFicheUtilisateur impAccessDaoFicheUtilisateur) {
		this.impAccessDaoFicheUtilisateur = impAccessDaoFicheUtilisateur;
	}

}
