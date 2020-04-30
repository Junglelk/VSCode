package exceptionsandhandling;

public class CircleWithException {
    private double radius;

    private static int numberOfObjects = 0;

    public CircleWithException(){
        this(1.0);
    }

    public CircleWithException(double newRadius){
        setRadius(newRadius);
        numberOfObjects++;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * 指setRadius方法会可能抛出一个异常，异常为“IllegalArgumentException”即非法参数异常
     * 当参数小于零时，抛出异常。在参数列表后用throws+异常名声明异常
     * @param newRadius
     * @throws IllegalArgumentException
     */
    public void setRadius(double newRadius) throws IllegalArgumentException{

            if(newRadius>=0)
            radius = newRadius;
            else
            throw new IllegalArgumentException("半径不可为负");
        }
        
        public static int getNumberOfObject() {
            return numberOfObjects;
        }

        public double findArea(){
            return radius*radius*3.14;
        }
    

}