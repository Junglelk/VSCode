package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application{
	@Override
	public void start(Stage primary) {
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane,200,250);
		primary.setTitle("Button in Pane");
		primary.setScene(scene);
		primary.show();
	}
	public static void main(String[] args) {
		Application.launch(args);

	}

}
