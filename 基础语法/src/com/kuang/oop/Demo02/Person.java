package com.kuang.oop.Demo02;

public class Person {
    //在没写属性的全是空的情况下，依然能在测试类中new Person()
    //这是因为类里有默认的方法（构造方法）


    String name;
    public Person(){//定义一个构造器：无参构造
//        构造器作用：
//        1.实例化初始值：new Person的时候，会进入到这个方法中（可以debug一下）
//        2.使用new关键字，本质是在调用构造器：
        this.name="huzhnekun";//此时在Application中输出 person.name，会发现不再是null


    }


//    有参构造：一旦定义了有参构造，无参构造必须显示定义：比如你把无参构造删除，那就会在测试类中的new Person中会报错
//    alt+insert

    public Person(String name) {
        this.name = name;
    }


}









/*
* package com.kuang.oop.Demo02;



//规范的代码，一个项目应该只有一个main方法，普通类中尽量不要有main方法
public class Application {
    public static void main(String[] args) {
        //实例化对象
        Person person = new Person();
        System.out.println(person.name);


    }

}
*/