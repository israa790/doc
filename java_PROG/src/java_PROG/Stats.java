package java_PROG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Stats {

	@Override
	public String toString() {
		return "Stats [E=" + E + "]";
	}
	ArrayList <Etudiant> Etd = new ArrayList<>();
	ArrayList <Etudiant> E;
	
	
	
	//constructeur
	public Stats(ArrayList <Etudiant> LE)
	{
	E =new ArrayList(LE);
		
	}
	public void trierMatricule()
	{
		MatComparator c =new MatComparator();
			Collections.sort(E,c);	
	}

	public void trierNom()
	{
		NomComparator c =new NomComparator();
			Collections.sort(E ,c);	
	}

	//collections 
	/*public void trierListEtudiant()
	{
			Collections.sort(E);	
	}*/
	
	
	public void getMoyenne()
	{
		double	moy=0;
		double somme=0;
		int nb=0;
		for(int i=0;i<Etd.size();i++)
		{
	         somme=Etd.get(i).getMoyenne()+somme;
			nb=nb+1;
			}
		moy=somme/nb;
		System.out.println("la moyenne des notes de groupe des etudiants est "+moy);	
	}

	public void ajoutE(Etudiant e)
	{
		E.add(e);
	}
	public void ajoutEtd(Etudiant e)
	{
		Etd.add(e);
	}
	
	
	public void getMaxMoy()
	{double max=Etd.get(0).getMoyenne(); double min=Etd.get(0).getMoyenne(); int n = 0;
		for(int i=0;i<Etd.size();i++)
	{
		if(Etd.get(i).getMoyenne()>=max)
		{
			max=Etd.get(i).getMoyenne();
			n=i;
		}
		else if(Etd.get(i).getMoyenne()<=min)
		{   min=Etd.get(i).getMoyenne();  }
	}
		System.out.println("le meilleur etudiant est "+Etd.get(n).getNom()+" moyenne="+max);
		
		}
	public void getMinMoy()
	{ double min=Etd.get(0).getMoyenne(); int n = 0;
		for(int i=0;i<Etd.size();i++)
	{
		
		 if(Etd.get(i).getMoyenne()<=min)
		{   min=Etd.get(i).getMoyenne(); 
		    n=i;   }
	}
		System.out.println("le derniere etudiant est "+Etd.get(n).getNom()+" moyenne="+min);
		
		}
	/*public void affiche ()

	{
		Iterator <Etudiant>It =Etd.iterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}
	}*/
	
	
	
}

