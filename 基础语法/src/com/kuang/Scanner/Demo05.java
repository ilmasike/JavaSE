package com.kuang.Scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数字");
        double sum=0;//和
//        计算输入多少了数字
        int m=0;
        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计

        while(scanner.hasNextFloat()){
            float a=scanner.nextFloat();
            sum+=a;
            m+=1;
        }
        System.out.println("输入的总和为"+sum);
        System.out.println("输入的总和的平均数为"+(sum/m));

        scanner.close();
    }
}
