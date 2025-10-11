package lab3.comp3111jfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyController {

	@FXML
	private Button button1;

	@FXML
	private Label label1;

	@FXML
	void buttonPressed(ActionEvent event) {
		label1.setText("You have clicked the button! Congratulations!");
	}

}
