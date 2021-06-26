package java_PROG;
import java.util.Comparator;

public class MatComparator implements Comparator <Etudiant> {
	public int compare(Etudiant e1,Etudiant e2)
	{
		int m1=e1.getMatricule();
		int m2=e2.getMatricule();
		if(m1 >m2)
			return 1;
		else if(m1 <m2)
			return -1;
		else 
			return 0;
	}

}
