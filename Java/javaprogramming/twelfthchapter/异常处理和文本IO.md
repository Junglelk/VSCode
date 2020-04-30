# 异常处理和文本I/O

## 异常和异常处理

>异常是运行时错误。异常处理使得程序可以处理运行时错误，并且继续通常运行。

在程序运行过程中，如果JVM检测出一个不可能执行的操作，就会出现运行时错误。例如，如果使用一个越界的数组下标访问数组，程序就会产生一个ArrayIndexOutOfBoundsException的运行时错误。

Java中，运行时错误会当作异常抛出，**异常**就是一种对象。如果异常没有被处理，那么程序就会被终止。

异常是由方法抛出的。方法的调用者可以捕获以及处理该异常。异常可以由编程规避，比如使用if语句避开不合法输入，也可以使用异常处理程序。

```java
import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1 , int number2) {
        if(number2==0){
            throw new ArithmeticException("除数不可以为0");
        }
        /**
         * 抛出的值为new ArithmeticException("除数不可以为0")
         * 称为一个异常。
         * 异常就是一个从异常类创建的对象。这种情况下，一场就是
         * java.lang.ArithmeticException构造方法
         * ArithmeticException(str)被调用以构建一个异常对象，其中str
         * 是描述异常的消息。
         */
        return number1/number2;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("输入两个整数：");

        int number1 =input.nextInt();
        int number2 =input.nextInt();
        input.close();

        try{
            int result = quotient(number1, number2);
            System.out.println(number1+"/"+number2+"="+result);
        }
        catch (ArithmeticException ex){
            System.out.println("异常：整数不能除零");
        }
        /**
         * 当异常被抛出(throw)时，正常的流程被中断。正如“抛出异常”所示
         * 异常从一个地方扔到另一个地方。try块内包含正常情况下执行的代码
         *此处调用quotient()之后由此方法抛出一个异常。
         *抛出后，异常由catch块捕获，catch块内的代码被执行以处理异常。
         *然后执行catch之后的代码
         */

        System.out.println("程序继续...");

    }

}
```

一个try-throw-catch模板可能为：

```java
try{
    运行代码

    声明或方法抛出异常

    别的代码运行
}//抛出异常给方法的调用者
catch(type ex){
    处理异常的代码
}//由调用者处理异常
```

## 异常类型

Throwable类(可抛出)是所有异常类的根。所有Java异常类都直接或间接地继承自Throwable。可通过继承Exception或Exception的子类来创建自己的异常类。
这些异常类可分为：

1. 系统错误
   * 由Java虚拟机抛出，用Error类表示，描述内部系统错误，极少发生，一旦发生几乎只能尽量稳妥地终止程序。如：Java虚拟机崩溃、类不兼容。
2. 异常
   * 用Exception类表示，描述的是由你的程序和外部环境所引起的错误，这类错误可以被捕获和处理。如：试图使用一个不存在的类、输入/输出相关的操作。
3. 运行时异常
   * 用RunTimeException类表示，描述的是程序设计错误。如错误的类型转换，访问数组越界等。如：整数除以零、数组下标越界、非法参数。

RuntimeException类、Error类和它们的子类都属于**免检异常**，其它异常称为**必检异常**。
必检异常意味着编译器会强制程序员检查并通过try-catch块处理它们，或在头方法声明。
免检异常反应不可恢复的逻辑错误，需要在源代码中纠正。

## 其他关于异常处理的讨论

### 声明异常

无需声明RuntimeException类、Error类即*免检异常*，但*必检异常*须声明。

```java
public void myMethod() throws IOException
//有多个异常则用逗号分隔
public void myMethod() throws IOException1,Exception2,Exception3...
```

如果父类方法中没有声明异常，那么就不能在子类重写方法时声明异常。

### 抛出异常

检测到错误的程序可以创建一个合适的异常类型的实例并抛出它，这称为*抛出一个异常*。例如:程序发现传递给方法的参数与方法的合约不一致，这个程序可以创建一个IllegalArgumentException的一个实例并抛出它。

```java
IllegalArgumentException ex = new IllegalArgumentException("Wrong Argument！");
throw ex;
//或
throw new IllegalArgumentException("Wrong Argument！");
```

声明异常的关键字是***throws***，抛出异常的关键字是***throw***。

### 捕获异常

抛出一个异常时，可以在try-catch块中捕获和处理它。

```java
try{
    statements;
}
catch(Exception1 exVar1){
    handler for exception1;
}
catch(Exception1 exVar2){
    handler for exception2;
}
...
catch(Exception1 exVarN){
    handler for exceptionN;
}
//处理异常的代码称为异常处理器
//catch代码处理异常的顺序是一定的，父类不能出现在子类前
//对于使用同样代码处理不同异常的情况：
catch(Exception1 |Exception2 |...| ExceptionN ){
    statements;
}
```

### 从异常中获取信息

|java.lang.Throwable|说明|
|:---------|:---------|
|+getMessage():String|返回描述该异常对象的信息|
|+toString():String|返回三个字符串的连接:<br>1)异常类的全名;<br>2)": "冒号和以一个空白;<br>3)gerMessage()方法。|
|+printStackTrace():void|在控制台上打印Throwable对象和它的调用栈的跟踪信息|
|+getStackTrace():StackTraceElement[]|返回一个栈跟踪元素的数组，表示该异常相关对象的栈跟踪信息|

### 示例学习：声明、抛出和捕获异常

改写Circle类的setRadius方法来演示

## finally子句

无论什么情况下，finally总会执行。

```java
try{
    statements;
}
catch(TheException ex){
    handling ex;
}
finally {
    finalStatements;
}
```

即使finally前有return语句，finally依然会执行。

## File类

>file类包含了获得一个文件/目录的属性，以及对文件/目录进行改名和删除的方法。

在文件系统中，每个文件都放在一个目录下。

* 绝对文件名：由文件名和它的完整路径以及驱动器字母组成；
  * 例如：c:\book\Welcome.java是文件Welcome.java在Windows操作系统上的绝对文件名；
  * 这里c:\book称为该文件的*目录路径*；
  * 绝对文件名依赖机器；
* 相对文件名：相对于当前工作目录。对于相对文件名，完整目录被忽略。
  * 对于文件Welcome.java来说，Welcome.java就是相对文件名。
  
file类不包括读写文件内容的方法。

文件名是一个字符串。file类是文件名及其目录路径的一个包装类。如，在Windows中，语句new File("c:\\book")为目录c:\book创建个File对象。而new File("c:\\book\\test.dat")为文c:\book\test.dat创建了一个File对象。
>为目录创建对象，为文件创建对象
>注意：构建一个File实例并不会在机器上创建一个文件。不管文件不存在，都可以创建任意文件名的File实例。可以调用File实例exists()方法判断文件是否存在。
  
可以理解为file实例之于文件、目录是一种"寄生"关系，File实例寄生在目录、文件上对文件进行各种操作。

在程序中不要直接使用绝对文件名，否则程序就与编写程序的平台绑定，不利于移植。可以用new File("image/us.gif")这种创建实例方式，其中"/"是Java平台目录分隔符。
<kbd>java.io.File file = new java.io.File("image/us.gif");</kbd>目录仅到VSCode为止。
