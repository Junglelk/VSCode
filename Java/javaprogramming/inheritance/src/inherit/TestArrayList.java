package inherit;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

            cityList.add("北京");
            cityList.add("上海");
            cityList.add("天津");
            cityList.add("重庆");
            cityList.add("广州");
            cityList.add("深圳");
            cityList.add("南京");
            cityList.add("苏州");

            System.out.println("表的大小为："+cityList.size());
                
            System.out.println("西安是否在表内？"+cityList.contains("西安"));
                
            System.out.println("天津在表内是第几个元素? "+cityList.indexOf("天津"));
                    
            System.out.println("表是空的吗?"+cityList.isEmpty());
                      

            cityList.add(2 , "西安");
            cityList.remove(1);
            cityList.remove("深圳");
            System.out.println(cityList.toString());//输出为：[北京, 西安, 天津, 重庆, 广州, 南京, 苏州]
                
            for(int i = cityList.size()-1 ; i>=0 ; i--){
                    System.out.println(cityList.get(i)+" ");
            }
                System.out.println();

            ArrayList<Circle> list = new ArrayList<>();
                list.add(new Circle(2));
                list.add(new Circle(5));

                System.out.println("圆的面积为："+list.get(0).getArea());//可见方法可传递

    }
}