package tp_fichier1;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter{

	private char lettre;

	 public Filtre(char lettreD�but) {
	 lettre = lettreD�but;
	 }
	 public boolean accept(File repFiltre, String nom) {
		 return (nom.startsWith("b"));

	 }
}
