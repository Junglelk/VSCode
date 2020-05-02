package exceptionsandhandling;

import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    /**
     * 将起始URL添加到名为listOfPendingURLs的列表中；
     * 当listOfPendingURLs不为空且listOfTraverseURLs的长度<=100{
     * 从listOfPendingURLs中移除一个URL；
     *      如果该URL不在listOfTraverseURLs中{
     *      将它添加到listOfTraverseURLs中；
     *      打印该URL；
     * 读取该URL，并对该页面中包含的每个URL进行如下操作{
     * 如果不在listOfTraverseURLs中，则将其添加到listOfPendingURLs中；
     *          }
     *      }
     * }
     */

     public static void main(String[] args) {
         System.out.println("请输入一个URL：");
         Scanner input = new Scanner(System.in);
         String  url   = input.nextLine();
         crawler(url); 
     }

     public static void crawler(String startURL) {

         ArrayList<String>  listOfPendingURls = new ArrayList<>();
         ArrayList<String>  listTraversedURLs = new ArrayList<>();

         listOfPendingURls.add(startURL);

         while(!listOfPendingURls.isEmpty()&&listTraversedURLs.size()<=100){

            String urlString = listOfPendingURls.remove(0);

            if(!listOfPendingURls.contains(urlString)){

                listTraversedURLs.add(urlString);

                System.out.println("Crawler: "+urlString);

                for(String s : getSubURLs(urlString)){

                    if(!listTraversedURLs.contains(s)){

                        listOfPendingURls.add(s);
                    }
                }
            }

         }
     }

     public static ArrayList<String> getSubURLs(String urlString) {

        ArrayList<String> list = new ArrayList<>();

        try {

            java.net.URL url = new java.net.URL(urlString);

            Scanner input    = new Scanner(url.openStream());

            int current = 0;

            while(input.hasNext()){//输入流还有空行时循环

                String line  = input.nextLine();

                current      = line.indexOf("http:", current);//一开始current为0，即最初的输入流也是第一个URL的起点

                while(current>0){

                    int endIndex = line.indexOf("\"", current);

                    if(endIndex > 0){
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    }
                    else current = -1;
                } 
            }
        } 
        catch (Exception ex) {

            System.out.println("Error: "+ex.getMessage());         
        }

        return list;
    }
}