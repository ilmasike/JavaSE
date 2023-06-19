package com.kuang.Scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//从键盘接收数据
        System.out.println("使用nextLine方式接收");
        if (scanner.hasNextLine()){//判断是否还有输入
            String str=scanner.nextLine();//使用next方式进行接收
            System.out.println("输入的内容为"+str);
        }

        scanner.close();
    }
}
