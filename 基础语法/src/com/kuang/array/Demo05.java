package com.kuang.array;

import java.util.concurrent.ForkJoinPool;

public class Demo05 {
    public static void main(String[] args) {
//        相当于定义了int a[][]=new int[5][4];
        int [][]a={{1,2,3,4},{2,3,34,4},{2,3,8,9},{3,4,7,9},{0,3,5,5}};
//        System.out.println(a[0][2]);
        test1(a[0]);
        System.out.println(a[0][0]);


//        =============================
        System.out.println("==================================");
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");

            }
            System.out.println();
        }



    }


    //写一个方法：打印数组元素
    public  static void test1(int a[]){
        for (int i : a) {
            System.out.print(i+"\t");
        }

    }
}
