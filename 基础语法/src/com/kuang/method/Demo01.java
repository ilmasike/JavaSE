package com.kuang.method;

public class Demo01 {
    public static void main(String[] args) {
        int sum=add(3,4);
        System.out.println(sum);
//        test();

    }
    //加法
    public static int add(int a,int b){
        return a+b;
    }


//1000内的能被5整除的数，并且每行输出3个
    public static void test(){
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
