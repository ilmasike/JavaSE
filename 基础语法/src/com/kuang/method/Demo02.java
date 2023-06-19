package com.kuang.method;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println(test(7.89,789));


    }


    //比大小
    public static String test(int a,int b){
        int max=-1;
        if(a>b){
           max=a;
        }else{
            max=b;
        }
        return max+"是最大hhhhh值";//return除了返回结果，还有终止方法的作用

    }

    //重载 ：比大小
    //比大小
    public static String  test(double a,double b){
        double max=-1;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max+"是最大zzz值";//return除了返回结果，还有终止方法的作用

    }
}
