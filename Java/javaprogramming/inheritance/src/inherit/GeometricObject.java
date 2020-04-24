package inherit;

public class GeometricObject {

    private String  color   = "white";          //对象颜色
    private boolean filled  = false;            //是否填充颜色
    private java.util.Date  dateCreated;        //对象创建日期

    public GeometricObject(){
        dateCreated = new java.util.Date();     //创建时间类型的实例
    }

    public GeometricObject(String color , boolean filled){
        this.color  = color;
        this.filled = filled;
        dateCreated = new java.util.Date(); 
    }
/*******************两个构造方法******************/
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

    /**
     * @return 图形的属性描述
     */
    public String toString() {
        return "创建于 "+dateCreated+"\n颜色: "+color+"\n是否填充: "+filled;
    }




}