package com.kuang.collection.list;
/*
* 常见的实现类：Arraylist :数组实现结构：查询快。增删慢；效率快。线程不安全
*               Vector:数组实现结构：查询快。增删慢；效率慢。线程安全
*               LinkedList：链表实现结构：增删快，查询慢：
*
* */

//ArrayList集合的使用：

import com.kuang.collection.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo03 {
    public static void main(String[] args) {
//        创建集合
        ArrayList al1=new ArrayList();//此时的默认容量为0.size也为0.
//        1.添加元素：
        Student s1=new Student("悟空",23);
        Student s2=new Student("琪琪",24);
        Student s3=new Student("布尔玛",27);

        al1.add(s1);//add()。
        al1.add(s2);
        al1.add(s3);
        System.out.println(al1);


//        2.删除元素
        al1.remove(s1);
        System.out.println(al1);
//        这个时候判断下：new Studnet的写法：会有效果吗？
//        al1.remove(new Student("布尔玛",27));//注意在未重写equals方法的情况下：这行代码无效，因为remove中
//        是用的equals来对比，对比的是地址。new是新地址，不代表老地址，因此对老的对象没影响---->即代码无效
//        但是重写equals后，我们把equals对比由对比地址改为对比属性，就可以删掉了
        al1.remove(new Student("布尔玛",27));//可以删掉 布尔玛了
        System.out.println(al1);




//        3.遍历元素【重点】  （1）增强for  （2）迭代器   列表迭代器
        al1.add(s1);
        al1.add(s3);
        System.out.println("==============迭代器=================================");
       Iterator it1= al1.iterator();
       while(it1.hasNext()){
           System.out.println(it1.next());
       }
        System.out.println("==============列表迭代器=================================");
       ListIterator listIterator=al1.listIterator();
       while (listIterator.hasNext()){
           System.out.println(listIterator.next());
       }
       while (listIterator.hasPrevious()){
           System.out.println(listIterator.previous());
       }








//        4.判断
        System.out.println(al1.isEmpty());
        System.out.println(al1.contains(new Student("布尔玛",27)));//因为重写了equals，这里是TRUE

//        5.查找
        System.out.println(al1.indexOf(s2));
        System.out.println(al1.indexOf(new Student("悟空",23)));//因为重写了equals，这里可以运行比较




    }
}
