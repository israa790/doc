package java_PROG;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Comparable;

//import java.util.List;
public class Etudiant implements Statisticable, Comparable<Etudiant> {
	public int matricule;
	public String nom;
	ArrayList<Note> Nt ;

	public Etudiant(int matricule, String nom) {
        this.Nt=new ArrayList<>();
		this.matricule = matricule;
		this.nom = nom;

	}

	/*
	 * @Override public String toString() { return "Etudiant [matricule=" +
	 * matricule + ", nom=" + nom + ", Nt=" + ArrayList() + "]"; }
	 */

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", Nt=" + Nt + "]";
	}

	public void ajoutnote(Note n) {
		Nt.add(n);
	}

	void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public void affiche()

	{
		Iterator<Note> It = Nt.iterator();// parcourire sur une liste
		while (It.hasNext()) {
			System.out.println(It.next());
		}
		// liste de type simple
		// System.out.println(Nt);
	}

	/*
	 * public float getValue() {float val; Iterator <Note>It =Nt.iterator();
	 * while(It.hasNext()) { return It.next();
	 * 
	 * } }
	 */

	public void getMaxNote() {
		double max = 0;
		for (int i = 0; i < Nt.size(); i++) {
			if (Nt.get(i).getNt() >= max) {
				max = Nt.get(i).getNt();
			}
		}
		System.out.println("le max des notes de l'etudiant est " + max);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void getMinNote() {

		double min = Nt.get(0).getNt();
		for (int i = 1; i < Nt.size(); i++) {
			if (Nt.get(i).getNt() <= min) {
				min = Nt.get(i).getNt();
			}
		}
		System.out.println("le min des notes de l'etudiant est " + min);
	}

	public double getMoyenne() {
		double moy = 0;
		double somme = 0;
		int nb = 0;
		for (int i = 0; i < Nt.size(); i++) {
			somme = Nt.get(i).getNt() + somme;
			nb = nb + 1;
		}
		moy = somme / nb;
		// System.out.println("la moyenne des notes de l'etudiant est "+moy);
		return moy;
	}

	@Override
	public float getValue() {
		// TODO Auto-generated method stub
		float somme = 0;

		Iterator<Note> It = Nt.iterator();
		while (It.hasNext()) {
			somme += It.next().getNt();
		}
		return (somme / Nt.size());

	}

	public float getbestNote() {
		if (Nt.size() > 0) {
			// float max=Nt.get(0).getNt();

			Iterator<Note> It = Nt.iterator();
			It.next();

		}
		return matricule;

	}

	public int compareTo(Etudiant e) {
//if(this.matricule>e.matricule)
		return (this.matricule - e.matricule);

	}

	public int getMatricule() {
		return matricule;
	}

}
