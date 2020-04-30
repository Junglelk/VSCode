package exceptionsandhandling;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println("文件存在吗？ " +file.exists() );
        System.out.println("文件有 "+file.length()+" byte");
        System.out.println("可读吗？"+file.canRead());
        System.out.println("可写吗？"+file.canWrite());
        System.out.println("是目录吗？ "+file.isDirectory());
        System.out.println("是文件吗？"+file.isFile());
        System.out.println("是采用绝对路径创建的吗？"+file.isAbsolute());
        System.out.println("是隐藏文件吗？"+file.isHidden());
        System.out.println("绝对路径为： "+file.getAbsolutePath());
        System.out.println("最后修改时间为？"+new java.util.Date(file.lastModified()));
       
    }
}