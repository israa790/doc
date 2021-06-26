package TP_collection2;

import java.util.Objects;

public class Etudiant {
private int cin;
private String nom;
private double moyenne;


public Etudiant(int cin, String nom, double moyenne) {
	
	this.cin = cin;
	this.nom = nom;
	this.moyenne = moyenne;
}
public int getCin() {
	return cin;
}
public void setCin(int cin) {
	this.cin = cin;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getMoyenne() {
	return moyenne;
}
public void setMoyenne(double moyenne) {
	this.moyenne = moyenne;
}
@Override
public String toString() {
	return "Etudiant [cin=" + cin + ", nom=" + nom + ", moyenne=" + moyenne + "]";
}


@Override
public boolean equals(Object obj)
{
	Etudiant e=(Etudiant)obj;
	if(this.moyenne == e.getMoyenne())
		return true;
	return false;
	
}
public int hascode()
{
	return Objects.hash(moyenne);
	}

public int compareTo(Etudiant E1)
{
	return (int)( this.moyenne - E1.getMoyenne());
	}

}
