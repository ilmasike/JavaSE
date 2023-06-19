package com.kuang.collection.T;

import com.kuang.collection.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
//       集合如果不用泛型的时候：
        ArrayList arrayList = new ArrayList();
        arrayList.add("孙悟空");
        arrayList.add("牛琪琪");
        arrayList.add(23);
        arrayList.add(456);
        for (Object s:
             arrayList) {
            System.out.println(s);

        }//此时遍历，不做类型转换是没有任何问题的。
//        但是：如果想把s转为String类型的时候：
        System.out.println("=======================================s");
        for (Object s:
                arrayList) {
//            String a=(String)s;
//            System.out.println(a);
//        会报错：Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//        你得判断是什么类型，才能强转。但是用泛型，能避免防止类型转换异常，提高代码的安全性
        }

        System.out.println("======用泛型操作=====================================");
        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("贝吉塔");
        arrayList2.add("布尔玛");
//        arrayList2.add(23);//会报错。因为集合对象已经确定了其类型是String
//        arrayList2.add(456);
        for (String s:
             arrayList2) {
            System.out.println(s);
        }

        System.out.println("=============================");
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student("huzhen",23));
//        s1.add(234);    //会报错只能添加Student类型
        Iterator<Student> it=s1.iterator();
        while(it.hasNext()){
            Student a=it.next();//因为迭代器就是写成了泛型，所以这里不需要再次类型转换，Student a=（Student）it.next();
            System.out.println(a);
        }




    }
}
