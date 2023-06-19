package com.kuang.oop.demo01;

public class Demo05 {
    //    引用传递:传递一个对象，本质还是值传递
    public static void main(String[] args) {
        Person person = new Person();//类的实例化
        System.out.println(person.name);//null
        Demo05.change(person);
        System.out.println("=================================");
        System.out.println(person.name);//这次的值传递输出的不再是null(对比demo04)
//        输出的是huzhenkun
//        person.name是修改成功了，输出不再是null，他修改的是类Person中的值，而不是方法change中的值




    }
    //    注意这里返回值为空，只是执行了一个操作
    public static void change(Person person){
//        这里person是一个对象：指向的是Person person = new Person();这是一个具体的人，可以改变属性
//        她虽然走的是这个方法，但是他把"huzhenkun"传给了Person person = new Person()中的person
//
        person.name="huzhenkun";
    }
}

//定义一个person类
class Person{
    String name;//实例变量（属性）



}
