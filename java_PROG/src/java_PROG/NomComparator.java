package java_PROG;

import java.util.Comparator;

public class NomComparator implements Comparator <Etudiant>{

	public int compare(Etudiant e1,Etudiant e2)
	{
		String n1=e1.getNom();
		String n2=e2.getNom();
		if(n1.compareTo(n2)>0)
			return 1;
		else if(n1.compareTo(n2)<0)
			return -1;
		else 
			return 0;
	}


	
}
