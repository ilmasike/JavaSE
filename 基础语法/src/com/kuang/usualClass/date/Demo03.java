package com.kuang.usualClass.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) throws ParseException {
//       1. simpleDateFormat类：主要是用来格式化date（时间对象），把日期格式化为字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd,HH-mm-ss");

//        错误写法：
//        Calendar cal=Calendar.getInstance();
//        cal.getTime().toLocaleString();
//        simpleDateFormat.format(cal.getTime().toLocaleString());
//        IllegalArgumentException: Cannot format given Object as a Date



        Date date = new Date();//新建日期对象
        System.out.println("=======输出date======="+date);
        String str=simpleDateFormat.format(date);//格式化日期对象为字符串。
        System.out.println("=====输出sdf格式的时间date======================="+str);


//        3.解析：把字符串准成日期：
        Date d2=simpleDateFormat.parse("1992-3-12,12-12-12");//注意这里的字符串的格式应该与sdf保持一致才可以
        System.out.println(d2);



    }
}
