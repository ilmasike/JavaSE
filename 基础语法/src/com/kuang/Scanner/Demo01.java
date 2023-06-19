package com.kuang.Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建扫描仪对象，用于接收键盘数据
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式进行接收");
        System.out.println("呵呵哈哈哈或");
        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            String str=scanner.next();//使用next方式进行接收
            System.out.println("输入的内容为"+str);

        }

        //用完scanner记得把它关闭
        scanner.close();
    }
}
