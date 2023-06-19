package com.kuang.collection.Map;

/*Map接口的实现类：HashMap的使用：
* 存储结构：哈希表（数组+链表+jdk1.8后的红黑树）
*去重依据：使用key的hashcode和equals作为重复依据：要重写二方法。
* */

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
//        创建集合
        HashMap<Student, String> hashMap = new HashMap<>();

//        1.添加元素
        Student S1 = new Student("孙悟空",23);
        Student S2 = new Student("牛琪琪",25);
        Student S3 = new Student("山吹见取",30);
        Student S4 = new Student("濑尾结月",18);
        Student S5 = new Student("木之本樱",16);



        hashMap.put(S1,"001");
        hashMap.put(S2,"002");
        hashMap.put(S3,"003");
        hashMap.put(S4,"004");
        hashMap.put(S5,"005");
        hashMap.put(S5,"005");//能否添加？没办法添加：因为key不允许重复
        System.out.println(hashMap.size());
        System.out.println(hashMap);


        hashMap.put(new Student("仲间由纪惠",36),"006");
        System.out.println(hashMap.size());
        System.out.println(hashMap);

        hashMap.put(new Student("孙悟空",23),"001");//能添加成功，尽管属性一样。
//        因为new在堆里开辟了新空间。
//        如果要实现，同一个人就排除掉（姓名，学号一样）。那除非你把equals hashcode重写。
        System.out.println(hashMap.size());
        System.out.println(hashMap);

//        2.删除元素：hamp.remove
        System.out.println("删除：");
        hashMap.remove(S3);
        System.out.println(hashMap.size());
        System.out.println(hashMap);

//        3.遍历操作：hamap.set;   hashmap.entryset.  变为Set集合在进行遍历
        System.out.println("一、先变为keySet集合");
        System.out.println("===(1)keySet:增强for====================================");
        for (Student a:
                hashMap.keySet()) {
            System.out.println(a+"对应的value为："+hashMap.get(a));
        }
        System.out.println("===(1)keySet:迭代器====================================");
        Iterator<Student> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("二、或者变entrySet集合");
//        System.out.println(hashMap.entrySet());
        System.out.println("===(2)entrySet:的增强for====================================");
        for (Map.Entry<Student,String> a:
             hashMap.entrySet()) {
            System.out.println(a+"--对应的value为"+a.getValue());
        }
        System.out.println("===(2)entrySet:的迭代器====================================");
        Iterator<Map.Entry<Student, String>> iterator1 = hashMap.entrySet().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


//        4.判断：
        System.out.println(hashMap.containsKey(S1));
        System.out.println(hashMap.containsKey( new Student("孙悟空",23) ));
        //还是TRUE，因为重写了二方法。


    }
}
