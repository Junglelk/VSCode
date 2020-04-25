package inherit;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }
    /**
     * 设置一个自定义圆
     */
    public Circle(double radius,String color, boolean filled){
        super(color,filled); //super方法必须出现在第一行
        this.radius = radius;
        /*setColor(color);
        setFilled(filled);*/
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * @return 圆的面积
     */
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    /**
     * @return 圆的周长
     */
    public double getPerimeter(){
        return radius*Math.PI*2;
    }
    /**
     * @return 直径diameter
     */
    public double getDiameter(){
        return radius*2;
    }
    /**
     * 打印相关的数据
     */
    public void printCircle(){
        System.out.println("这个圆创建于："+super.getDateCreated()+"\n半径为："+radius);//在此处super非必须，仅作展示调用普通方法的演示
    }
    
}