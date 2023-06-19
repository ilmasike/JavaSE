package com.kuang.array;

public class Demo03 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");

        }

        //计算总和
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("总和是"+sum);


        //查找最大值
        int max=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>=max){
                max=a[i];
            }
        }
        System.out.println("最大值是"+max);




    }
}
