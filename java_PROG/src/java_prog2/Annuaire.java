package java_prog2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class Annuaire {

	
	Map<String,Fiche> ANR ;

	public Annuaire() {
		
		ANR =new HashMap<>();
	}
	
	public void ajouterAbon(String n, Fiche f)
	{
		ANR.put(n,f);
	}
	
	
	public void afficheAbonn()
	{
		Set<String> s= ANR.keySet();
		Iterator<String> i1=s.iterator();

		while(i1.hasNext())
		{
			String	key=i1.next();
			System.out.println (key+" : "+ANR.get(key));
	//	System.out.println (key);
		}
	}
	
	public void afficheTrieMap1()
	{
		 Set<String> cles = ANR.keySet();
		 Set<String> cles2 = new TreeSet(cles);
		 Iterator<String> iterator = cles2.iterator();
		 
		 while (iterator.hasNext()) {
			 String s=iterator.next();
		 System.out.println(s+" : "+ANR.get(s));
		 } 
	}
	public void afficheTrieMap2()
	{
		TreeMap<String,Fiche> cl = new TreeMap<String,Fiche>(ANR);
		 Set<String> cles = cl.keySet();
		 Iterator<String> iterator = cles.iterator();
		 
		 while (iterator.hasNext()) {
			 String s=iterator.next();
		 System.out.println(s+" : "+ANR.get(s));
		 } 
	}
	public void recherche(String nom)
	{
		 Set<String> cles = ANR.keySet();
		 Iterator<String> iterator = cles.iterator();
		 boolean test=false;
		 while(test==false)//iterator.hasNext()
		 {
			 if(iterator.next()==nom) {
				 test=true;
				 System.out.println("nom existe  ");
				 System.out.println(iterator.next()+" : "+ANR.get(iterator.next()));
					}
				
		 }
	}

	
}
