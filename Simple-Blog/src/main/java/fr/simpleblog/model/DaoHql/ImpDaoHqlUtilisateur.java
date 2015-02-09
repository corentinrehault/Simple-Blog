/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

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
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.out.println("Dans loadUserByUsername + " + username);

		UserDetails userDetails = null;
		Utilisateur utilisateur = null;

		getSession();

		try {
			utilisateur = (Utilisateur) session.createQuery("from utilisateur where username=?").setString(0, username).list();
			session.flush();
			System.out.println(utilisateur);
			return userDetails;
		} catch (HibernateException e) {
			userDetails=null;
			e.printStackTrace();
		}

		return userDetails;
	}

}
