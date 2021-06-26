package java_PROG;

import java.util.ArrayList;

public class test_note {

	public static void main(String[] args) {
		ArrayList <Etudiant> El = new ArrayList<>();
		Etudiant e1=new Etudiant(1,"sia");
		Etudiant e2=new Etudiant(2,"israa");
		
		Note n1=new Note(15,"math");	 
		Note n2=new Note(17,"phys");
		Note n3=new Note(14,"philo");
		Note n4=new Note(20,"svt");
		
		Stats S1=new Stats(El);
		
	
		e1.ajoutnote(n1);
		e1.ajoutnote(n2);
		e2.ajoutnote(n3);
		e2.ajoutnote(n4);
		
		e1.getMaxNote();
		e1.affiche();
		 e1.getMoyenne();
		 e1.getMinNote();
			e2.getMaxNote();
			e2.affiche();
			 e2.getMoyenne();
			 e2.getMinNote();
		 
		S1.ajoutE(e1);
			S1.ajoutE(e2);
		/*	S1.getMoyenne();
			S1.getMaxMoy();
			S1.getMinMoy();
			/*/
			System.out.println("trier matricule");
            S1.trierMatricule();
            System.out.println(S1);
            System.out.println("trier nom");
            S1.trierNom();
            System.out.println(S1);
		
		 e1.getValue();	}
	

}
