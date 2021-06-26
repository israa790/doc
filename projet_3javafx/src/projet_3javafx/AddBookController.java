package projet_3javafx;


import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Window;

public class AddBookController implements Initializable{

	    private ObservableList<Person> ImportList2=null;
	    
	    @FXML
	    private TextField textFieldPrenom;

	    @FXML
	    private TextField textFieldNom;

	    @FXML
	    private TextField textFieldMail;
        
	    @FXML
	    private Button exportBtn;

	    @FXML
	    private Button importBtn;

	    @FXML
	    private Button removeBtn;

	    @FXML
	    private Button quitBtn;
	    
	    @FXML
	    private Button addBtn;
	    
	    @FXML
	    private TableView<Person> table = new TableView<>(FXCollections.observableArrayList());
	    
	    @FXML
	    private TableColumn<Person, String> prenomCol ;// = new TableColumn<>("Prenom");
	    
	    @FXML
	    private TableColumn<Person, String> nomCol = new TableColumn<>("Nom");

	    @FXML
	    private TableColumn<Person, String> emailCol = new TableColumn<>("Email");;

	    private DataClass data;

	  
	   

	    
	    public void addPerson(ActionEvent actionEvent) {
	    	 Window owner = addBtn.getScene().getWindow();
	    	 if((textFieldPrenom.getText().isEmpty())||(textFieldNom.getText().isEmpty())||(textFieldMail.getText().isEmpty())) {
		    	 Alert alert2 = new Alert(AlertType.INFORMATION);
		    	 alert2.setTitle("Champ vide");
		    	 alert2.setHeaderText(null);
		    	 alert2.setContentText("Remplir tout les champs " );
		    	 alert2.initOwner(owner);
		    	 alert2.show();
		    	 }
	    	 else {
	    		 int nextId = table.getSelectionModel().getSelectedIndex() + 1;
		          table.getItems().add(nextId, new Person(textFieldPrenom.getText(), textFieldNom.getText(), textFieldMail.getText()));
		          table.getSelectionModel().select(nextId);
	    	 }		

	      }
	    public void deletePerson(ActionEvent actionEvent) {
	        
	      }
	    public void quitter(ActionEvent e) {
			 System.exit(0);
		 }
	    public void importPerson(ActionEvent actionEvent) {
		    ImportList2 = FXCollections.observableArrayList(data.getImportList());
	    	/*for(int i=0;i< data.getImportList().size();i++)
	    	{
	    	 int nextId = table.getSelectionModel().getSelectedIndex() + 1;
	    	table.getItems().add(nextId,data.getImportList().get(i));
	    	table.getSelectionModel().select(nextId);
		 }*/
		    
	         table.setItems(ImportList2);
	        // table.getItems().addAll(ImportList2);
	    }
	    public void exportPerson(ActionEvent actionEvent) {

	    }
	       
	    public static boolean isEmailAdress(String email){
	    	Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$" );
	    	Matcher m = p.matcher(email.toUpperCase());
	    	return m.matches();
	    	}
	    
	    public void handle(KeyEvent event) {
	    	 Window owner = addBtn.getScene().getWindow();

            String email =table.getEditingCell().toString();
            if( isEmailAdress(email) ) {
            	 Alert alert3 = new Alert(AlertType.INFORMATION);
            	 alert3.setTitle("Champ vide");
            	 alert3.setHeaderText(null);
            	 alert3.setContentText("mail incorrect ! " );
            	 alert3.initOwner(owner);
            	 alert3.show();
            	
                
            }

        }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			table.setEditable(true);
				
			prenomCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));
			prenomCol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());

			nomCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
			nomCol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());

			emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
			emailCol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());

			
			


			table.getColumns().setAll(prenomCol, nomCol, emailCol);
		    table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		    
		}
		   
		
}
