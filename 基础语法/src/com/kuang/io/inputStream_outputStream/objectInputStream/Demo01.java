package com.kuang.io.inputStream_outputStream.objectInputStream;
/*
* 使用ObjectInputStream实现反序列化：(读取重构对象)
* 把文件读到内存。重新构成一个对象
* */

import com.kuang.io.inputStream_outputStream.objectOutputStream.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建对象流
        FileInputStream f1 = new FileInputStream("d:\\stu.bin");
        ObjectInputStream o1 = new ObjectInputStream(f1);

//        2.读取文件，反序列化:重构对象，读取对象流中的对象数据

//        System.out.println(o1.readObject().toString());
////        Student s1=(Student) o1.readObject();
////        Student s2=(Student) o1.readObject();//序列化多个对象，那么就反序列化两次或多次
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());

//        同时序列化多个对象时，也可以直接反序列化  多个对象的集合
        ArrayList <Student>arrayList= (ArrayList<Student>) o1.readObject();//用集合序列化，那么反序列化的结果也是个集合
        System.out.println(arrayList.toString());



//        Student s2=(Student) o1.readObject();//第二次调用可以吗？不可以，会报错EOFException：
        // end of file,就是s1已经把文件读完了
//        System.out.println(s2.toString());


//        3.关闭流

        o1.close();
        System.out.println("反序列化，也就是重构对象执行完毕");
    }
}
