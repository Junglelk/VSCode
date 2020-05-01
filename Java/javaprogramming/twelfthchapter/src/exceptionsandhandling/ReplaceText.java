package exceptionsandhandling;
/**
 * 此代码必须使用命令提示符，
 * 复制到某一文件夹下再编译运行
 */

import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception{
        /**
         * 检查输入字符串数组，若参数数不足，退出；
         * 检查源文件是否存在，不存在，退出
         * 检查输出文件是否存在，存在，退出
         * 源文件存在，目标文件尚无时，用第四个参数替换第三个参数
         */
        if(args.length!=4){
            System.out.println("格式为：java ReplaceText 源文件名 目标文件名 被替换字符 替换字符");
            System.exit(1);
        }

        java.io.File sourceFile = new java.io.File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("源文件 "+args[0]+" 不存在。");
            System.exit(2);
        }

        java.io.File targetFile = new java.io.File(args[1]);
        if(targetFile.exists()){
            System.out.println("目标文件 "+args[1]+" 已存在");
            System.exit(3);
        }

        try (
            Scanner     input  = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);//创建一个文件并寄生，文件名是targetFile，用于寄生并操控此文件的PrintWriter对象为output
        ) {
            while(input.hasNext()){
                String s1 = input.nextLine();//读取一行源文件
                String s2 = s1.replaceAll(args[2], args[3]);//猜测replaceAll方法是将这一行内的一个字符换成另一个字符
                output.println(s2);//向output寄生的文件写入字符串s2
            }
        } 

    }
}