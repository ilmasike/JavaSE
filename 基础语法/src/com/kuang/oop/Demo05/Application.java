package com.kuang.oop.Demo05;


public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.say();//这个say方法完全是Person类里的，只是Student已经继承了Person，所以可以调用
        System.out.println(s1.money);  //money 是public修饰的实例变量，所以可以被继承
//        但是private这种修饰的变量，无法继承


        Student student = new Student();//新建对象时，会先走构造器：结果发现父子类的无参构造器都走了一遍
//      这说明Student类中的无参构造中，有隐藏代码，调用了父类的无参构造
        System.out.println("=======================父子类中的实例变量======================");
        student.test("琴江");//这个是对实例变量 进行的测试

        System.out.println("=======================父子类中的方法======================");

        student.test2();//这个是对方法进行的测试


    }
}
