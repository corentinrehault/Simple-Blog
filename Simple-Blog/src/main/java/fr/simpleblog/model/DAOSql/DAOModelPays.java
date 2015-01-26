package fr.simpleblog.model.DAOSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;

public class DAOModelPays extends DAOModel implements IDAOModelPays {

	Connection connection=null;
	ResultSet result=null;

	public Pays create(Pays pays) {
		PreparedStatement request=null;
		String stringRequest=null;
		@SuppressWarnings("unused")
		int errorCode;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			System.out.println(pays);
			stringRequest="INSERT INTO Pays (Nom,Codepays) VALUES(?,?)";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, pays.getNom());
			request.setString(2, pays.getCodepays());
			pays=null;
			System.out.println("request --->" + request.executeUpdate());
			errorCode=request.executeUpdate();
		} catch(Exception e) {
			pays=null;
			errorCode=0;
			System.out.println("Erreur dans la requête dans la classe DAOModelPays method create");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelPays method create");
			}
		}

		return pays;
	}

	public Pays read(Pays pays) {
		throw new UnsupportedOperationException();
	}

	public Pays update(Pays pays) {
		throw new UnsupportedOperationException();
	}

	public Pays delete(Pays pays) {
		throw new UnsupportedOperationException();
	}

	public void listerPays() {
		throw new UnsupportedOperationException();
	}

	public List<Pays> createList(List<Pays> ensemblePays) {

		PreparedStatement request=null;
		String stringRequest=null;
		@SuppressWarnings("unused")
		int errorCode;

		try {
			connection=super.getConnection();
			System.out.println("Connecté");
			//System.out.println(ensemblePays);
			
			//Début du bloc de transaction
			connection.setAutoCommit(false);
//			stringRequest="INSERT INTO Pays (Nom,Codepays) VALUES(?,?)";
//			request=connection.prepareStatement(stringRequest);
//			request.setString(1, pays.getNom());
//			request.setString(2, pays.getCodepays());
//			pays=null;
//			System.out.println("request --->" + request.executeUpdate());
//			errorCode=request.executeUpdate();
			
			stringRequest="INSERT INTO Pays (Nom,Codepays) VALUES(?,?)";
			
			//Fin du bloc de transaction
			connection.commit();
		} catch(Exception e) {
			ensemblePays=null;
			errorCode=0;
			System.out.println("Erreur dans la requête dans la classe DAOModelPays method createList");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelPays method createList");
			}
		}

		return ensemblePays;
	}
}