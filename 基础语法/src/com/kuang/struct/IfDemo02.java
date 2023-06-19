package com.kuang.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入成绩");
        int score=scanner.nextInt();
        if(score >69){
            System.out.println("jige");
        }else{
            System.out.println("不及格");
        }

        scanner.close();
    }
}
