package com.kuang.collection;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

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
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    @Override
    public int hashCode() {
        int n1=this.name.hashCode();
        int n2=this.age;
      return n1+n2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj instanceof Student) {
            Student s=(Student) obj;
//            比较属性：
            if(this.getName().equals(((Student) obj).getName())&&(this.getAge()==((Student) obj).getAge())){
                return  true;

            }

        }
        return false;
    }

    @Override//比较规则：先比较姓名，否则再比较年龄
    public int compareTo(Student o) {
        int n1=this.getName().compareTo(o.getName());
        int n2=this.age-o.getAge();

        return n1==0?n2:n1;
    }
}
