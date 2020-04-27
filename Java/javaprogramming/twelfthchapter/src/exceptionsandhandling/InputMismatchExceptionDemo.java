package exceptionsandhandling;

import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continueInput = true; //continue为保留字，不能当作变量名

        do{
            try {
                System.out.println("请输入一个整数：");
                int number = input.nextInt();
                System.out.println("输入的数字为："+number);
                continueInput =false;
            } catch (Exception e) {
                System.out.println("再试一遍，要求输入整数");
                input.nextLine();
            }
        }while(continueInput);
    }
}