package com.kuang.usualClass.bigDecimal;

import com.sun.xml.internal.messaging.saaj.soap.ver1_2.Body1_2Impl;

import java.math.BigDecimal;

public class Demo01 {
    public static void main(String[] args) {
        double d1=1.0;
        double d2=0.9;
        System.out.println(d1-d2);//-0.09999999999999998
        double result=(1.4-0.5)/0.9;//0.9999999999999999

        System.out.println(result);
//        原因出在double上，存的是0.9但是内存存的不是0.9只是近似0.9（有极小的误差）
//        银行要求精度非常高：要用精度更高的类：BigDecimal
        BigDecimal b1 = new BigDecimal("1.0");//记住这里要用字符串，不要用int类型
        BigDecimal b2 = new BigDecimal("0.9");
        System.out.println(b1.subtract(b2));//类做减法，不能再用运算符
//        System.out.println(b1.intValue()-b2.intValue());//结果错误，不要这么做。类的减法，不要用int类型



//        加法
        System.out.println("===================加法==================");
        System.out.println(b1.add(b2));

        System.out.println("===================乘法====================");
        System.out.println(b1.multiply(b2));

        System.out.println("====================除法=====================");
        System.out.println(b2.divide(b1));//除法如果除不尽，可能会报错，可以用divide（）重载方法：保留几位小数

        BigDecimal b3=new BigDecimal("1").divide(b2,2,BigDecimal.ROUND_HALF_UP);//BigDecimal.ROUND_HALF_UP四舍五入
     //保留2位小数
        System.out.println(b3);









    }

}
