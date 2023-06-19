package com.kuang.collection.T;
/*类是普通类，方法是泛型方法
* 语法：方法返回值的前面:<T>返回值类型
* */
public class MyGenericMethod {

    //    写一个泛型方法：
    public <T> void show(T t) {
        System.out.println("普通方法加上泛型后，执行了"+t);
    }

    public <T>int add(T a){
        System.out.println(a);
        return 0;
    }

    public static void main(String[] args) {
        MyGenericMethod my1 = new MyGenericMethod();
        my1.add(34);
        my1.show(7897);
        my1.show("bulma");
        my1.show('s');//不需要载用重载，提高代码的重用性



    }
}
