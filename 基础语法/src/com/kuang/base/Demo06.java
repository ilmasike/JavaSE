package com.kuang.base;

public class Demo06 {
    public static void main(String[] args) {
//        注意操作比较大的数，注意溢出问题
        int money=10_0000_0000;//jdk7新特性，数字可以用下划线分割
        System.out.println(money);
        int years=20;
        int total=money*years;
        System.out.println(total);//输出一个-1474836480，并不是贰拾亿，就是计算时候溢出了
        long total3=money*((long)years);//先把一个数转换为long类型
        System.out.println(total3);




    }
}
