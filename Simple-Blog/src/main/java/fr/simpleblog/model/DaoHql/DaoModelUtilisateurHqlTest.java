package fr.simpleblog.model.DaoHql;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import fr.simpleblog.beans.HibernateTestBean;

public class DaoModelUtilisateurHqlTest {
	

	/**
	 * The session factory
	 */

	public SessionFactory sessionFactory;
	/**
	 * The current session
	 */
	public Session session;
	
	
	/**
	 * @return la session obtenu via la sessionFactory
	 */
	public Session getSession() {
		System.err.println("entering here !");

		try {
			
			session = sessionFactory.openSession();
			if (!session.isOpen()) {
				
				System.out.println("dsgsdfgfsdfg");
			} else {
				
				System.out.println("dssdfffffffffffffffffffffffffffsdfg");
			}
			
			
				System.out.println("Hibernate session " + session.getFlushMode() + " is open");
			
			
			return session;
			
		} catch (HibernateException e) {
			

			System.out.println("FATAL : " + e);
		}
		
		return session; 

	}
	
	
	

	

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






	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}






	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.err.println("injection session factory");
		

			
			

		this.sessionFactory = sessionFactory;
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!" + sessionFactory.openSession());
	}






	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}

	
	
	
}