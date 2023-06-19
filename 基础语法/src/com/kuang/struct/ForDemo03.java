package com.kuang.struct;

public class ForDemo03 {
    public static void main(String[] args) {//1000内的能被5整除的数，并且每行输出3个
        int rand=0;
        for (int i = 0; i <= 1000; i++) {
            if((i%5)==0){

                rand++;
                if((rand%3)!=0) {
                    System.out.print(i+" ");
                }else{
                    System.out.println(i);
                }
            }

        }

    }
}
