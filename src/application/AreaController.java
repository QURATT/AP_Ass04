package application;

import java.io.IOException;

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

public class AreaController {

	@FXML
	private Label lengthlabel = new Label();
	@FXML
	private Label widthlabel = new Label();
	@FXML
	private Label arealabel = new Label();
	@FXML
	private TextField getLength;
	@FXML
	private TextField getWidth;
	@FXML
	private Button Submitbutton;
	@FXML
	private Button backbutton;
	@FXML
	private Label getArea= new Label();
	 

	@FXML
	private void calculateArea() {

		lengthlabel.setText("");
		widthlabel.setText("");
		arealabel.setText("");
		 

		float lenght = Float.parseFloat(getLength.getText());
		float width = Float.parseFloat(getWidth.getText());

		float area= (float) 0.0;
		String str = "";
		area = width * lenght;
		str = Float.toString(area);
		str = String.format("%.3f",area);
		getArea.setText(str + " m^2");

		

	}

	public void Scene2(MouseEvent event) throws IOException {
		Parent root;
		root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}