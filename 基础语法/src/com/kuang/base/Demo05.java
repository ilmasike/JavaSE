package com.kuang.base;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println();
        int i=128;
        byte b= (byte) i;
        System.out.println(b);//   -128   注意byte的最大值是127（内存溢出）
//        强制转换格式  高到低：（类型）+变量名
        System.out.println("=======================");
//        ==================================================
        //        ==================================================
        double c=i;
        System.out.println(c);
        /*
        * 注意：
        * 1.不能对布尔值进行转换：
        * 2.不能把对象类型转换为不相干的类型
        * 3.把大容量转换为低容量：强制准换，反之不用动
        * 4.转换可能存在内存溢出，或者精度问题（byte到127）
        *
        *
        * */
        System.out.println("-================强制准换========================");
        System.out.println((int)23.7);//23
        System.out.println((int)-73.73f);//-73

        char d='a';//a是97
        int e=d+1;
        System.out.println(e);//e是98
        System.out.println((char)98);//b


    }
}
