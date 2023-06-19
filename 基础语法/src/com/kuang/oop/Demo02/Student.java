package com.kuang.oop.Demo02;

public class Student {
    //属性 ：实例变量
    String name;
    int  age;

    public void study(){
        System.out.println(this.name+"在学习");
    }
}

/*
* package com.kuang.oop.Demo02;



//规范的代码，一个项目应该只有一个main方法，普通类中尽量不要有main方法
public class Application {
    public static void main(String[] args) {
//类是抽象的，需要实例化：
// 类实例化后，会返回一个自己的对象！（具体的）
//        student对象就是Student类的具体实例
        Student student = new Student();
        student.name="胡振坤";
        student.study();


    }
}

*
*
* */
