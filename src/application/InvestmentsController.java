package application;
 
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InvestmentsController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
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
	
	public void Scene17(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("InvestingMoney.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 400, 275);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene18(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Currency.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setTitle("Currency Converter");
		scene = new Scene(root, 445, 283);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene19(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Loan.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 350, 275);
		stage.setScene(scene);
		stage.show();
	}
	
}