package com.kuang.method;

public class Demo06 {
    //阶乘：2！=2*1     3！=3*2*1
    public static void main(String[] args) {
        Demo06 demo06 = new Demo06();
        int sum=demo06.digui(10);
        System.out.println(sum);

    }

    //
    public static int digui(int n){//这是实现阶乘-----的递归算法
        if(n==1){
            return 1;
        }else {
            return n*digui(n-1);
        }



    }





}
