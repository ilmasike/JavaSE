package com.kuang.usualClass.Object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private  String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name+"这个对象已经启动finalize方法，已经被回收");
    }

    @Override
    public boolean equals(Object o) {
        if(this.hashCode()==o.hashCode()){
            return true;
        }else if(this.getClass()==o.getClass()){
            Student s= (Student) o;
            if(this.getAge()==s.getAge()&&this.getName()==s.getName()){
                return true;
            }
        }
        return false;

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
}
