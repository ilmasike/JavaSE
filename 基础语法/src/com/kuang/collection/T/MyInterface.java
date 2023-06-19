package com.kuang.collection.T;
/*泛型接口:接口名<T>
* 注意：不能创建泛型的静态常量：T t;
* */
public interface MyInterface <T>{
//    接口中可以有抽象方法，静态常量
    String name="胡振坤";
//    T t;                            //不能创建
    Integer add();
    T add2(T t);



}
