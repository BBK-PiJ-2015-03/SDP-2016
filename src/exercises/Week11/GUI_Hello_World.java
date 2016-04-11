package exercises.Week11;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class GUI_Hello_World extends Application {
    int count = 0;
    @Override
    public void start(Stage stage) {
        Label counterLabel = new Label("Count: 0");
        Button incButton = new Button("Increment Count");
        incButton.setOnAction(event -> counterLabel.setText("Count: "
                + (++count)));
        stage.show();
    }
}