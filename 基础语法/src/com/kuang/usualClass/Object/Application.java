package com.kuang.usualClass.Object;

public class Application {
    public static void main(String[] args) {
        Student s1=new Student("卡卡罗特",23);
        Student s2=new Student("贝吉塔",30);
        System.out.println(s1.getClass()==s2.getClass());//getClass方法的使用，判断是不是同一类型

//        判断getClass输出的结果：
        System.out.println(s1.getClass());
        System.out.println(new Object().getClass());

//        判断两个对象的hashcode
        System.out.println(s1.hashCode()==s1.hashCode());
        System.out.println(s1.hashCode());

//        toString 方法
        System.out.println(s1.toString());


//        equals方法
        Student s3=s2;
        System.out.println(s3.equals(s2));
//     在equals，在未重写之前：比较的是地址。  枝叶相似，其实味不同。
        System.out.println((new Student("胡",23)).equals(new Student("胡",23)));






    }
}
