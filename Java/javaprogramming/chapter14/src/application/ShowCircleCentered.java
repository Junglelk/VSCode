package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane pane =	new Pane();//创建一个面板
		
		/*
		 * 再创建一个圆
		 */
		Circle circle = new Circle();									
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));//属性绑定
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.BLUE);
		
		/*
		 * 把圆放进面板里
		 */
		pane.getChildren().add(circle);
		/*
		 * 将面板放在场景里
		 */
		Scene scene = new Scene(pane, 200,250);
		
		/*
		 * 设定舞台
		 */
		primaryStage.setTitle("ShowCircleCentered");
		/*
		 *将场景放在舞台上
		 */
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		
		Application.launch(args);

	}

}
