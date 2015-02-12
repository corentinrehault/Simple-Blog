/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.simpleblog.domainService.Iservice;
import fr.simpleblog.model.interfaces.IdaoCrud;

/**
 * @author dao303
 *
 */
public class ImpDaoHql<X> implements IdaoCrud<X>, Iservice<X> {

	/**
	 * The session factory
	 */
	public SessionFactory sessionFactory;

	/**
	 * The current session
	 */
	public Session session;

	public X x;


	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#create(java.lang.Object)
	 */
	@Override
	public X create(X x) {

		getSession();

		try {
			session.save(x);
		} catch (HibernateException e) {
			x=null;
			e.printStackTrace();
		}

		return x;

	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#read(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public X read(Class<?> clazz, int id) {

		getSession();

		try {
			x = (X) session.get(clazz, id);
		} catch (HibernateException e) {
			x=null;
			e.printStackTrace();
		}

		return x;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#update(java.lang.Object)
	 */
	@Override
	public X update(X x) {

		getSession();

		try {
			session.update(x);
		} catch (HibernateException e) {
			x=null;
			e.printStackTrace();
		}

		return x;

	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(X x) {

		getSession();

		try {
			session.delete(x);
		} catch (HibernateException e) {
			x=null;
			e.printStackTrace();
		}

		return true;
	}

	/**
	 * @return la session obtenu via la sessionFactory
	 */
	public Session getSession() {

		try {

			session = sessionFactory.openSession();	
			System.out.println("Hibernate session " + session + " is open");
			return session;

		} catch (HibernateException e) {

			System.out.println("FATAL : " + e);
		}

		return session; 

	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
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
		this.sessionFactory = sessionFactory;
	}

}