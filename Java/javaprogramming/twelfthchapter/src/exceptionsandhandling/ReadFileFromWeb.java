package exceptionsandhandling;

import java.util.Scanner;

public class ReadFileFromWeb {//此程序不支持https前缀的网页
    public static void main(String[] args) {
        /**
         * 输入网址
         * 根据网址创建URL寄生实例
         * 使用此实例调用方法
         * 捕获异常
         */
        System.out.println("输入URL：");
        String URLString = new Scanner(System.in).next();//此处由于是隐式赋值，暂不知如何关闭此内存泄漏

        try {

            java.net.URL url = new java.net.URL(URLString);
            int count        = 0;
            Scanner input    = new Scanner(url.openStream());

            while(input.hasNext()){
                String line = input.nextLine();
                count      += line.length();
            }

            System.out.println("文件大小为："+count+" 字符");

        } catch (java.net.MalformedURLException e) {

            System.out.println("错误的URL");

        }catch(java.io.IOException ex){

            System.out.println("输入错误，无此文件");

        }
    }
}