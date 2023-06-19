package com.kuang.collection.list;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
/*List子接口：有序，有下标（不仅可以用foreach ,也可以用for遍历），元素可以重复
* */

public class Demo01 {
    public static void main(String[] args) {
//        先创建集合对象：
        List l1=new ArrayList();
//        1.添加元素：
        l1.add("孙悟空");
        l1.add("琪琪");
        l1.add("龟仙人");
        l1.add("布尔玛");
        l1.add("小舞");
        l1.add("比迪丽");
        l1.add("18号");
        l1.add("兰琪儿");
        System.out.println(l1);
        l1.add(2,"小芳");
        System.out.println(l1);

//        2.删除元素
        System.out.println("删除元素：");
        l1.remove(2);
        System.out.println(l1);

//        3.遍历操作：（1）for   (2)listIterator
        System.out.println("============================下面执行遍历操作:for");
        System.out.println(l1.indexOf(3));//-1   ---->注意：是用get，不是indexOf
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+"   ");
        }
        System.out.println();

        System.out.println("======增强for来遍历=========================");
        for (Object s:
             l1) {
            System.out.print(s+"   ");
        }
        System.out.println();

        System.out.println("==========使用迭代器Iterator================================");
        Iterator it1=l1.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next()+"   ");
        }
        System.out.println();

        System.out.println("===========使用列表迭代器：ListIterator()=================================================");
//        相对于Iterator:listIterator 可以向前或者向后遍历，添加、删除、修改元素
        ListIterator it2=l1.listIterator();

        System.out.println("1111111111111111111111使用列表迭代器：从前往后遍历：");
        while(it2.hasNext()){
            System.out.println("角标是："+it2.nextIndex()+".其对象的参数为："+it2.next()+"\t");
        }

        System.out.println("22222222222222222222222使用列表迭代器：从后往前遍历：");
        while(it2.hasPrevious()){
            System.out.println("角标是："+it2.previousIndex()+".其对象的参数为："+it2.previous()+"\t");
        }


//        4.判断：contains包含；    isEmpty是否为空


//        5.获取下标：indexOf:
        System.out.println(l1.indexOf(3));//-1   ---->注意：是用get，不是indexOf
        System.out.println(l1.indexOf("兰琪儿"));









    }
}
