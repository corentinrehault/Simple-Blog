/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.model.DaoHql.ImpDaoHqlUtilisateur;

/**
 * @author dao303
 * Implémentaton des services.
 */
public class ImpServiceUtilisateur extends ImpService<Utilisateur> implements IserviceUtilisateur {

	ImpDaoHqlUtilisateur impDaoHqlUtilisateur;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#listerUtilisateur()
	 */
	@Override
	public List<Utilisateur> listUtilisateur() {
		return impDaoHqlUtilisateur.listUtilisateur();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#login(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	public Utilisateur login(Utilisateur utilisateur) {
		return impDaoHqlUtilisateur.login(utilisateur);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) {
		return impDaoHqlUtilisateur.loadUserByUsername(username);
	}

	/**
	 * @return the impDaoHqlUtilisateur
	 */
	public ImpDaoHqlUtilisateur getImpDaoHqlUtilisateur() {
		return impDaoHqlUtilisateur;
	}

	/**
	 * @param impDaoHqlUtilisateur the impDaoHqlUtilisateur to set
	 */
	public void setImpDaoHqlUtilisateur(ImpDaoHqlUtilisateur impDaoHqlUtilisateur) {
		this.impDaoHqlUtilisateur = impDaoHqlUtilisateur;
	}

}
