package exceptionsandhandling;
/**
 * 程序清单12-4
 */
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