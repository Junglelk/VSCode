package exceptionsandhandling;

import java.util.Scanner;

class CreateFile 
{
    	public static void main(String[] args) 
	{
        System.out.println("输入目录：");
        
        String filename = new Scanner(System.in).nextLine();
        
        java.io.File newDir = new java.io.File(filename);
        /**
         * 在当前目录创建一个文件夹
         * 如果输入目录从根目录开始，则可以创建输入目录
         */
        
		if(newDir.exists()) {

            System.out.println("目录已存在");
            
        }
		else {

            newDir.mkdir();
            
            System.out.println("成功创建目录");
            
		}
	}
}
