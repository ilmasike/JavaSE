package com.kuang.base.com;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
//        写一个计算器的功能：加减乘除
        System.out.println("请输入你是要加法，还是减法，还是xc,1就是加法234");
        Scanner scanner = new Scanner(System.in);//胡宇飞去输入12344
        int a=scanner.nextInt();

        switch (a){
            case 1:
                System.out.println("执行加法,请输入第一个数字：");
                int a1=scanner.nextInt();
                System.out.println("请输入第二个数字");
                int a2=scanner.nextInt();


                int a_end=new Demo10().add(a1,a2);
                System.out.println("和为："+a_end);


                break;
            case 2:
                System.out.println("执行减法");
                break;
            case 3:
                System.out.println("执行乘法");
                break;
            case 4:
                System.out.println("除法");
                break;
        }




    }

    public int add(int m,int n){
        return m+n;

    }//加法完成了
}
