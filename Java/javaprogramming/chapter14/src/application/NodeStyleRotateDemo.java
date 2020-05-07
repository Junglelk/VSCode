package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
	/*
	 * 可以创建自己喜欢的颜色
	 * Color color1 = new Color(0.2,0.3,0.7,0.8);
	 * 导入的包为：javafx.scene.paint.Color;
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane pane = new StackPane();
		Button btOK    = new Button("OK");
		
		btOK.setStyle("-fx-border-color:blue");
		pane.getChildren().add(btOK);
		pane.setRotate(30);
		
		pane.setStyle("-fx-border-color:red;-fx-background-color:lightgray;");
		
		Scene scene = new Scene(pane,250,200);
		primaryStage.setTitle("NodeStyleRotateDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
