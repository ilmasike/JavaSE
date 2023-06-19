package com.kuang.struct;

public class ForDemo02 {
    public static void main(String[] args) {//一百以内的奇数偶数和
        int sum=0;
        for (int i = 0; i <=100; i++) {
            if((i%2)==0){
                sum+=i;
            }
        }
        System.out.println("所有的偶数和为"+sum);
        sum=0;
        for (int i = 0; i <= 100; i++) {
            if((i%2)!=0){
                sum+=i;
            }

        }
        System.out.println("所有的奇数和为"+sum);
    }
}
