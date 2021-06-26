package tp_fichier1;

import java.io.*;
import static java.lang.System.*;

import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException {
	
		
		out.println("R�pertoire courant : "+System.getProperty("user.dir"));
		File rep = new File(".");
		out.println("Chemin relatif : "+rep); //+ � compl�ter
		out.println("Chemin absolu : "+System.getProperty("user.dir")+rep);// +� compl�ter
		
		/*for (File �l�ment: rep )// :� compl�ter)
		 out.println("Racine : "+�l�ment);*/
		File []s=rep.listFiles();
		for (File �l�ment :s) //: � compl�ter))
		 if (�l�ment.isDirectory())//. � compl�ter) 
				 {
		 out.print(�l�ment.getName()+"\t");
		 if (�l�ment.getName().length()<8)
		 out.print("\t");
		out.println("<REP>");
		out.println("liste des repertoire qui commencent par la lettre b..................................\r\n");
	
		 }
		File []s2=rep.listFiles();
		for (File �l�ment : s2)// � compl�ter)
		if (�l�ment.isFile()){
		 out.print(�l�ment.getName()+"\t");
		if (�l�ment.getName().length()<8) out.print("\t");
		 out.printf("%tc", new Date(�l�ment.lastModified()));
		 out.printf("\t%10d octets\n", �l�ment.length());
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
