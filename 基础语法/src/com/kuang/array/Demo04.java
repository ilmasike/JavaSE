package com.kuang.array;
//增强for循环在数组中的使用

import java.lang.reflect.Array;

public class Demo04 {
    public static void main(String[] args) {

        
        int a[]={1,2,3,4,5};//增强for循环：a.for

        for (int i : a) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("反转数组为：");
        reverse(a);//反转数组方法


        System.out.println("==========================");
        int []b={1,3,45,6,7,8};
        System.out.println("打印的数组为：");
        test1(b);//打印数组
    }

    //写一个方法：打印数组元素
    public  static void test1(int a[]){
        for (int i : a) {
            System.out.print(i+"\t");
        }

    }

    //反转数组
    public static void reverse(int a[]){
        int result[]=new int[a.length];
        for (int i = 0,j=a.length-1;i<a.length; i++,j--) {
            result[j]=a[i];
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(result[i]+"\t");
        }


    }








}
