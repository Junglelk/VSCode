package exceptionsandhandling;

public class WriteDataAutoClose {
    public static void main(String[] args) throws Exception {//这里必须声明异常
        
        java.io.File file = new java.io.File("document/scores.txt");
        if(file.exists()){
            System.out.println("文件已存在");
            System.exit(0);
        }
        try(//申请资源
            java.io.PrintWriter output = new java.io.PrintWriter(file);
        ){//使用资源
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(78);
        }
    }
}