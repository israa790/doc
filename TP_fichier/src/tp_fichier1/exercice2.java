package tp_fichier1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exercice2 {

	public static void main(String [] args) throws IOException
	{
		File f1=new File("C:\\fichiers\\fich1.txt");
		FileReader fr =new FileReader(f1);
		BufferedReader br =new BufferedReader(new FileReader(f1));
		
		String login ="log";
		String pass ="pass";
	
		String str;
		while((str=br.readLine())!=null)
		{
			String[] tabstr=str.split("/");
			if(tabstr[0].contentEquals(login)&& tabstr[1].equals(pass)) {
				System.out.println("authentification réussi");
			}
			else
				System.out.println("PB authentification");
		}
		
		br.close();
	}
}
