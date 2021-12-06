package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.lang.Math.pow;

import java.io.IOException;

public class LoanController {

    @FXML
    private Button calculateButton;

    @FXML
    private TextField purchasePriceTextField;

    @FXML
    private TextField downPaymentTextField;

    @FXML
    private TextField interestRateTextField;

    @FXML
    private TextField loanAmountTextField;

    @FXML
    private TextField monthlyPaymentTextField;

    @FXML
    private Slider yearsSlider;
    @FXML
    private Label yearsLabel;

    //private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    //private static final NumberFormat numberFormat = NumberFormat.getInstance();

    public void initialize() {
        change.setRoundingMode(RoundingMode.HALF_UP);
        yearsSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        years = newValue.intValue();
                        String yearsAsText = Integer.toString(years);
                        yearsLabel.setText(yearsAsText+ " years");
                    }
                }
        );
    }

    protected int years = 0;

    private static final NumberFormat change =NumberFormat.getCurrencyInstance();


    public void onCalculateButtonPressed(ActionEvent actionEvent) {
        double purchaseAmount = Double.parseDouble(purchasePriceTextField.getText());
        double downPayment = Double.parseDouble(downPaymentTextField.getText());
        double interestRate = Double.parseDouble(interestRateTextField.getText());
        double principal = purchaseAmount - downPayment;
        String loanAmountAsText = Double.toString(principal);
        loanAmountTextField.setText("$"+loanAmountAsText);
        int numOfYears = years;
        System.out.println(numOfYears);
        int n = numOfYears * 12;
        double i = interestRate/100/12;
        double term1 = i*pow((1+i),n);
        double term2 = pow((1+i),n) - 1;
        double monthlyPayment = (principal*term1)/term2;
        monthlyPaymentTextField.setText(change.format(monthlyPayment));

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
