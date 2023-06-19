package com.kuang.struct;

public class BreakDemo01 {
    public static void main(String[] args) {
        int i=0;
        while (i<100){
            i++;
            if(i==30){
//                break;//强制退出循环
                continue;//跳过本次循环
            }
            System.out.println(i);
        }
    }
}
