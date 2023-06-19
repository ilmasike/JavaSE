package com.kuang.usualClass.baozhuangClass;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(new Integer(3).MAX_VALUE);
//        类型转换：基本类型转换为引用类型
        int num1=10;//栈中
        System.out.println(new Integer(num1));
        Integer integer = new Integer(num1);//装箱有两种写法
        Integer integer1 = Integer.valueOf(num1);
        System.out.println(integer1);


        System.out.println("============================");//拆箱
        Integer integer2 = new Integer(100);
        int a = integer2.intValue();//通过使用intValue方法、
        System.out.println(a);


        System.out.println("==============jdk1.5之后就可以自动装箱拆箱==========");
        Integer integer3 = 8999;//自动装箱
        int b=integer3;//自动拆箱
        System.out.println(integer3);

        System.out.println(b);





    }

}
