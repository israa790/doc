package tpDATABASE;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class exercice1 {
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/tpjava_avance";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn= DriverManager.getConnection(url, "root", "");
		Statement stmt = conn.createStatement();
		
		categorie cat= new categorie("categorie2");
		produit prod=new produit("nom2",45,6,1);
		produit prod3=new produit("nom3",74,4,2);	
		produit prod4=new produit("nom",74,4,2);	
	metier m=new metier();
//	m.ajouterCat(cat);
	m.ajouterProd(prod);
	m.ajouterProd(prod4);
	System.out.println(" \n");
	System.out.println("-------- affichage des categories --------");
	m.afficherCat(cat);
	System.out.println(" \n");
	System.out.println("-------- affichage des produits --------");
	m.afficherProd();
	System.out.println(" \n");
	System.out.println("-------- affichage des produits sachant categorie --------");
	m.afficherProdCateg();
	System.out.println(" \n");
	System.out.println("-------- affichage des produits sachant categorie --------");
	m.afficherProdCateg2();
/*	cat.ajoutProd(prod);
	cat.ajoutProd(prod3);
	cat.affListProd();*/
		}
		catch(ClassNotFoundException ex) {
		System.out.println("Problème de chargement du Driver!");
		System.exit(1);
		}
	
		catch (SQLException e) {
		System.err.println("Error opening SQL connection:"+ e.getMessage());
		}
	
	
}
}
