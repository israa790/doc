package tpDATABASE;

public class produit {

	private int id;
	private String nom;
	private int quantite;
	private double prix;
	private int code_cat;
	public produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public produit(String nom, int quantite, double prix, int code_cat) {
		super();
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
		this.code_cat = code_cat;
	}

	public int getCode_cat() {
		return code_cat;
	}

	public void setCode_cat(int code_cat) {
		this.code_cat = code_cat;
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
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
