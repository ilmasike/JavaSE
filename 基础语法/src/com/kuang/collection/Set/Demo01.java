package com.kuang.collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* 测试Set接口   的使用：无序、没有下标。不能重复
* */
public class Demo01 {
    public static void main(String[] args) {
//        创建集合
        Set<String> s1 = new HashSet<>();
//        1.添加数据
        s1.add("孙悟空");
        s1.add("qiqi");
        s1.add("布尔玛");
        s1.add("孙悟空");//不显示
        System.out.println(s1);

//        2.删除数据
        s1.remove("qiqi");
        System.out.println(s1);
//        3.遍历    (1)foreach  (2)遍历器
        System.out.println("=======foreach=========================");
        for (String s:
             s1) {
            System.out.println(s);
        }

        System.out.println("====迭代器 Iterator=======================================");
        Iterator <String>it=s1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        4.判断：contains  isEmpty



    }
}
