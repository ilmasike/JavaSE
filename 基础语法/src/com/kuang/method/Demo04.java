package com.kuang.method;

import static com.kuang.method.Demo01.add;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();

        System.out.println();
        demo04.test(5);
        int sum=add(3,4);

    }
    public void test(int... i){
        System.out.println(i[0]);
    }


}


