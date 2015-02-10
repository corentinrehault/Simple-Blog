/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.domainService.IserviceUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelUtilisateur;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlUtilisateur extends ImpDaoHql<Utilisateur> implements IdaoModelUtilisateur, IserviceUtilisateur {

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
	@SuppressWarnings("unchecked")
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.out.println("Dans loadUserByUsername + " + username);

		UserDetails userDetails = null;
		List<Utilisateur> utilisateurs;

		getSession();

		try {
			utilisateurs = session.createQuery("from Utilisateur where username=?").setString(0, username).list();
			session.flush();
			System.out.println(utilisateurs.get(0));
			if (utilisateurs.size()!=0) {
				userDetails = utilisateurs.get(0);
			} else {
				userDetails = new Utilisateur();
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return userDetails;
	}

}
