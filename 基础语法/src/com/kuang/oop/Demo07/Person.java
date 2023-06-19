package com.kuang.oop.Demo07;

public class Person {
   {
       System.out.println("匿名代码块,常用来赋初始值");
   }

   static {
       System.out.println("静态代码块");
   }


    public Person() {
        System.out.println("无参构造器");
    }


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("==============================");
        Person person1 = new Person();
        System.out.println("==============================");
        Person person2 = new Person();
        System.out.println("==============================");
        Person person3 = new Person();




    }
}
