package com.kuang.collection.list;

/*list的使用
* */

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.*;

public class Demo02 {
    public static void main(String[] args) {

       List l1= new ArrayList();
       l1.add(20);//注意：集合里面装的是对象，而这里装的为什么是基本类型呢？？？
        // 因为这里有自动装箱的操作

        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        System.out.println(l1);


//        2.删除操作
//        l1.remove(20);//会报错：IndexOutOfBoundsException: Index: 20, Size: 5
        System.out.println(l1);
//        是因为我们调用的是角标；应采取下面的方法：

        l1.remove((Object) 20);
        System.out.println(l1);
//        或者：
        l1.remove(new Integer(30));
        System.out.println(l1);


//        3.subList：返回子集合:含头不含尾
        System.out.println(l1.subList(0, 2));


    }
}
