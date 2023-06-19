package com.kuang.usualClass.baozhuangClass;

public class Demo02 {
    public static void main(String[] args) {
        int  a=24;
//        想把数字转换为字符串：1.加上"";  2.使用Integer中的toString方法,Integer.toString(a);
        String b=a+"";
        String c=new Integer(a).toString();
        String d=Integer.toString(a);

        System.out.println(c);
        System.out.println(c.equals(a));//int 和  String  :false
        System.out.println(c.equals(d));//String 之间；true
        System.out.println("========================================");
//        想把字符串转为基本类型：1.使用Integer方法：paseXXX
        String str="24235";
       int int1= Integer.parseInt(str);
        System.out.println(int1);
//        boolean字符串形式转成基本类型，“TRUE”--->true;  非"true"---->false
        String str3="true";
        String str4="sddsf";
        boolean b1 = Boolean.parseBoolean(str3);
        boolean b2 = Boolean.parseBoolean(str4);
        System.out.println(b1);//true
        System.out.println(b2);//false





    }
}
