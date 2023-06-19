package com.kuang.array;

public class Demo02 {
    public static void main(String[] args) {
        //静态初始化  除了int a[]=new int[10]外的方法;
        int[]m={1,2,3,4,5,6};
        System.out.println(m[2]);


        System.out.println("====================");
//        Man mans[] = new Man[3];
//        Man mans[]={new Man(),new Man(),};//看看即可


        //动态初始化:包含默认初始化------数组中有默认值：int默认0，String默认null
        int a[]=new int[10];
        a[0]=13;
        System.out.println(a[0]);
        System.out.println(a[2]);





    }
}
