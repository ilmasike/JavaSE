package com.kuang.usualClass.date;


import java.util.Date;

public class Demo01 {
//    Date这个类目前已经被Calendar类中的方法所取代，很多方法在解释文档可以看到，已过时
public static void main(String[] args) {

    System.out.println("=========今天的date================================");
    Date d1 = new Date();
    System.out.println(d1.toString());//Mon Nov 29 17:20:30 CST 2021
//    很多人不习惯这种格式，所以逐渐放弃这个类

    System.out.println(d1.toLocaleString());//2021-11-29 17:21:20


    System.out.println("============昨天的date=========================");
    Date d2 = new Date(d1.getTime()-(3600*24)*1000);//今天-一天打的毫秒长度
    System.out.println(d2.toLocaleString());




//    常用的方法：   after   before   compareTo  equals
    System.out.println(d2.after(d1));

    System.out.println(d1.compareTo(d2));//1：比较二者的毫秒值得大小,是否相等

    System.out.println(d1.equals(d2));











}

}
