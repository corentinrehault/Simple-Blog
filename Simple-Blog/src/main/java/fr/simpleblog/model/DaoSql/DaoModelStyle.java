package fr.simpleblog.model.DaoSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import fr.simpleblog.beans.Style;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;
import fr.simpleblog.domainService.IserviceStyle;
import fr.simpleblog.model.interfaces.IdaoModelStyle;

public class DaoModelStyle extends DaoModel implements IdaoModelStyle, IserviceStyle {

	Connection connection=null;
	ResultSet result=null;

	public Style create(Style style) {
		throw new UnsupportedOperationException();
	}

	public Style read(Style style) {
		throw new UnsupportedOperationException();
	}

	public Style update(Style style) {
		throw new UnsupportedOperationException();
	}

	public boolean delete(Style style) {
		throw new UnsupportedOperationException();
	}

	public List<Style> listStyle() {

		PreparedStatement request=null;
		String stringRequest=null;
		List<Style> styles = new LinkedList<Style>();
		Style style = null;

		try {

			connection=super.getConnection();
			System.out.println("Dans la méthode listerStyle");
			stringRequest="SELECT * FROM style";
			request=connection.prepareStatement(stringRequest);
			System.out.println("request --->" + stringRequest);
			result=request.executeQuery();
			if(result!=null) {
				while(result.next()) {
					style = Mapper.styleMapper(result);
					styles.add(style);
				}
				System.out.println(styles.toString());
			} else {
				styles = null;
			}
		} catch(Exception e) {
			styles=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelStyle method listerStyle");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelStyle method listerStyle");
			}
		}

		return styles;
	}

	/**
	 * @param i
	 * @return
	 */
	public Style readById(int i) {

		PreparedStatement request=null;
		String stringRequest=null;
		Style style = null;

		try {

			connection=super.getConnection();
			System.out.println("Dans la méthode readById");
			stringRequest="SELECT * FROM style WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, i);
			//System.out.println("request --->" + stringRequest);
			result=request.executeQuery();
			if(result!=null) {
				style = Mapper.styleMapper(result);
				//System.out.println(interets.toString());
			} else {
				style = null;
			}
		} catch(Exception e) {
			style=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelStyle"
					+ " method readById");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données"
						+ " dans la classe DAOModelStyle method readById");
			}
		}

		return style;
	}

	/**
	 * @param i
	 * @return 
	 */
	public Style updateById(int styleId) {

		Style style = null;
		// TODO Auto-generated method stub
		return style;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#read(java.lang.Class, int)
	 */
	@Override
	public Style read(Class<?> clazz, int id) {
		// TODO Auto-generated method stub
		return null;
	}
}