package com.kuang.oop.Demo06;

public class Student extends  Person {
//    @Override
//    public void run() {
//        System.out.println("son的run");
//    }
//
//    public void eat() {
//        System.out.println("son的eat方法");
//    }
    public void go(){
        System.out.println("son的go");
    }
}






//测试类
/*
* package com.kuang.oop;


import com.kuang.oop.Demo06.Person;
import com.kuang.oop.Demo06.Student;

public class Application {
    public static void main(String[] args) {
//        一个对象的实际类型是确定的(Student)
//        但是可以指向的引用类型就不确定了(Person,object等)

        Student s1 = new Student();
        Person s2 = new Student();//父类的引用，指向子类
        Object s3=new Student();

        s1.run();
        s2.run();

        s1.eat();
//        结论：对象能执行那些方法，主要看对象左边的类型，和右边关系不大
//        Student能调用的方法，都是自己或者继承父类的
//        Person是父类，虽然可以指向子类，但是不能调用子类的方法
    }
}
*/






//测试类

/*        Object object = new Student();
        System.out.println(object instanceof  String);
        System.out.println(object instanceof  Student);
        System.out.println(object instanceof  Person);
        System.out.println(object instanceof Teacher);
        System.out.println("=======================================");

        Person person = new Student();
//        System.out.println(person instanceof  String);//编译就报错
        System.out.println(person instanceof  Student);
        System.out.println(person instanceof  Person);
        System.out.println(person instanceof Teacher);
    }*/