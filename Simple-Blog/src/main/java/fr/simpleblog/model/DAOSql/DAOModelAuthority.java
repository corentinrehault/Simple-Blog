package fr.simpleblog.model.DAOSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.controllers.othercontrollers.DBAdministration;

public class DAOModelAuthority extends DAOModel implements IDAOModelAuthority {

	Connection connection=null;
	ResultSet result=null;

	public Authority create(Authority authority) {
		throw new UnsupportedOperationException();
	}

	public Authority read(Authority authority) {
		PreparedStatement request=null;
		String stringRequest=null;

		try {
			connection=super.getConnection();
			System.out.println("Dans la methode read Authority");
			stringRequest="SELECT * FROM authority WHERE Id=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, authority.getId());
			System.out.println("request --->" + request);
			result=request.executeQuery();
			if(result!=null) {
				if(result.next()) {
					authority= Mapper.authorityMapper(result);
				}
			} else {
				authority = null;
			}
		} catch(Exception e) {
			authority=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelAuthority method read");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelAuthority method read");
			}
		}

		return authority;
	}

	public Authority update(Authority authority) {
		throw new UnsupportedOperationException();
	}

	public Authority delete(Authority authority) {
		throw new UnsupportedOperationException();
	}

	public Set<Authority> listerAuthority() {
		throw new UnsupportedOperationException();
	}

	public Set<Authority> listerAuthorityParUtil(Utilisateur utilisateur) {

		PreparedStatement request=null;
		String stringRequest=null;
		HashSet<Authority> authorities = new HashSet<Authority>();
		Authority authority = null;

		try {

			connection=super.getConnection();
			System.out.println("Dans la méthode listerAuthorityParUtil");
			stringRequest="SELECT * FROM authority_utilisateur WHERE UtilisateurId_a_u=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, utilisateur.getId());
			System.out.println("request --->" + request);
			result=request.executeQuery();
			if(result!=null) {
				if (result.next()) {
					authority = read(Mapper.authorityParUtilMapper(result));
					authorities.add(authority);
				}
			} else {
				utilisateur = null;
			}
		} catch(Exception e) {
			utilisateur=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelAuthority method listerAuthorityParUtil");
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
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelAuthority method listerAuthorityParUtil");
			}
		}

		return authorities;
	}
}