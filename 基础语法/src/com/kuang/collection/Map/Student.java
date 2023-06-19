package com.kuang.collection.Map;

import java.util.Objects;

public class Student {
    private String name;
    private int id;


    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return id;
    }

    public void setAge(int age) {
        this.id = age;
    }


    @Override
    public String toString() {
        return "Studnet[" +
                "name='" + name + '\'' +
                ", age=" + id +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
