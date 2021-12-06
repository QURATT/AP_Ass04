package application;
 
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController {
	
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
	
	public void Scene3(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Data.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene4(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("BMI.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene5(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Age.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene6(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Discount.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene7(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Date.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene8(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Length.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void Scene9(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Area.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene10(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Volume.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene11(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Temperature.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene12(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Speed.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene13(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Time.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Scene14(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Mass.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void Scene16(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Investments.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
} 
