package tp_fichier1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.stage.Window;

public class exercice4Controller {

    @FXML
    private Button authButton;

    @FXML
    private PasswordField passwordTF;

    @FXML
    private TextField LoginTF;
    
    @FXML
    private Text actionTarget;
    
    @FXML
    void verificaionLogPasss(ActionEvent event) throws IOException {

    	
		String login ="log";
		String pass ="pass";
	
		String str;
	    //String lg=LoginTF.getText();
		//String ps=passwordTF.getText();
		
			
			if(LoginTF.getText().equals(login) && passwordTF.getText().equals(pass)) {
				
				 actionTarget.setFill(Color.GREEN);
				 actionTarget.setText("authentification réussi");
			}
			else
			{
				 actionTarget.setFill(Color.FIREBRICK);
				 actionTarget.setText("PB authentification");
			}
		
		

	}
    }
    
    
    
    

