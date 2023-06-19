package com.kuang.oop.Demo04;
//学生类,对于封装主要是应用于属性，对于方法不太常用于封装
//封装的核心：属性私有，get/set
public class Student {
    private int age;
    private String name;
    private int id;
    private char sex;

//    提供一些可以操作这些属性的方法
//    提供一些public的get(获得) set方法


//    public int getAge(int i) {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        要设置合法的年龄
        if(age>0&&age<=120){
            this.age = age;
        }else{
            System.out.println("输入年龄有问题");
        }
    }
}
