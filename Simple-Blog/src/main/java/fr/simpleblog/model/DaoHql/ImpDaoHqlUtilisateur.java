/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.domainService.IserviceUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelUtilisateur;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlUtilisateur extends ImpDaoHql<Utilisateur> implements IdaoModelUtilisateur, IserviceUtilisateur, UserDetailsService {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelUtilisateur#listerUtilisateur()
	 */
	@Override
	public List<Utilisateur> listUtilisateur() {
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelUtilisateur#login(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	public Utilisateur login(Utilisateur utilisateur) {
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelUtilisateur#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) {

		UserDetails proxyUser = null;

		getSession();

		try {
			proxyUser = (UserDetails) session.createQuery("from utilisateur where username=?").setString(0, username).list();
			session.flush();
			return proxyUser;
		} catch (HibernateException e) {
			x=null;
			e.printStackTrace();
		}

		return proxyUser;
	}

}
