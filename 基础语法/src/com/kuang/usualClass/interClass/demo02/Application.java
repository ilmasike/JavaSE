package com.kuang.usualClass.interClass.demo02;

public class Application {
    public static void main(String[] args) {
//        (new Outer()).new Inner().show();
//属性和外部类的属性名字相同时候，会优先输出内部类的属性参数。除非：Out.this.name;
        new Outer().new Inner().show();




    }
}
