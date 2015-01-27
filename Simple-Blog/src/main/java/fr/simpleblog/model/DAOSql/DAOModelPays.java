package fr.simpleblog.model.DAOSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
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

	public List<Pays> listerPays() {
		
		PreparedStatement request=null;
		String stringRequest=null;
		List<Pays> ensemblePays = new LinkedList<Pays>();
		Pays pays = null;

		try {

			connection=super.getConnection();
			System.out.println("Dans la méthode listerPays");
			stringRequest="SELECT * FROM pays";
			request=connection.prepareStatement(stringRequest);
			System.out.println("request --->" + stringRequest);
			result=request.executeQuery();
			if(result!=null) {
				while(result.next()) {
					pays = Mapper.paysMapper(result);
					ensemblePays.add(pays);
				}
				System.out.println(ensemblePays.toString());
			} else {
				ensemblePays = null;
			}
		} catch(Exception e) {
			ensemblePays=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelPays method listerPays");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelPays method listerPays");
			}
		}

		return ensemblePays;
	}

	public List<Pays> createList(List<Pays> ensemblePays) {

		PreparedStatement request=null;
		StringBuffer stringRequest= new StringBuffer("INSERT INTO Pays (Nom,Codepays) VALUES(?,?)");

		@SuppressWarnings("unused")
		int errorCode;

		try {

			connection=super.getConnection();
			System.out.println("Connecté");

			//Début du bloc de transaction
			connection.setAutoCommit(false);

			for (Pays p : ensemblePays) {
				if(ensemblePays.indexOf(p) != 0) {
					stringRequest.append(", (?,?)");
				}
			}

			request=connection.prepareStatement(stringRequest.toString());
			System.out.println(stringRequest.toString());

			for(Pays p : ensemblePays) {
				System.out.println(ensemblePays.indexOf(p) +" "+ (ensemblePays.indexOf(p)*2+1) +
						" "+ (ensemblePays.indexOf(p)*2+2) +" "+ p.getNom() +" "+ p.getCodepays());
				request.setString((ensemblePays.indexOf(p)*2+1), p.getNom());
				request.setString((ensemblePays.indexOf(p)*2+2), p.getCodepays());
			}

			ensemblePays = null;
			System.out.println(request);
			errorCode = request.executeUpdate();

			//Fin du bloc de transaction
			System.out.println("connection.commit()");
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