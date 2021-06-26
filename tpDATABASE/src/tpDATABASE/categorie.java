package tpDATABASE;

import java.util.ArrayList;
import java.util.Iterator;

public class categorie {

	private int id;
	private String nom;
	ArrayList<produit> lprod;
	
	public categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public categorie(String nom) {
		super();
		this.nom = nom;
		//lprod=new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void ajoutProd(produit p)
	{
		lprod.add(p);
	}
	
	public void affListProd()
	{
		Iterator<produit> it=lprod.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
}
