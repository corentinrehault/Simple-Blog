/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.model.DaoHql.ImpDaoHqlUtilisateur;

/**
 * @author dao303
 * Implémentaton des services.
 */
public class ImpServiceUtilisateur extends ImpService<Utilisateur> implements IserviceUtilisateur, UserDetailsService {

	public ImpDaoHqlUtilisateur impDaoHqlUtilisateur;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#listerUtilisateur()
	 */
	@Override
	@Transactional
	public List<Utilisateur> listUtilisateur() {
		return impDaoHqlUtilisateur.listUtilisateur();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#login(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	@Transactional
	public Utilisateur login(Utilisateur utilisateur) {
		return impDaoHqlUtilisateur.login(utilisateur);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#loadUserByUsername(java.lang.String)
	 */
	@Override
	@Transactional
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
