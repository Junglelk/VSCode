package inherit;

public class PolymorphismDemo { //多态演示
    public static void main(String[] args) {

        displayObject(new Circle(1,"red",false));            //传入的为子类型
        displayObject(new Rectangle(1,1,"black",false)); 
    }
    
    public static void displayObject(GeometricObject object) {//此方法需要的是父类型GeometricObject

        System.out.println("创建于 "+object.getDateCreated()+"颜色为"+object.getColor());
        
    }
}