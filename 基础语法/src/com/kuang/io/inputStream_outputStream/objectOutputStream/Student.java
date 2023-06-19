package com.kuang.io.inputStream_outputStream.objectOutputStream;
/*
 * 学生类：
 * */

import java.io.Serializable;
import java.util.Objects;

public class Student  implements Serializable {
    /*
     * serialVersionUID：序列化的版本号ID，作用是保证序列化的类和反序列化的类是同一个类
     * */

    private static final long serialVersionUID = 8699146130245800202L;
    private String name;

    //    private transient  int age;
    private   int age;



//    private Address add;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
