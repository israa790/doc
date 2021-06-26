package projet_3javafx;


import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataClass {
	private  List<Person> importList;

  //private static ObservableList<Person> importList;
   private List <Person> exportList;
   
   public DataClass() {
	   importList = new ArrayList<Person>();
	   importList.add(new Person("sami","benAli","sama@exp.com"));
	   importList.add(new Person("Alia","benAli","alia@exp.com"));
	   importList.add(new Person("Ali","benSalah","ali@exp.com"));

	   exportList = new ArrayList<Person>();
   }

	public  List<Person> getImportList() {
		return importList;
	}
	
	public void setImportList(List<Person> importList) {
		this.importList = importList;
	}
	
	public List<Person> getExportList() {
		return exportList;
	}
	
	public void setExportList(List<Person> exportList) {
		this.exportList.addAll(exportList);
		
		for(Person p :this.exportList)
			System.out.println(p);
	}
   
   
}
