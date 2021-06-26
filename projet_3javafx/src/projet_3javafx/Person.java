package projet_3javafx;


import javafx.beans.property.SimpleStringProperty;

public class Person {
  private SimpleStringProperty prenom;
  private SimpleStringProperty nom;
  private SimpleStringProperty email;
  
  
public String getPrenom() {
	return prenom.get();
}
public void setPrenom(SimpleStringProperty prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom.get();
}
public void setNom(SimpleStringProperty nom) {
	this.nom = nom;
}
public String getEmail() {
	return email.get();
}
public void setEmail(SimpleStringProperty email) {
	this.email = email;
}

public Person(String prenom, String nom, String email) {
	this.prenom = new SimpleStringProperty(prenom);
	this.nom = new SimpleStringProperty(nom);
	this.email = new SimpleStringProperty(email);
}

@Override
public String toString() {
	return "person [prenom=" + prenom + ", nom=" + nom + ", email=" + email + "]";
}
  
  
}
