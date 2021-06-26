package tp_fichier1;

import java.io.*;

public class exercice1 {

	
	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\fichiers\\in.txt");
		File outputFile = new File("C:\\fichiers\\out.txt");

		FileReader fr= new FileReader(inputFile);
		FileWriter fw= new FileWriter(outputFile);
		int c=fr.read();
		while(c!=-1)
		{fw.write(c);}
		
		fr.close();
		fw.close();
		}
	
}
