package exceptionsandhandling;

public class WriteData {
    public static void main(String[] args) throws java.io.IOException {//这里必须声明异常
        /**
         * 根目录为C:\Users\Jungle\Documents\VSCode>；
         * 为了整洁将score文件放置于document中。
         */
        java.io.File file = new java.io.File("document/scores.txt");
        if(file.exists()){
            System.out.println("文件已存在");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);//否则这里会报错，无法通过编译

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(78);
        output.close();
    }
}