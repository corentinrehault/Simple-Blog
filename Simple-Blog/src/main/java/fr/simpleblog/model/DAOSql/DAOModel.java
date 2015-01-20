package fr.simpleblog.model.DAOSql;

import javax.servlet.ServletContext;
import javax.sql.*;

import org.apache.struts2.ServletActionContext;

import java.sql.*;

public class DAOModel {

	public DataSource dataSource=null;

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.DAOSql.DAO#getConnection()
	 */
	public Connection getConnection() {

		if(this.dataSource == null) {

			ServletContext servletContext=ServletActionContext.getServletContext();

			dataSource =(DataSource)servletContext.getAttribute("dataSource");
			try {
				System.err.println("La connection est " + !dataSource.getConnection().isClosed());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		Connection connection=null;

		if(dataSource != null) {
			try {
				connection=dataSource.getConnection();

				System.err.println("La connection est " + !connection.isClosed());
			} catch(SQLException e) {
				System.out.println(e);
			}
		}

		return connection;
	}

	public void setConnection() {
		throw new UnsupportedOperationException();
	}

}