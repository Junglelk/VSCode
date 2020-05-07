# JavaFX基础

说在前头：VSCode内无法进行JavaFX开发。猜测原因是VSCode本质上是浏览器，可能无法调用系统窗口，也有可能是我不会配置环境。

## JavaFX程序的基本结构

>java.application.Application类定义了编写JavaFX的基本框架。

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{
    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {

    Application.launch(args);
    }

}
```

JavaFX均是

```java
public class JavaFXClassName extends Application{
    @Override
    public void start(Stage primaryStage) {

    }

}
```

开头；

```java
public static void main(String[] args) {

    Application.launch(args);
    }
```

结尾。
上述例子中，以按钮(Button)做参数创建场景(Scene)，以场景做参数创建舞台(Stage)。另外场景的一个构造方法为：Scene(node ,width , height)。

## 面板、组、UI组件以及形状

上面的示例程序中，按钮总是位于场景中间并且总是占据整个窗体。虽可以设置按钮大小和位置来解决这个问题，但最好使用称为*面板*的容器类，自动将节点放置于期望的位置和大小。结点是可视化组件，比如形状、图像视图、UI组件、组或面板。

* 形状
  * 指文本、直线、圆、椭圆、矩形、多边形、折现等。
* UI组件
  * 指标签、按钮、复选框、单选按钮、文本域、文本输入区域等。
* 组
  * 是将结点集合进行分组的容器。可以将变换或效果应用于一个组上，这将自动应用于组内每个子结点上。

Scene可以包含Control、Group或Pane，但不包含Shape或者Image、ImageView。Pane和Group可以包含任何Node的子类型。
