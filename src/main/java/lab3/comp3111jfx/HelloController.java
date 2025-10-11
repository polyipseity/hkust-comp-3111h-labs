package lab3.comp3111jfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        // welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.setStyle("-fx-font-size: 2em");
        welcomeText.setText("Hello World!");
    }
}