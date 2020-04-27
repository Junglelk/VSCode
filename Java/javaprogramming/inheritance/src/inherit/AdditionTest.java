package inherit;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionTest {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        
        System.out.println("请回答"+number1+"+"+number2+"=？");

        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> answerList = new ArrayList<>();

        int answer = input.nextInt();

        while(answer!=number1+number2){
            if(answerList.contains(answer)){
                System.out.println("你已经猜过 "+answer+" 了");
            }
            else 
            answerList.add(answer);
            System.out.println("猜错了，请继续");
            answer = input.nextInt();
        }

        System.out.println("你猜对了");

    }
}