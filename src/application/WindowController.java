package application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


  

public class WindowController implements Initializable {

	@FXML public Button displayCalculator;
    @FXML public Button displayMenu;
    @FXML public Button displayInvestmentCalc;
    @FXML public Label option1;
    @FXML public Label option2;

//    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {}

    @FXML
    private void displayCalc() {
    	option1.setText("Calc");
        displayCalculator.setVisible(false);
       // displayInvestmentCalc.setVisible(false);
        if (!displayMenu.isVisible())
        	displayMenu.setVisible(true);
    }

    @FXML
    private void displayMenu() {
        option1.setText("");
    	//displayInvestmentCalc.setVisible(false);
    	displayMenu.setVisible(false);
        if (!displayCalculator.isVisible())
        	displayCalculator.setVisible(true);
    }
    
    @FXML
    private void displayInvestment() {
       option2.setText("displayInvestmentCalc");
     
    }
   
}
