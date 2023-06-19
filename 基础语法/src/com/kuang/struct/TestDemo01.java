package com.kuang.struct;

import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你想做多少行，的三角形：");

        int num=scanner.nextInt();
        //打印三角形
        for (int i = 0; i < num; i++) {


            for (int m = 0; m < (num-i); m++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i-1); j++) {

                System.out.print("*");

            }
            System.out.println();

        }
        scanner.close();
    }

}
