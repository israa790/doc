package tpDATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.*;

public class metier {

	// categorie cat= new categorie("categorie1");
	public void ajouterCat(categorie cat) throws ClassNotFoundException {
		// String s=cat.getNom();
		String query = "insert into categorie(nom) values( ?)";
		try {
			String url = "jdbc:mysql://localhost:3306/tpjava_avance";
			Class.forName("com.mysql.jdbc.Driver");
			// int result = Statement.executeUpdate(query);
			Connection conn = DriverManager.getConnection(url, "root", "");
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, cat.getNom());
			st.executeUpdate();

		} catch (SQLException e) {
			System.err.println("Error executing query: " + e.getMessage());
		}

	}

	public void ajouterProd(produit prod) throws ClassNotFoundException {
		// String s=cat.getNom();
		String query = "insert into produit(nom,prix,quantite,code_cat) values( ?, ?, ?, ?)";
		try {
			String url = "jdbc:mysql://localhost:3306/tpjava_avance";
			Class.forName("com.mysql.jdbc.Driver");
			// int result = Statement.executeUpdate(query);
			Connection conn = DriverManager.getConnection(url, "root", "");
			PreparedStatement st = conn.prepareStatement(query);
			 st.setString(1,prod.getNom());
			 st.setDouble(2,prod.getPrix());
			 st.setInt(3,prod.getQuantite());
			 st.setInt(4,prod.getCode_cat());
			st.executeUpdate();

		} catch (SQLException e) {
			System.err.println("Error executing query: " + e.getMessage());
		}

	}

	public void afficherCat(categorie cat) throws ClassNotFoundException
	{
		//String s=cat.getNom();
		String query = "select * from categorie ";
				try {
					String url = "jdbc:mysql://localhost:3306/tpjava_avance";
					Class.forName("com.mysql.jdbc.Driver");
				//int result = Statement.executeUpdate(query);
				Connection conn= DriverManager.getConnection(url, "root", "");
				//PreparedStatement st= conn.prepareStatement(query);
				Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					System.out.println(rs.getInt("code")+" – " +
					rs.getString("NOM"));
					
				
				//st.setString(1,cat.getNom());
				//st.executeQuery();
				}}
				
				catch (SQLException e) {
				System.err.println("Error executing query: " +e.getMessage());}
				}

	public void afficherProd() throws ClassNotFoundException {
		// String s=cat.getNom();
		String query = "select * from produit where nom like'%nom%' ";
		try {
			String url = "jdbc:mysql://localhost:3306/tpjava_avance";
			Class.forName("com.mysql.jdbc.Driver");
			// int result = Statement.executeUpdate(query);
			Connection conn = DriverManager.getConnection(url, "root", "");
			// PreparedStatement st= conn.prepareStatement(query);
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt("reference") + " – " + rs.getString("NOM")
				+ " – " + rs.getString("prix")+ " – " + rs.getString("quantite"));

				
			}
		}

		catch (SQLException e) {
			System.err.println("Error executing query: " + e.getMessage());
		}

		
	}
	public void afficherProdCateg() throws ClassNotFoundException {
	
		String query = "select * from produit where code_cat=( ?) ";
		try {
			String url = "jdbc:mysql://localhost:3306/tpjava_avance";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, "root", "");
		
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			//rs.updateString(1,cat.getNom());
			while (rs.next()) {
				System.out.println(rs.getInt("reference") + " – " + rs.getString("NOM")
				+ " – " + rs.getString("prix")+ " – " + rs.getString("quantite"));

			
			}
		}

		catch (SQLException e) {
			System.err.println("Error executing query: " + e.getMessage());
		}

	}
	public void afficherProdCateg2() throws ClassNotFoundException {
		// String s=cat.getNom();
		String query = "select code,reference,c.nom,p.nom,prix,quantite  from produit p,categorie c"
				+ " where p.code_cat=c.code ";
		try {
			String url = "jdbc:mysql://localhost:3306/tpjava_avance";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, "root", "");
		
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt("code")+ " – " + rs.getString("c.nom")+ " – " +
			                       rs.getInt("reference") + " – " + rs.getString("p.NOM")
			                     	+ " – " + rs.getString("prix")+ " – " + rs.getString("quantite"));

			
			}
		}

		catch (SQLException e) {
			System.err.println("Error executing query: " + e.getMessage());
		}

	}

}
