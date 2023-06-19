package com.kuang.usualClass.interClass.demo01;

public class Body {
    private String name;

    class Header{

        public void show(){
            System.out.println(name);//内部类是可以访问外部类的私有属性的
        }


    }


    public static void main(String[] args) {

        System.out.println(new Body().name);



    }


}
