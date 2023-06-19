package com.kuang.exception.Demo02;

public class Test {
//    首先写一个可能存在异常的方法：
    public static void test(int a) throws MyException{
        System.out.println("此时的传递的参数为："+a);
        if(a>10){
            throw new MyException(a);
        }
        System.out.println("OK,没有异常");
    }


    public static void main(String[] args) {
        Test t1 = new Test();
        try {
            t1.test(56);
        } catch (MyException e) {
            System.out.println("MyException→"+e);
        }


    }
}
