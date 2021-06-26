package tp_fichier1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class exercice3 {
	
public static void main(String[] args) throws IOException
   {
	File f1=new File("C:\\fichiers\\exemple.txt");
	FileReader fr =new FileReader(f1);
	BufferedReader br =new BufferedReader(new FileReader(f1));
	
	String s;
	int c;
	int nbrL=0;
	int nbrM=0;
	int nbrC=0;
	while((s=br.readLine())!=null )
	{
		 StringTokenizer st = new StringTokenizer(s," ");
		nbrL+=1;
	     nbrM += st.countTokens();
	     while((c=fr.read())!=-1)
	     {
	    	 nbrC+=1;
	     }
		
	}
	System.out.println("le nombre des lignes= "+nbrL+
 			" le nombre des mots= "+nbrM+" le nombre des caractères="+nbrC);
	}
}
