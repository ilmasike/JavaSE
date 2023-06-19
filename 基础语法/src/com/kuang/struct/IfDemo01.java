package com.kuang.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("q请输入");
        String s=scanner.nextLine();
        if(s.equals("hello")){
            System.out.println("End");
        }



        scanner.close();
    }
}
