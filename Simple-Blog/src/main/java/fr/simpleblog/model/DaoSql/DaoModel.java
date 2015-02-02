package fr.simpleblog.model.DaoSql;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DaoModel {

	private DataSource dataSource;


	/**
	 * @return 
	 * @return
	 */
	public Connection getConnection() {

		if(this.dataSource == null) {

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



	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	/**
	 * @param dataSource
	 */
	public DaoModel(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	/**
	 * 
	 */
	public DaoModel() {
	}
	
	
	
	

}