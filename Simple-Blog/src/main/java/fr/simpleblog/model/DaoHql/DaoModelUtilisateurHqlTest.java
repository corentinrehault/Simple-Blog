package fr.simpleblog.model.DaoHql;

import org.hibernate.HibernateException;
import fr.simpleblog.beans.HibernateTestBean;

public class DaoModelUtilisateurHqlTest extends ImpDaoHql<HibernateTestBean> {
	


	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#create(java.lang.Object)
	 */
	public HibernateTestBean create(HibernateTestBean x) {
		
		getSession();

		try {
			
			session.save(x);
			
			session.flush();
			
		} catch (HibernateException e) {
			

			System.out.println("Error : " + e);
			
			x = null;
			
		} finally {
			
			// rollback

		}

		return x;
	}
	
}