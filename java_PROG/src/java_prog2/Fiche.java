package java_prog2;

public class Fiche {

	public String nomF;
	public String adresse;
	public int numero;
	
	
	@Override
	public String toString() {
		return "Fiche [nomF=" + nomF + ", adresse=" + adresse + ", numero=" + numero + "]";
	}
	public Fiche(String nomF, String adresse, int numero) {
		
		this.nomF = nomF;
		this.adresse = adresse;
		this.numero = numero;
	}
	public String getNomF() {
		return nomF;
	}
	public void setNomF(String nomF) {
		this.nomF = nomF;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
