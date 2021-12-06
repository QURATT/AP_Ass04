package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

 
public class CalculatorController implements Initializable {

    Double temp = 0.0, sum = 0.0;
    boolean isOperatorPressed;
    String operatorPressed = "";
    private Stage stage;
	private Scene scene;
	private Parent root;
    
    @FXML
    TextField outputTF;       
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        outputTF.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*([\\.]\\d*)?")) {
                    outputTF.setText(oldValue);
                }
            }
        });
    }    
    
    @FXML
    private void onNumberClick(ActionEvent event) {
        if(event.getSource() instanceof Button) {
            Button btn = (Button)event.getSource();                                               
            if(isOperatorPressed) {
                outputTF.setText(btn.getText().trim());                
            } else {
                outputTF.setText(outputTF.getText().trim() + btn.getText().trim());
            }
            isOperatorPressed = false;
        }
    }
    
    @FXML
    private void onOperatorClick(ActionEvent event) {
        if(event.getSource() instanceof Button) {
            Button btn = (Button)event.getSource();            
            if (!outputTF.getText().isEmpty()) {
                temp = Double.valueOf(outputTF.getText());
                if (btn.getText().equals("%")) {
                    temp = sum * temp / 100;                                       
                }
                switch (operatorPressed) {                    
                    case "/":
                        sum /= temp;
                        break;
                    case "X":
                        sum *= temp;
                        break;
                    case "+":
                        sum += temp;
                        break;
                    case "-":
                        sum -= temp;
                        break;
                    default:
                        sum = temp;
                }
            }                     
            
            if (btn.getText().equals("=") || btn.getText().equals("%")) {
                outputTF.setText(String.valueOf(sum));                
                operatorPressed = "";
            } else {
                outputTF.setText("");                
                operatorPressed = btn.getText().trim();
            }
            isOperatorPressed = true;
        }
    }        
    
    @FXML
    private void onDELClick(ActionEvent event) {
        if(outputTF.getText().length() > 0) {
            outputTF.setText(outputTF.getText(0, outputTF.getText().length() - 1));
        }        
    }
    
    @FXML
    private void onCEClick(ActionEvent event) {
        outputTF.setText("");
        temp = 0.0;
        sum = 0.0;
        isOperatorPressed = false;
        operatorPressed = "";
    }
    
	public void Scene1(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
 
	public void Scene2(MouseEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
   
	public void Scene15(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Investments.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
 
}
