package com.kuang.array;

public class Demo01 {
    public static void main(String[] args) {//数组类型
        int nums[];
        nums=new int[4];
        nums[0]=3;

        int []a;
        a=new int[9];
        //============================
        int []b=new int[8];//声明一个数组
        int sum=0;
        for (int i = 0; i < b.length; i++) {
            b[i]=i+10;
            sum+=b[i];
        }
        System.out.println(sum);









//        System.out.println(b.length);

//        for (int i = 0; i < 8; i++) {
//            b[i]=i+10;
//            System.out.println(b[i]);
//        }



    }
}
