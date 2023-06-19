package com.kuang.collection.list;
/*  演示Vector： 集合
 *    Vector:数组实现结构：查询快。增删慢；效率慢。线程安全
* */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo04 {
    public static void main(String[] args) {
//        创建集合
        Vector v=new Vector();
//        1.添加元素：
        v.add("悟空");
        v.add("琪琪");
        v.add("布尔玛");
        v.add("比迪丽");
        v.add("18号");
        System.out.println(v);

//        2.删除：


//        3.遍历    因为有角标，可以for/  foreach
//        也可以使用枚举器
        Enumeration en=v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }


        System.out.println("-===============对比下迭代器======================");
        Iterator it=v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        4.判断：
        System.out.println(v.isEmpty());
        System.out.println(v.contains("悟空"));

//        5.补充方法：
        System.out.println(v.firstElement());
        System.out.println(v.elementAt(0));


    }




}
