package com.kuang.collection.Map;
/*TreeMap,的使用
* 存储结构：红黑树
* */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Demo03 {
    public static void main(String[] args) {
//        创建集合
        TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                int n1=o1.getAge()-o2.getAge();
                int n2=o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }
        });
//        1,。添加元素：

        Student S1 = new Student("孙悟空",23);
        Student S2 = new Student("牛琪琪",25);
        Student S3 = new Student("山吹见取",30);
        Student S4 = new Student("濑尾结月",18);
        Student S5 = new Student("木之本樱",16);



        treeMap.put(S1,"001");
        treeMap.put(S2,"002");
        treeMap.put(S3,"003");
        treeMap.put(S4,"004");
        treeMap.put(S5,"005");
        System.out.println("元素个数为："+treeMap.size());//会报错，因为红黑树（左边的节点要小于右边）：需要制定比较规则.
        System.out.println(treeMap);


        treeMap.put(S5,"005");//能否添加？没办法添加：因为比较规则改了，比较后发现是同一个
        System.out.println("元素个数为："+treeMap.size());
        System.out.println(treeMap);

//        2.删除
        treeMap.remove(S1);
        System.out.println("元素个数为："+treeMap.size());
        System.out.println(treeMap);

//        3.遍历：（1）转换为keySet的Set集合，（2）转换为entrySet的Set集合
        System.out.println("==用keySet，进行遍历===================================");
        treeMap.keySet();
        for (Student s:
             treeMap.keySet()) {
            System.out.println(s+"对应的value为："+treeMap.get(s));

        }
        System.out.println("==用entrySet，进行遍历===================================");
        treeMap.entrySet();
        for (Map.Entry<Student,String> a:
        treeMap.entrySet()) {
            System.out.println(a);
        }



//        4.判断：
        System.out.println(treeMap.containsKey(S1));


    }
}
