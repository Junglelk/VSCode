package inherit;

public class Rectangle extends GeometricObject{
    private double width  = 1;
    private double height = 1;

    public Rectangle(){

    }

    public Rectangle(double width , double height){
        this.width  = width;
        this.height = height;
    }

    public Rectangle(double width , double height, String color, boolean filled){
        this.width  = width;
        this.height = height;
        setColor(color);        //this.color  = color;
        setFilled(filled);      //this.filled = filled;    
    }
    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return width*2+height*2;
    }

}