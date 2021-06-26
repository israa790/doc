package java_prog2;

import java.util.HashMap;
import java.util.Map;


public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Annuaire> A =new HashMap<>();

	Annuaire e1=new Annuaire();
	Fiche f1=new Fiche("sia","dar3", 0);
	Fiche f2=new Fiche("isra","adr4", 0);
	e1.ajouterAbon("nom1", f1);
	e1.ajouterAbon("isra", f2);
	e1.afficheAbonn();
	System.out.println("liste triée 1 \n");
	e1.afficheTrieMap1();
	System.out.println("liste triée 2 \n");
	e1.afficheTrieMap2();
    e1.recherche("aya");
	
	}
	

}
