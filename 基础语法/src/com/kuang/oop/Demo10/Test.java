package com.kuang.oop.Demo10;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.eat();//这是正常的调用
//        匿名内部类：就是没有这个过程，没有名字
        new Apple().eat();

    }
}

class Apple{
    public void eat(){
        System.out.println("吃苹果");
    }
}
