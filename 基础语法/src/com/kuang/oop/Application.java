package com.kuang.oop;

import com.kuang.oop.Demo10.Outer;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();//先把外部类实例化
        outer.out();

//        对于内部类，可以通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();



    }
}
