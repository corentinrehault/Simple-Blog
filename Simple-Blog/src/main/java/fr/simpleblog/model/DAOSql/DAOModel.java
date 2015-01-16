package fr.simpleblog.model.DAOSql;

import javax.sql.*;
import java.sql.*;

public class DAOModel {
	public DataSource dataSource;

	public Connection getConnection() {
		throw new UnsupportedOperationException();
	}

	public void setConnection() {
		throw new UnsupportedOperationException();
	}
}