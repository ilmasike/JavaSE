package com.kuang.oprator;

public class Demo07 {
    public static void main(String[] args) {
//     a+=b;
        int a=10;
        int b=20;
        a+=b;
        System.out.println(a);
//        字符串连接符
        System.out.println(a+b);//30
        System.out.println(""+a+b);//3020  先变成字符转然后拼接
//        但是如果""  是在后面
        System.out.println(a+b+"");//50   先算再变成字符串

    }
}
