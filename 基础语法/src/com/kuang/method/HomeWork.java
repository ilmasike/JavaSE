package com.kuang.method;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

//做一个加减乘除的计算机。
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择加减乘除，1是加法，2是减法，34：");
        HomeWork homeWork = new HomeWork();
        int  select=scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("请输入要加的1值：");
                    int a=scanner.nextInt();
                System.out.println("请输入要加的2值");
                int b=scanner.nextInt();



                homeWork.add(a,b);
                System.out.println(homeWork.add(a,b));
                break;
            case 2:
                System.out.println("请输入被减数的1值：");
                int c=scanner.nextInt();
                System.out.println("请输入减数：");
                int d=scanner.nextInt();
                homeWork.sub(c,d);
                System.out.println(homeWork.sub(c,d));
                break;
            case 3:
                System.out.println("请输入乘数：");
                int e=scanner.nextInt();
                System.out.println("请输入被乘数：");
                int f=scanner.nextInt();
                homeWork.couple(e,f);
                System.out.println(homeWork.couple(e,f));
                break;
            case 4:
                System.out.println("请输入被除数：");
                int g=scanner.nextInt();
                System.out.println("请输入除数：");
                int h=scanner.nextInt();
                homeWork.chufa(g,h);
                System.out.println(homeWork.chufa(g,h));
                break;


        }

        scanner.close();


    }

    //加法：
   public static double add(double a,double... b){
        if(b.length==1){
            return a+b[0];
        }else{
            double sum=0;
            for (int i = 0; i < b.length; i++) {
                sum+=b[i];
            }
            return a+sum;
        }
   }

   //减法
    public static double sub(double a,double... b){
        if(b.length==1){
            return a-b[0];
        }else{
            double sum=0;
            for (int i = 0; i <b.length ; i++) {
                sum-=b[i];
            }
            return a+sum;
        }
    }


    //乘法
    public static double couple(double a,double...b){
        if(b.length==1){
            return a*b[0];
        }else{
            double sum=1;
            for (int i = 0; i <b.length ; i++) {
                sum*=b[i];
            }
            return a*sum;

        }


    }

    //除法
    public static double chufa(double a,double...b){
        if(b.length==1){
            return a/b[0];
        } else{
            double sum=1;
            for (int i = 0; i <b.length ; i++) {
                sum*=b[i];
            }
            return a/sum;
        }


    }
}
