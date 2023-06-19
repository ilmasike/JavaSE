package com.kuang.usualClass.StringClass;


import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        String str="this is a text";
//        1.将str中的单词单独获取出来
        String arr[]=str.split(" ");
//        把首字母大写
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1)+"  ");
        }







    }
}
