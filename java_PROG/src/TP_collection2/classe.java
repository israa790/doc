package TP_collection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import java_PROG.Note;

public class classe implements Comparable<classe> {
	private int idClasse;
	private int Capacity;
	Set <Etudiant> Etudiants =new HashSet<Etudiant>();
	
	
	public classe(int idClasse, int capacity) {
		
		this.idClasse = idClasse;
		Capacity = capacity;
		
	}

	public void ajout(Etudiant e)
	{
		Etudiants.add(e);	
	}
	
	
	public void affiche()

	{
		Iterator<Etudiant> It = Etudiants.iterator();
		while (It.hasNext()) {
			System.out.println(It.next());
		}
		
	}
	
	public boolean existe (Etudiant e)
	{
		return (Etudiants.contains(e));
	}
	
	
	public void afficheEtudMaxMoy() {
	//	TreeSet T =new TreeSet(Etudiants);
		TreeSet cles = new TreeSet<Etudiant>(Etudiants);
		Iterator it= cles.iterator();
		
		 while (it.hasNext()){System.out.print(it.next() + " "); }
//System.out.println("moyenne max: "+cles.last());
	}
	

	

public static void main(String[] args)
{
	classe cl=new classe(2,4);
	Etudiant etd1= new Etudiant(961,"maysa",14.01);
	Etudiant etd2= new Etudiant(142,"yosra",15.20);
	Etudiant etd3= new Etudiant(143,"imen",17.65);
	
	cl.ajout(etd1);
	cl.ajout(etd2);
	//cl.ajout(etd3);
	
    cl.affiche();
	System.out.println("---recherche Etudiant----------- \n");
    if(cl.existe(etd3))
    {
    	System.out.println("l'etudiant existe dans la classe \n");
    }
    else
	System.out.println("l'etudiant n 'existe dans la classe \n");
    
    
	System.out.println("-----------meilleur etd-------------");
	cl.afficheEtudMaxMoy();
	
}

@Override
public int compareTo(classe o) {
	// TODO Auto-generated method stub
	return 0;
}

}
	
	
	


