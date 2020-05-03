package abstractclass_interface;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject object1 = new Circle(5);
        GeometricObject object2 = new Rectangle(5,3);

        System.out.println("两个图形面积是否相等？ "+equalArea(object1,object2));

        displayGeometricObject(object1);
        displayGeometricObject(object2);
    }
    /**
     * 这种需要两个对象进行比较的方法中，以子类传入父类参数可以更简便
     * 父类中定义了方法在这里就可直接使用，它们调用的虽不是同一个方法
     * 但可比较
     * @param object1
     * @param object2
     * @return
     */
    public static boolean equalArea(GeometricObject object1, GeometricObject object2){

        return object1.getArea()==object2.getArea();
    }
    /**
     * 这里也如上，如果在抽象类中不定义抽象方法
     * 这种分别显示的功能将很麻烦
     * @param object
     */
    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("面积为："+object.getArea());
        System.out.println("周长为："+object.getPerimeter());
    }


}