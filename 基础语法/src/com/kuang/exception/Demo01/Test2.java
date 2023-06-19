package com.kuang.exception.Demo01;

public class Test2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;



//        ctrl+alt+t
        try {

            if (b==0) {
                throw new ArithmeticException();//主动抛出异常：throw throws
            }
            System.out.println(a/b);
        } catch (Exception e) {

            e.printStackTrace();//打印错误的栈信息：java.lang.ArithmeticException: / by zero
        } finally {
            System.out.println("aoaini");
        }
    }
}
