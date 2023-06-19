package com.kuang.collection.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
* 演示properties的使用
*public class Properties
extends Hashtable<Object,Object>Properties类表示一组持久的属性。
*  Properties可以保存到流中或从流中加载。 属性列表中的每个键及其对应的值都是一个字符串。
*
* */
public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建properties集合
        Properties p1 = new Properties();
//        2.添加元素
        p1.setProperty("username","hu");
        p1.setProperty("age","20");
        p1.setProperty("huzhnekun","shuai");
        System.out.println(p1.toString());


//        3.遍历
//        3.1  keyset
//        3.2  entrySet
//        3.3也可以使用StringPropertiesNames ,进行遍历。返回值是Set集合
        Set<String> s = p1.stringPropertyNames();
        for (String ss:
             s) {
            System.out.println("属性名是"+ss+"对应的value为"+p1.getProperty(ss));
        }



//        4.和流有关的方法：
//        4.1.  list列表方法
//        PrintWriter printWriter = new PrintWriter("d:\\javascodes\\properties.txt");
//        p1.list(printWriter);//把properties的信息打印到硬盘
//        printWriter.close();

//        4.2   store保存方法
        FileWriter fileWriter = new FileWriter("d:\\javascodes\\properties_store.properties");//对于属性合集，我们
//        通常用.properties作为文件的后缀
        p1.store(fileWriter,"这里是注释：随便写");
        fileWriter.close();


//        4.3读取文件load方法

        System.out.println("这里是load方法");
        Properties p2 = new Properties();
        FileReader f1 = new FileReader("d:\\javascodes\\properties_store.properties");
        p2.load(f1);
        f1.close();
        System.out.println(p2.toString());





    }
}
