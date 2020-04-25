package inherit;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1,1);

        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object) {
        if(object instanceof Circle){
            System.out.println("圆的面积为："+((Circle)object).getArea());
            System.out.println("圆的直径为："+((Circle)object).getDiameter());
        }
        else if(object instanceof Rectangle){
            System.out.println("长方形面积为："+((Rectangle)object).getArea());
        }      
    }

}