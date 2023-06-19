package com.kuang.Scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println("=====================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据");
//        ==============================================
        String str=scanner.nextLine();//使用next方式进行接收
        System.out.println("输入的内容为"+str);
        System.out.println("====================================");
        String str2=scanner.nextLine();//使用next方式进行接收
        System.out.println("梅开二度---输入的内容为："+str2);

        scanner.close();



    }
}
