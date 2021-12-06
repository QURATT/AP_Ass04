package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DiscountController {

	@FXML
	TextField inp1 = new TextField();
	@FXML
	TextField inp2 = new TextField();
	@FXML
	Label myLabel = new Label();
	
	@FXML
	private Button CalcBTN;
	 

	public void calcDiscount(ActionEvent event) throws IOException {

		int price = Integer.parseInt(inp1.getText());
		int discount = Integer.parseInt(inp2.getText());
		int markedprice,dis,amount,s;
		markedprice=price;
		 
        dis=discount;  		
	
	System.out.println("markedprice= "+markedprice);
 
	System.out.println("discount rate="+dis);
         
        s=100-dis;
 
	amount= (s*markedprice)/100;
	
	myLabel.setText(String.valueOf(amount));

	}
	

	public void Scene2(MouseEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
