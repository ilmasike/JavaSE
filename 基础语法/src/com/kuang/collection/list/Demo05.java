package com.kuang.collection.list;
/*LinkedList类的使用：
* LinkedList：链表实现结构：增删快，查询慢：
*
* */

import com.kuang.collection.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo05 {
    public static void main(String[] args) {
//        创建集合
        LinkedList ll=new LinkedList();
//        1.添加元素:z这里不再添加简单的字符，直接添加学生对象

        Student s1=new Student("悟空",23);
        Student s2=new Student("琪琪",24);
        Student s3=new Student("布尔玛",27);
        Student s4=new Student("佐仓千代",17);


        ll.add(s1);
        ll.add(s2);
        ll.add(s3);
        ll.add(s4);
        ll.add(new Student("山吹见取",28));
        ll.add(new Student("濑尾结月",21));
        ll.add(new Student("木之本樱",19));




//        2.删除操作：  remove
        System.out.println("==================删除===========================================");
        ll.remove(s1);
        System.out.println(ll);

//        试下这种能否删除：此时equals已经重写，在删除时，就会判断属性来进行删除，是可以删除的
        ll.remove(new Student("山吹见取",28));//能删除成功
        System.out.println(ll);

//        清空 clear

//        3.遍历操作（1）for   （2）
        System.out.println("===================使用for遍历====================");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("大家好，我是胡振坤，给大家介绍一些："+ll.get(i)+"是我想要的女朋友");
        }

        System.out.println("================使用增强for======================================");
        for (Object AA:
             ll) {
            System.out.println(AA);
        }

        System.out.println("============使用迭代器进行遍历================================");
        Iterator l=ll.iterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }

        System.out.println("============使用列表迭代器进行遍历=============================================");
        ListIterator listIterator=ll.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

//        4.判断：isEmpty  contains

//        5.获取


        System.out.println("================获取=========================");
        System.out.println(ll.get(2));
        System.out.println(ll.indexOf(s1));


//        5.删除，查找
        ll.remove();


















    }
}
