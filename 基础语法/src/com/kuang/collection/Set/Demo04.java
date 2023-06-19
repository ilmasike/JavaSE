package com.kuang.collection.Set;
/*TreeSet:基于排列顺序，实现元素不重复
存储结构：红黑树
*
*
* */

import java.util.Iterator;
import java.util.TreeSet;

public class Demo04 {
    public static void main(String[] args) {
//        创建集合
        TreeSet<String> t = new TreeSet<>();
//        1.添加元素
        t.add("ssfsdg");
        t.add("er");
        t.add("dfshdf");
        System.out.println(t);//[dfshdf, er, ssfsdg]结果其实是有个排序的
        t.add("er");
        System.out.println(t);//[dfshdf, er, ssfsdg]并没有添加成功：重复元素不添加

//        2.删除
        t.remove("er");
        System.out.println(t);

//        3.遍历
        for (String a:
             t) {
            System.out.println(a);
        }

        Iterator<String> iterator = t.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        4.判断




    }
}
