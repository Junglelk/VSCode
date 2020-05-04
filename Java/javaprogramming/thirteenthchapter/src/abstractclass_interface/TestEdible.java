package abstractclass_interface;

public class TestEdible {
    public static void main(String[] args) {
    /**
     * 居然忘了新建类的实例的语句是
     * new 类名()
     * 有括号的
     */
    Object[] objects = {new Tiger(),new Chicken(),new Apple()};

    for(int i = 0 ; i < objects.length; i++){
        if(objects[i] instanceof Edible){
            System.out.println(((Edible)objects[i]).howToEat());
        }
        if(objects[i] instanceof Animal){
            System.out.println(((Animal)objects[i]).sound());
            }
        }
    }   
}

abstract class Animal{
    private double weight;
    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }
    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract String sound();
}

class Chicken extends Animal implements Edible{

    @Override
    public String howToEat(){
        return "怎么吃鸡：炒它！";
    }

    @Override
    public String sound(){
        return "鸡怎么叫：大爷来玩啊~";
    }
}

class Tiger extends Animal{
    @Override
    public String sound(){
        return "老虎怎么叫：嗷呜~";
    }
}

abstract class Fruit implements Edible{

}

class Apple extends Fruit{
    public String howToEat(){
        return "苹果怎么吃：洗干净直接啃";
    }
}

class Orange extends Fruit{
    public String howToEat(){
        return "橘子怎么吃：剥了皮吃";
    }
}


