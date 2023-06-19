package com.kuang.collection.Map;
/*Map接口的使用：（1）存的是键值对  （2）建不能重复，值可以  （3）无序
 *
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
//        创建Map集合：
        HashMap<String, String> map = new HashMap<>();

//        1.添加元素：
        map.put("cn","中国");
        map.put("us","美国");
        map.put("uk","英国");
        map.put("cn","中国22222");//{uk=英国, cn=中国22222, us=美国}:重复元素不是增加，而是替代
        map.put("cn222","中国");


//        2.删除：
        map.remove("cn");
        System.out.println("删除之后"+map.toString());



        System.out.println(map);



//        3.Map的遍历：（1）使用keySet()返回所有key的Set集合 ,可以对keySet()使用迭代器或者增强for
//                     (2)使用entrySet方法：返回此映射中包含的映射关系的Set视图
        System.out.println("==(1)map.keySet，然后对这个Set集合进行迭代器====================================");


//        Set<String> a=map.keySet();


        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+"对应的value为：");
        }
        System.out.println("==(1)map.keySet，然后对这个Set集合进行增强for====================================");
        for (String a:
             map.keySet()) {
            System.out.println(a+"对应的value为："+map.get(a));
        }








        System.out.println("==========(2)使用entrySet方法,变为entrySet集合：entrySet<String,String> =================================");
        System.out.println(map.entrySet());//[cn222=中国, uk=英国, us=美国]

        Set<Map.Entry<String,String>> mm=map.entrySet();
//        现在也是一个Set集合了，可以进行增强for或者迭代器进行遍历：
        System.out.println("对entrySet的集合，进行增强for的遍历：");
        for (Map.Entry a:
             map.entrySet()) {
            System.out.println(a);
        }

        System.out.println("对entrySet的集合，进行增强迭代器的的遍历：");
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


//        4.判断：
        System.out.println(map.containsKey("cn"));
        System.out.println(map.containsValue("中国"));


    }





}
