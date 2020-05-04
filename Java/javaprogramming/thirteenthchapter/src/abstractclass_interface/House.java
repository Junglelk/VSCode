package abstractclass_interface;

public class House implements Comparable<House>,Cloneable {
    private int id;
    private double area;
    private java.util.Date whenBuilt;
    

    public House(int id , double area){
        this.id   = id;
        this.area = area;
        this.whenBuilt = new java.util.Date();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @return the whenBuilt
     */
    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(House o){
        return area>o.area ? 1 :(area==o.area? 0:-1);
    }
}