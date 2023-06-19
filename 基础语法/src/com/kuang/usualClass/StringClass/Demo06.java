package com.kuang.usualClass.StringClass;

public class Demo06 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        //        测试下String的用时：
//        String s="";
//        for (int i = 0; i <99999 ; i++) {
//            s+=i;
//        }
//        System.out.println(s);//1800



        //        测试下StringBuilder的用时：

        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i <99999 ; i++) {
            s2.append(i);
        }
        System.out.println(s2.toString());//26s




        System.out.println("用时："+(System.currentTimeMillis()-l));

    }
}
