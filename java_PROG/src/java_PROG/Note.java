package java_PROG;
import java.util.ArrayList;
import java.util.List;

public class Note {
     public double nt;
     public String matiere;
	
	public Note(int nt, String matiere) {
		
		this.nt = nt;
		this.matiere = matiere;
	}
	/*public  void ajoutNote(String m,double nt1)
	{
	    this.matiere=m;
		this.nt=nt1;
	}
*/
	public double getNt() {
		return nt;
	}
	public void setNt(double nt) {
		this.nt = nt;
	}
	@Override
	public String toString() {
		return "Note [nt=" + nt + ", matiere=" + matiere + "]";
	}


	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public int compareTo(Note max) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 
	
	 
}
