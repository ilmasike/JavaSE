package com.kuang.usualClass.Object;

public class Application2 {
    public static void main(String[] args) {
        Student s1=new Student("孙悟空",23,"1");

        Student s2=new Student("琪琪",25,"2");

        Student s3=new Student("小芳",3,"2");
        Student s4=new Student("孙悟饭",15,"1");
        Student s5=new Student("布尔玛",28,"2");
        Student s6=new Student("则卷大饼",43,"1");
        Student s7=new Student("山吹见取",31,"2");
        Student []s={s1,s2,s3,s4,s5,s6,s7};

        for (int i = 0; i <7 ; i++) {
            if (s[i].getSex().equals("1")){
                continue;
            }

            System.out.println(s[i].getName()+"是我的第"+i+"个女朋友,她的年龄是"+s[i].getAge());

        }

//        回收垃圾
        System.gc();
        System.out.println("回收垃圾");//会发现并没有调用finalize方法，因为这好几个对象不是垃圾
        System.out.println("==========================");
        new Student("琪琪",25);

        new Student("小芳",3);
        new Student("孙悟饭",15);
        new Student("布尔玛",28);
        new Student("则卷大饼",43);
        new Student("山吹见取",31);
        System.gc();







    }
}
