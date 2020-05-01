package exceptionsandhandling;

import java.util.Scanner;

public class ReadDataWithAutoClose {
    public static void main(String[] args) throws Exception{
        
    java.io.File file = new java.io.File("document/scores.txt");

    try(Scanner input = new Scanner(file);
    ){
        while(input.hasNext()){
            String firstName  = input.next();
            String middleName = input.next();
            String lastName   = input.next();
            int    score      = input.nextInt();
            System.out.println(firstName+ " "+middleName+" "+lastName+"的分数为:"+score );
            }
        }
    }
}