package fr.simpleblog.services;

import java.sql.SQLException;

import javax.naming.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class ApplicationListener implements ServletContextListener {

	public Context context = null;

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

		try {
			if(context!=null) {
				context.close();
			}
		} catch (NamingException e) {
			e.printStackTrace();
			System.out.println("Erreur lors de contextDestroyed !");
		}

	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {

		ServletContext servletContext = servletContextEvent.getServletContext();
		String dataSourceJNDI = servletContext.getInitParameter("dataSourceJNDI");

		try {
			context=new InitialContext();
			DataSource dataSource=(DataSource)context.lookup(dataSourceJNDI);
			if(dataSource==null) {
				System.out.println("il n'y a pas de source de données pour le projet simpleblog.");
			} else {
				System.out.println("DataSource : simpleblog chargé !");
				servletContext.setAttribute("dataSource", dataSource);

				try {
					System.out.println("?????????" + !dataSource.getConnection().isClosed());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} catch(NamingException e) {
			throw new RuntimeException();
		} finally {
			try {
				if(context!=null) {
					context.close();
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de contextInitialized !");
			}
		}

	}
}