package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import application.InvestingMoney.CompoundType;

public class InvestingMoneyController {


	    @FXML private Label result;                 // these fields here
	    @FXML private TextField textInvestment;     // must be declared with the
	    @FXML private TextField textRate;           // @FXML annotation
	    @FXML private TextField textYears;          // so they can be referenced
	    @FXML private ComboBox<String> comboCompound; // from the FXML document


	    private application.InvestingMoney.CompoundType comp = CompoundType.YEARLY;   // current type of compounding interest

	    @FXML public void calculate(ActionEvent event) {
	        double principal = getDouble(textInvestment.getText());
	        double rate = getDouble(textRate.getText());
	        double years = getDouble(textYears.getText());
	        if (principal > 0 && rate > 0 && years > 0) {
	            double calc = InvestingMoney.InvestmentValue(principal, rate, (int) years, comp);
	            result.setText("$ " + String.format("%,.2f", calc));
	        }
	        else {
	            result.setText("Invalid Entry.");
	        }
	    }

	    private double getDouble(String text) {
	        if (text.length() > 0) {
	            double d;
	            try {
	                d = Double.parseDouble(text);
	                return d;
	            }
	            catch (NumberFormatException e) {
	                return 0.0;
	            }
	        }
	        return 0.0;
	    }

	    @FXML public void getSelected(ActionEvent e) {
	        comp = InvestingMoney.CompoundType.valueOf(comboCompound.getSelectionModel().getSelectedItem().toUpperCase());
	    }
	    
	    public void Scene15(MouseEvent event) throws IOException {
			Parent root;
			root = FXMLLoader.load(getClass().getResource("Investments.fxml"));
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	 
}
