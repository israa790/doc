package tp_fichier1;

import java.io.*;
import static java.lang.System.*;

import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException {
	
		
		out.println("Répertoire courant : "+System.getProperty("user.dir"));
		File rep = new File(".");
		out.println("Chemin relatif : "+rep); //+ à compléter
		out.println("Chemin absolu : "+System.getProperty("user.dir")+rep);// +à compléter
		
		/*for (File élément: rep )// :à compléter)
		 out.println("Racine : "+élément);*/
		File []s=rep.listFiles();
		for (File élément :s) //: à compléter))
		 if (élément.isDirectory())//. à compléter) 
				 {
		 out.print(élément.getName()+"\t");
		 if (élément.getName().length()<8)
		 out.print("\t");
		out.println("<REP>");
		out.println("liste des repertoire qui commencent par la lettre b..................................\r\n");
	
		 }
		File []s2=rep.listFiles();
		for (File élément : s2)// à compléter)
		if (élément.isFile()){
		 out.print(élément.getName()+"\t");
		if (élément.getName().length()<8) out.print("\t");
		 out.printf("%tc", new Date(élément.lastModified()));
		 out.printf("\t%10d octets\n", élément.length());
		 }
		File rootDir=new File(File.listRoots()[0].toString());
		FilenameFilter filter =new FilenameFilter() {
		
			public boolean accept(File repFiltre, String nom) {
				 return (nom.startsWith("b")); }};
		
	out.println("liste des repertoire qui commencent par la lettre b..................................\r\n");
	out.println(Arrays.asList(rootDir.listFiles(filter)));	
		 }
	/*
	File f1=in.txt;
	File f2=out.txt;
	FileReader fr=f1...
	FileWriter fr=f2...
	while(fr.read()!=-1)
	fw.write();
	 */
	
}
