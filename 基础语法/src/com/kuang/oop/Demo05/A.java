package com.kuang.oop.Demo05;

public class A extends B{
    @Override
    public void test() {
        System.out.println("A:");
    }
}



/*
* package com.kuang.oop;


import com.kuang.oop.Demo05.A;
import com.kuang.oop.Demo05.B;

public class Application {
    public static void main(String[] args) {
//       方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();//AB类的方法如果是static：调用的A

        B b=new A();//父类的引用指向子类
        b.test();//AB类的方法如果是static：调用的是B
    }
}
*/
