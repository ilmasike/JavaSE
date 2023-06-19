package com.kuang.oop.Demo05;
//人的类，可以作为学生，等等身份的继承
//extends  继承，其实也有拓展的意思

public class Person {

    public Person() {
        System.out.println("Person类中的无参构造执行了");
    }//无参的构造器



    //    private
    public int money =10_0000_0000;
    private int age=68;
    protected String name="kuangshen";

//父类中写一个方法
    public void print(){
        System.out.println("Person");
    }


//    写几个父类的方法（子类可以继承）   new Student();后是可以用student对象调用的
    public void say(){  //public的方法，可以被继承
        System.out.println("说了一句话");
    }
}

