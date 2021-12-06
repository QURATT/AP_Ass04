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

public class VolumeController {

	@FXML
	private Label lengthlabel = new Label();
	@FXML
	private Label widthlabel = new Label();
	@FXML
	private Label breadthlabel = new Label();
	@FXML
	private Label volumelabel = new Label();
	@FXML
	private TextField getLength;
	@FXML
	private TextField getWidth;
	@FXML
	private TextField getBreadth;
	@FXML
	private Button Submitbutton;
	@FXML
	private Button backbutton;
	@FXML
	private Label getVolume= new Label();
	 

	@FXML
	private void calculateVolume() {

		lengthlabel.setText("");
		widthlabel.setText("");
		breadthlabel.setText("");
		volumelabel.setText("");
		 

		float lenght = Float.parseFloat(getLength.getText());
		float width = Float.parseFloat(getWidth.getText());
		float breadth = Float.parseFloat(getBreadth.getText());

		float volume= (float) 0.0;
		String str = "";
		volume = width * lenght * breadth;
		str = Float.toString(volume);
		str = String.format("%.3f",volume);
		getVolume.setText(str + " m^3");

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