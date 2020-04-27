package inherit;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();
    public boolean isEmpty(){
        return list.size()==0;
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(list.size()-1);
    }
    public Object pop(){
        Object o = list.get(list.size()-1);
        list.remove(list.size()-1);
        return o;
        //return list.get(list.size()-1);
    }
    public void push(Object o){
        list.add(o);
    }
    @Override
    public String toString(){
        return "stack" +list.toString();
    }

}
/*MyStack是一个类，地位等同于Integer，可以创建MyStack类型对象的数组等
MyStack内有ArrayList，即ArrayList是MyStack的一部分，是一种组合。
组合本质上意味着声明一个实例变量用于引用一个对象，该对象称为被组合了。
*/