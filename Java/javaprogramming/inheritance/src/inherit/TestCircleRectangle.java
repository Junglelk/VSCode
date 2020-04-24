package inherit;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("这个圆 "+circle.toString());
        System.out.println("颜色："+circle.getColor());
        System.out.println("半径为: "+circle.getRadius());
        System.out.println("面积："+circle.getArea());
        System.out.println("直径: "+circle.getDiameter());

        Rectangle  rectangle = new Rectangle(2,4);
        System.out.println("这个长方形 "+rectangle.toString());
        System.out.println("颜色："+rectangle.getColor());
        System.out.println("面积："+rectangle.getArea());
        System.out.println("周长: "+rectangle.getPerimeter());
    }
}