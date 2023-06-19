package com.kuang.usualClass.StringClass;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
//        字符串方法的使用：
//        length（）；
//        charAt();
//        contains(String str);
//        toCharArray  :将字符串准换成数组
//        indexOf:首次出现时的下标
//        lastIndexOf:最后一次出现时的下标
        //        trim:去掉字符串前后的空格
//        toUppercase:转为大写
//        toLowwercase:转为小写
//        replase():替换某个字符
//        split:拆分
        String a=" d   javA  d  ";
        System.out.println(a.length());//打印字符串的长度
        System.out.println(a.charAt(2));//某个位置的字符
        System.out.println(a.contains("av"));
        for (int i = 0; i <a.length() ; i++) {
            System.out.print(a.toCharArray()[i]+"\t");

        }
        System.out.print(Arrays.toString(a.toCharArray()));
        System.out.println();
//        indexOf:首次出现时的下标
        System.out.println(a.indexOf("v"));
//        lastIndexOf:最后一次出现时的下标
        System.out.println(a.lastIndexOf("a"));
//        trim:去掉字符串前后的空格
        System.out.println(a.trim());
//        toUppercase:转为大写
        System.out.println(a.toUpperCase());
//        toLowwerCase:转为小写
        System.out.println(a.toLowerCase());
//        endWith（“”）：判断是否以xxx结尾
        System.out.println(a.endsWith(" "));
//        startWith("xxxx")
        System.out.println();


//        reolace:替换字符
        String b="java是最好的编程语言";
        System.out.println(a.replace("av","huzhenkun"));
        System.out.println(b.replace("java","c++"));

//        split :拆分：
//        solit([ ,]):中括号表示选择空格或者逗号
//        splic("[ ,]+"):加号表示可以连续多个，比如代码里的多个空格,多个逗号等
        String c="java is the best l,,,,,,,anguage all over the world, all we like it that we want to study it ";
        System.out.println("=============split方法的应用=====================");
        System.out.println(Arrays.toString(c.split("a")));
        for (String s:(c.split("a"))) {
            System.out.print(s);

        }
        System.out.println();


        for (String s: (c.split("[a,]+") )){
            System.out.print(s);

        }
        System.out.println();
        System.out.println("=============补充EQUALS===========");

//        补充：equals，compare（）
        String s1="hello";
        String s2="hEllo";
        System.out.println("正常比较equals:   "+s1.equals(s2));
        System.out.println("忽略大小写的比较:  "+s1.equalsIgnoreCase(s2));
        System.out.println("==============补充compare比较大小：比的都是编码表里的位置======================");
        String s3="abc";
        String s4="xyz";
        System.out.println(s3.compareTo(s4));//a:97  x:120   97-120=-23,后面的bcxx是不比较的
        String s5="abc";
        String s6="ayz";
        System.out.println(s5.compareTo(s6));//比较b、y

        System.out.println("长度不同，比长度");
        String s7="abc";//长度是3
        String s8="abcssl";//长度是6
        System.out.println(s7.compareTo(s8));//-3









    }
}
