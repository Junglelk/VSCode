package abstractclass_interface;

public class TestHouse {
    public static void main(String[] args) {
        House house1 = new House(10287, 1720.56);
        House house2 = (House) house1.clone();

        System.out.println("房子1编号为："+house1.getId());
        System.out.println("房子1面积为："+house1.getArea());
        System.out.println("房子1建立时间为："+house1.getWhenBuilt());
        System.out.println("房子1==房子2："+(house1==house2));
    }
}