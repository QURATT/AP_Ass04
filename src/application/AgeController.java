package application;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

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

public class AgeController {

	@FXML
	TextField borndate = new TextField();

	@FXML
	Label date1 = new Label("");
	@FXML
	Label agefinal = new Label("");

	@FXML
	private Button AgeBTN;
	
	
	@FXML
	private Button MENU;

	public void OnClickAge(ActionEvent event) {

		String agedate = borndate.getText();

	
		String str = borndate.getText();
		SimpleDateFormat date_form = new SimpleDateFormat("yyyy/MM/dd");
		Date d= null;
		try {
			d = date_form.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate l1 = LocalDate.of(year, month, date);
		LocalDate now1 = LocalDate.now();
		Period difference = Period.between(l1, now1);
		System.out.println("Age:" + difference.getYears() + "years");
		date1.setText(String.valueOf(now1.getYear())+"/"+String.valueOf(now1.getMonthValue())+"/"+String.valueOf(now1.getDayOfMonth()));
		String age=String.valueOf(difference.getYears());
		System.out.println(age);
		agefinal.setText(age+" years old.");

		
	}
	
	public void Scene2(MouseEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

}
