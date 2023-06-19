package com.kuang.usualClass.interClass.demo03;

public class TestUsb {


    public static void main(String[] args) {
        new Mouse().service();

//        匿名内部类：相当于创建了一个局部内部类
        new Usb(){

            @Override
            public void service() {
                System.out.println("接口中的风扇功能的匿名内部类");
            }
        }.service();



    }
}
