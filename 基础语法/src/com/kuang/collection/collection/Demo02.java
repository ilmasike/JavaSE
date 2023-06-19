package com.kuang.collection.collection;
/*collection的使用：刚刚是保存字符串，现在是来保存学生信息*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
//        1. 新建Collection对象
        Collection c=new ArrayList();
//        2.添加学生
        Student s1=new Student("卡卡罗特",23);
        Student s2=new Student("琪琪",24);

        Student s3=new Student("布尔玛",27);

        Student s4=new Student("乌龙",22);

        Student s5=new Student("天津饭",35);

        Student s6=new Student("龟仙人",323);
        Student s7=new Student("克林",27);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);
        c.add(s6);
        c.add(s7);

        System.out.println("一共有"+c.size()+"个Student对象：  "+"\n"+c.toString());
//        2.删除：
        System.out.println("===============执行删除的操作=============================");
        c.remove(s1);
        System.out.println("一共有"+c.size()+"个Student对象：  "+"\n"+c.toString());

//        3.清空；
        System.out.println("===============执行qingkong的操作=============================");

//        c.clear();
        System.out.println("一共有"+c.size()+"个Student对象：  "+"\n"+c.toString());
//        注意这里并没有删除s1,s2,s3等等这些对象，只是把c集合里存储的  对象地址  给清空了。

//        4.遍历：（1）foreach   (2)Iterator
        System.out.println("============执行遍历的操作======================");
        System.out.println("用增强for执行遍历");
        for (Object s:
             c) {
            Student ss=(Student) s;
            System.out.println(ss);
        }
        System.out.println("===================================用Iterator执行遍历");

        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        4.判断
        System.out.println(c.isEmpty());









    }
}




//学生类
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
