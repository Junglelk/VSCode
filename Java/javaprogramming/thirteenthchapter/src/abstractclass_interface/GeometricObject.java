package abstractclass_interface;
/**
 * 此处的GeometricObject类与十二章里的不冲突。因为在两个项目里
 * 完完全全的井水不犯河水
 * 可见public修饰符作用范围是一个项目内
 */
public abstract class GeometricObject {
    private String  color   = "white";          //对象颜色
    private boolean filled  = false;            //是否填充颜色
    private java.util.Date  dateCreated;        //对象创建日期

    protected GeometricObject(){
        dateCreated = new java.util.Date();     //创建时间类型的实例
    }

    protected GeometricObject(String color , boolean filled){
        this.color  = color;
        this.filled = filled;
        dateCreated = new java.util.Date(); 
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /**
     * @return the dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    @Override

    public String toString(){

        return "创建于："+dateCreated+"\n颜色为："+color+"\n是否填充："+filled;
    }
    /**
     * 抽象方法在抽象类中只定义不实现
     */
    public abstract double getArea();
    public abstract double getPerimeter();
}