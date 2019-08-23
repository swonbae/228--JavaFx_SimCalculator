package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class CalculatorController {
	
	double number01, number02;
	double sum;

    @FXML
    private TextField txtNumber01;

    @FXML
    private TextField txtNumber02;

    @FXML
    private Label lblOutput;

    @FXML
    private Button btnADD;

    @FXML
    private Button btnSUB;

    @FXML
    private Button btnMUL;

    @FXML
    private Button btnDIV;

    @FXML
    void btnADDClick(ActionEvent event) {
		try {
	    	number01 = Double.parseDouble(txtNumber01.getText());
	    	number02 = Double.parseDouble(txtNumber02.getText());
	    	sum = number01 + number02;
	    	
	    	lblOutput.setText("Output: "+Double.toString(sum));
		} // end try
		catch(Exception ex)
		{
			lblOutput.setText("Error:" + ex.getMessage());
		} // end catch
    }

    @FXML
    void btnDIVClick(ActionEvent event) {
		try {
	    	number01 = Double.parseDouble(txtNumber01.getText());
	    	number02 = Double.parseDouble(txtNumber02.getText());
	    	sum = number01 / number02;

	    	lblOutput.setText("Output: "+Double.toString(sum));
		} // end try
		catch(Exception ex)
		{
			lblOutput.setText("Error:" + ex.getMessage());
		} // end catch
    }

    @FXML
    void btnMULClick(ActionEvent event) {
		try {
	    	number01 = Double.parseDouble(txtNumber01.getText());
	    	number02 = Double.parseDouble(txtNumber02.getText());
	    	sum = number01 * number02;

	    	lblOutput.setText("Output: "+Double.toString(sum));
		} // end try
		catch(Exception ex)
		{
			lblOutput.setText("Error:" + ex.getMessage());
		} // end catch
    }

    @FXML
    void btnSUBClick(ActionEvent event) {
		try {
	    	number01 = Double.parseDouble(txtNumber01.getText());
	    	number02 = Double.parseDouble(txtNumber02.getText());
	    	sum = number01 - number02;

	    	lblOutput.setText("Output: "+Double.toString(sum));
		} // end try
		catch(Exception ex)
		{
			lblOutput.setText("Error:" + ex.getMessage());
		} // end catch
    }

}

