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
