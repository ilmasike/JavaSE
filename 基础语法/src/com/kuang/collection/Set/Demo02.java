package com.kuang.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

/*set  实现类：HashSet
* 存储结构：哈希表（数组+链表+红黑树（jdk1.8之后））*/
public class Demo02 {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();
//        1.添加元素
        s1.add("小新");
        s1.add("妮妮");
        s1.add("风间");
        s1.add("正男");
        System.out.println(s1);//[风间, 正男, 小新, 妮妮]  顺序不一致

        s1.add("妮妮");
        System.out.println(s1);//[风间, 正男, 小新, 妮妮]   不允许重复

//        2.删除
        s1.remove("妮妮");
        System.out.println(s1);

//        3.遍历  ：（1）增强for  (2)迭代器
        System.out.println("======for 循环============================");
        for (String a:
             s1) {
            System.out.println(a);
        }

        System.out.println("=====迭代器====================================");

        Iterator<String> iterator = s1.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"    ");
        }
        System.out.println();

//        4.判断：  contains  isEmpty



    }
}
