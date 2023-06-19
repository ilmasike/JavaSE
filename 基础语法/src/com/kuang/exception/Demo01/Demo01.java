package com.kuang.exception.Demo01;

public class Demo01 {
    public static void main(String[] args) {
//        new Demo01().a(); //这种递归无线调用，就会报错
//        System.out.println(11/0);//java.lang.ArithmeticException: / by zero
        System.out.println("sdfsdga");



    }

    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
