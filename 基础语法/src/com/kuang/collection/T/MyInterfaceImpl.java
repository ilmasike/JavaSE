package com.kuang.collection.T;
/*泛型接口的实现，在implements MyInterface后面加上<>,必须填写
* */

import sun.applet.Main;

public class MyInterfaceImpl implements MyInterface<String> {
    @Override
    public Integer add() {
        return 1;
    }

    @Override
    public String add2(String s) {
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        System.out.println(myInterface.add2("布尔玛我爱你"));

    }




}
