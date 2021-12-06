package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BMIController {
	
	// GUI controls defined in FXML and used by the controller's code

    @FXML
    private TextField inchesInput;

    @FXML
    private TextField centimetersInput;

    @FXML
    private TextField poundsInput;

    @FXML
    private TextField kilosInput;

    @FXML
    private TextField bmiCategory;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField bmiOutput;


    //calculate Body Mass Index in pounds and inches or in kilos and centimeters
    @FXML
    void calculate(ActionEvent event) {
    	Double weightValue;
    	Double heightValue;
    	Double bmiValue ;
    	
    	if(poundsInput.getText() != null && inchesInput.getText() != null) {
    		weightValue = Double.parseDouble(poundsInput.getText());
    		heightValue = Double.parseDouble(inchesInput.getText());
    		bmiValue = (weightValue * 703) / (heightValue * heightValue);
        	setResultOutput(bmiValue);

    	}
    	
    	if(kilosInput.getText() != null && centimetersInput.getText() != null) {
    		weightValue = Double.parseDouble(kilosInput.getText());
    		heightValue = Double.parseDouble(centimetersInput.getText());
    		bmiValue = (weightValue) / ((heightValue * heightValue) / 10000);
        	setResultOutput(bmiValue);

    	}
    	
    }
    // output BMI output to screen and assign its category accordingly
    void setResultOutput(Double bmiValue) {
    	bmiOutput.setText(bmiValue.toString());
    	if (bmiValue <= 18.5) {
    		bmiCategory.setText("underweight");
    		
    	}else if(bmiValue >= 18.5 && bmiValue <= 24.9) {
    		bmiCategory.setText("Normal Weight");

    	}else if(bmiValue >= 25 && bmiValue <= 29.9) {
    		bmiCategory.setText("Over Weight");

    	}else if(bmiValue >= 30) {
    		bmiCategory.setText("Obese");

    	}
    }
    
    public void Scene2(MouseEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
