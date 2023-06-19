package com.kuang.oop.demo01;

public class Demo02 {




    public static void main(String[] args) {

//        如果是静态方法，可以直接通过类名进行调用：Studnent.say();
//        如果不是静态方法，那么就实例化这个类
//        Student student = new Student();
        new Student().say();//或者写成Student student = new Student();
//        student.say();



    }
    public static void a(){
//        b();    //调用b会报错
//        会发现static静态方法，并不能调用普通方法b();
//        这是因为static是和类一起加载的，类Demo02创建时，就已经存在
//        b()方法是类实例化  之后才存在
    }



//    类实例化  之后才存在
    public void b(){

    }

//    静态方法:static
//    非静态方法：

}
