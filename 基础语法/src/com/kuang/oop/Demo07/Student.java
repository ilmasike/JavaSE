package com.kuang.oop.Demo07;
//static 的总结：

public class Student {
    private static int age;//静态变量
    private double score;//非静态

    public   void run(){
        go();
    }
    public static   void go(){}





    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.score);


//        对于静态变量，可以通过类来调用,    但是类无法调用非静态变量
        System.out.println(Student.age);
//        System.out.println(Student.score);   //报错


        System.out.println("=============对于静态方法，非静态方法的调用=========");
//        想调用非静态的run，得先有Student对象可以
        Student s2 = new Student();
        s2.run();
//        静态方法就很容易调用：
        go();


    }
}
