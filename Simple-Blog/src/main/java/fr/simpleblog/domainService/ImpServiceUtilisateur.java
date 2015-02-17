/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.model.interfaces.IdaoModelUtilisateur;

/**
 * @author dao303
 * Implémentaton des services.
 */
public class ImpServiceUtilisateur extends ImpService<Utilisateur> implements IserviceUtilisateur, UserDetailsService {

	public IdaoModelUtilisateur impAccessDaoUtilisateur;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#listerUtilisateur()
	 */
	@Override
	@Transactional
	public List<Utilisateur> listUtilisateur() {
		return impAccessDaoUtilisateur.listUtilisateur();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#login(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	@Transactional
	public Utilisateur login(Utilisateur utilisateur) {
		return impAccessDaoUtilisateur.login(utilisateur);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#loadUserByUsername(java.lang.String)
	 */
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) {
		return impAccessDaoUtilisateur.loadUserByUsername(username);
	}

	/**
	 * @return the impAccessDaoUtilisateur
	 */
	public IdaoModelUtilisateur getImpAccessDaoUtilisateur() {
		return impAccessDaoUtilisateur;
	}

	/**
	 * @param impAccessDaoUtilisateur the impAccessDaoUtilisateur to set
	 */
	public void setImpAccessDaoUtilisateur(
			IdaoModelUtilisateur impAccessDaoUtilisateur) {
		this.impAccessDaoUtilisateur = impAccessDaoUtilisateur;
	}

}
