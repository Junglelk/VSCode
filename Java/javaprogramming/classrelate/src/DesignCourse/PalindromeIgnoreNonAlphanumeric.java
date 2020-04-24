package DesignCourse;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {            //主函数
        Scanner input = new Scanner(System.in);

        System.out.println("输入一个字符串：");
        
        String s = input.nextLine();

        System.out.println("忽略非字母\n "+s+"是回文串吗？" + isPalindrome(s));     //在需要的地方直接写方法名，在以后再定义方法
    }
    public static boolean isPalindrome(String s) {                      

        String s1 = filter(s);                                                    //这里也是，需要先将字符串过滤

        String s2 = reverse(s1);                                                  //同理，反转

        return s2.equals(s1);
        
    }        

    public static String filter(String s) {                                     //补充方法定义

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    
    public static String reverse(String s) {                    
        
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();    
    }
}