package exceptionsandhandling;

import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        /**
         * 创建一个寄生于文件的对象
         */
        java.io.File file = new java.io.File("document/scores.txt");
        /**
         * 使用对象来对文件进行控制
         */
        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String firstName  = input.next();
            String middleName = input.next();
            String lastName   = input.next();
            int    score      = input.nextInt();
            System.out.println(firstName+ " "+middleName+" "+lastName+"的分数为:"+score );
        }
        input.close();
    }
}