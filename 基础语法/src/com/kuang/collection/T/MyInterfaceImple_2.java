package com.kuang.collection.T;
/*泛型<>实现类  :也可以不指定接口类型
*
* */

public class MyInterfaceImple_2<T> implements MyInterface<T>{
    @Override
    public Integer add() {
        return null;
    }

    @Override
    public T add2(T t) {
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        MyInterfaceImple_2<Integer> objectMyInterfaceImple_2 = new MyInterfaceImple_2<>();
        System.out.println(objectMyInterfaceImple_2.add2(24));


        /*
        * 所以写实现类的时候，有两种：
        * 1. 直接确定好类型public class MyInterfaceImpl implements MyInterface<String> {
        * 2. 实现类，也是一个泛型类。public class MyInterfaceImple_2<T> implements MyInterface<T>{

         * */


    }












}
