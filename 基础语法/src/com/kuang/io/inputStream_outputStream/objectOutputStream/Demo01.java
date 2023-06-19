package com.kuang.io.inputStream_outputStream.objectOutputStream;
/*
* ObjectOutputStream实现对象的序列化，把内存中的对象写入流中。（把对象写到硬盘上）
* 要求；1.序列化的类必须实现Serializable接口：Student类
* 2.序列化类中的对象属性也要求实现Serializable标记接口:address属性
* 3.通常要加上serialVersionUID：序列化的版本号ID，作用是保证序列化的类和反序列化的类是同一个类
* 4.使用transient（瞬间的，瞬时的。只在内存中，而硬盘是持久的。所以transient修饰后不能再序列化）修饰不想被
* 序列化的属性。这个属性将不能再被序列化。此时反序列化的结果是Student{name='buerma', age=0}
* 5.静态属性也是不能序列化的：private static String Country="中国";那么这个静态变量也是不能保存在硬盘上的
*6.序列化多个对象：多次序列化，同时在反序列化的时候要多次读取。这比较麻烦，可以借助集合，一次性全部序列化
*
*
* */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建对象流
        FileOutputStream fo1 = new FileOutputStream("d:\\stu.bin");//bin表示一个二进制的文件。随便写的

        ObjectOutputStream o1 = new ObjectOutputStream(fo1);

//        2实现序列化：写入操作.读取对象到流中
        Student s1 = new Student("buerma",16);
//        o1.writeObject(s1);//NotSerializableException: com.kuang.io.stream.objectOutputStream.Student
        // 这个类不能序列化。除非Student类实现接口：implements Serializable(标记接口：仅仅表明这个类可以序列化，这个接口本身没有任何方法)


        Student S2 = new Student("琪琪",12);//能否序列化多个对象？
//        o1.writeObject(S2);


//        太麻烦，可以借助集合，一次性序列化全部对象;
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(S2);
        o1.writeObject(arr);//直接序列化这个集合即可



//        3.关闭流
        o1.close();//close本身自带flush，这里不必再次写
        System.out.println("序列化完成");

    }
}
