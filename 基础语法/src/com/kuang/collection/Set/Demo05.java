package com.kuang.collection.Set;
/*
 * 看下TreeSet  添加复杂对象数据的例子
 * 存储结构：红黑树
 * 要求：红黑树中的元素，会进行比较，这些比较的元素必须实现一个子接口：Comparable接口
 * -->方法返回值为0，认为是重复元素，不能添加
 * */

import com.kuang.collection.Student;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo05 {
    public static void main(String[] args) {
//        创建集合
        TreeSet<Student> h = new TreeSet<>();

//        1.添加元素
        h.add(new Student("xiaoxin",23));
        h.add(new Student("qiiq",13));
        h.add(new Student("sdfsdf",34));
        h.add(new Student("sdfsdf",64));//名字一样，比年龄

        System.out.println("元素个数"+h.size());//报错：Exception in thread "main" java.lang.ClassCastException:
        System.out.println(h);

//        com.kuang.collection.Student cannot be cast to java.lang.Comparable
//        这是因为红黑树的结构：二叉树要求左边要比右边小---->这要与根节点进行比较。
//        而三个Student是没办法比较的，没有比较的标准:得先实现一个子接口
//        * 要求：红黑树中的元素，会进行比较，这些比较的元素必须实现一个子接口：Comparable接口.所以Student类，实现Comparable接口。同时重写Comparator方法

//           2.删除
        h.remove(new Student("xiaoxin",23));//即便是new，也是能删除的，因为比的是name和age
        System.out.println(h);

//        3.遍历
        System.out.println("=====for遍历============================");
        for (Student a:
                h) {
            System.out.println(a);
        }

        System.out.println("=迭代器遍历==============================================");

        Iterator<Student> iterator = h.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        4.判断：
        System.out.println(h.contains(new Student("qiiq", 13)));//即便是new，也是能判断的，因为比的是name和age


    }
}
