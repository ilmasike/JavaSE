package com.kuang.oop.Demo05;

//学生  也是人。可以继承person
//除了使用extends，还可以组合，把person作为一个属性
public class Student extends Person{
//    Person person;


    public Student() {//子类中的无参构造
//        super();隐藏代码 super();：调用了父类的无参构造
//        super();此外这一行的super必须在第一行，否则报错：调用父类的构造器必须在子类构造器的第一行。
//        this调用自己的构造器也是得第一行。
//        所以this和super不可能同时使用它们调用构造器的功能,因为它们都要出现在第一行代码位置。
        System.out.println("子类student的无参构造执行了");
    }


    //子类中写一个与父类同名实例变量
private String name="qinjiang";

//测试实力变量
public void test(String name){
    System.out.println(name);//这个是参数name
    System.out.println(this.name);//这个是子类的name
    System.out.println(super.name);//这个是父类中的name

}



//子类中写一个与父类同名方法
    public void print(){
        System.out.println("student");
    }
//测试方法，在测试类里进行调用：
    public void test2(){
    print();//这个是子类的方法
    this.print();//这个是子类的方法
    super.print();//这个是父类的方法


    }



}
