package com.kuang.usualClass.interClass.demo02;
//成员内部类
public class Outer {
    private  String name="胡图图";
    private int age=20;


    class Inner{  //成员内部类
        private String address="北京";
        private String phone="131....0127";
        private String name="卡卡罗特 kakarroto";
        //        private  static  int id=10;成员内部类里不允许有static静态属性。但是可以包含静态常量
        private  static  final int id=10;//静态常量
        public void show(){
            System.out.println(name);//nei部类的属性
            System.out.println(Outer.this.name);//外部类的属性

            System.out.println(phone);//内部类的属性
        }


    }

    public static void main(String[] args) {
        (new Outer()).new Inner().show();
    }
}
