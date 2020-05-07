package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class FontDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new StackPane();
		
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(new Color(0.5, 0.7, 0.1, 0.2));
		pane.getChildren().add(circle);
		
		Label label = new Label();
		label.setText("JavaFX");
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane,250,200);
		primaryStage.setTitle("FontDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		
		Application.launch(args);

	}

}
