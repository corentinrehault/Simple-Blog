package fr.simpleblog.model.DaoSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;
import fr.simpleblog.domainService.IserviceInteret;
import fr.simpleblog.model.interfaces.IdaoModelInteret;

public class DaoModelInteret extends DaoModel implements IdaoModelInteret, IserviceInteret {

	Connection connection=null;
	ResultSet result=null;

	public Interet create(Interet interet) {
		throw new UnsupportedOperationException();
	}

	public Interet read(Interet interet) {
		throw new UnsupportedOperationException();
	}

	public Interet update(Interet interet) {
		throw new UnsupportedOperationException();
	}

	public boolean delete(Interet interet) {
		throw new UnsupportedOperationException();
	}

	public HashSet<Interet> listInteret() {

		PreparedStatement request=null;
		String stringRequest=null;
		HashSet<Interet> interets = new HashSet<Interet>();
		Interet interet = null;

		try {

			connection=super.getConnection();
			System.out.println("Dans la méthode listerInteret");
			stringRequest="SELECT * FROM interet";
			request=connection.prepareStatement(stringRequest);
			//System.out.println("request --->" + stringRequest);
			result=request.executeQuery();
			if(result!=null) {
				while(result.next()) {
					interet = Mapper.interetMapper(result);
					interets.add(interet);
				}
				//System.out.println(interets.toString());
			} else {
				interets = null;
			}
		} catch(Exception e) {
			interets=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelInteret"
					+ " method listerInteret");
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
						+ " dans la classe DAOModelInteret method listerInteret");
			}
		}

		return interets;
	}

	/**
	 * @param i
	 * @return
	 */
	public HashSet<Interet> listInteretById(int i) {

		PreparedStatement request=null;
		String stringRequest=null;
		HashSet<Interet> interets = new HashSet<Interet>();
		Interet interet = null;

		try {

			connection=super.getConnection();
			System.out.println("Dans la méthode listerInteretParFicheUtil");
			stringRequest="SELECT * FROM interet_ficheutilisateur WHERE InteretId_i__f=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, i);
			//System.out.println("request --->" + stringRequest);
			result=request.executeQuery();
			if(result!=null) {
				while(result.next()) {
					interet = read(Mapper.interetParFicheUtilMapper(result));
					interets.add(interet);
				}
				//System.out.println(interets.toString());
			} else {
				interets = null;
			}
		} catch(Exception e) {
			interets=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelInteret"
					+ " method listerInteretParFicheUtil");
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
						+ " dans la classe DAOModelInteret method listerInteretParFicheUtil");
			}
		}

		return interets;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoCrud#read(java.lang.Class, int)
	 */
	@Override
	public Interet read(Class<?> clazz, int id) {
		// TODO Auto-generated method stub
		return null;
	}
}