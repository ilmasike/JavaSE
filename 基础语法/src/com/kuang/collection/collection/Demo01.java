package com.kuang.collection.collection;

/*
 * Collection接口的使用：
 * 1.添加元素
 * 2.删除元素
 * 3.遍历元素
 * 4.判断  存在？空？
 *
 *
 * */

import java.util.*;

public class Demo01 implements Collection {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.add(null);

        Collection collection= new ArrayList();

//        1.添加元素
        collection.add("苹果");
        collection.add("香蕉");
        collection.add("留恋");
        collection.add("石榴");

        collection.add("果子");

        collection.add("哈哈");

        collection.add("你好");
        System.out.println(collection.size());
        System.out.println(collection);//[苹果, 香蕉, 留恋, 石榴, 果子, 哈哈, 你好]
        // 可以直接 ：sout. 是因为Arraylist已经把toString重写了

//        2.删除
        collection.remove("哈哈");
        System.out.println(collection);


//        3.清空
//        collection.clear();

        System.out.println("===========================================");

//        4.遍历：(1).使用for :这里不能用for:没有下标。所以要用增强for(看不到下表)
        for (Object o:
             collection) {
            System.out.print(o);
        }
        System.out.println("===============下面是Iterator迭代器======================");
//        (2)使用迭代器Iterator:专门用来遍历集合的:hasNext、next（获取下一个元素）、remove（删除当前元素）
        Iterator iterator = collection.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next());

//            collection.remove("苹果");//java.util.ConcurrentModificationException并发修改异常
//            注意：Iterator过程中，不允许用Collection中的增删等方法

//            System.out.println("想要删除元素：可以用Iterator的方法，而不是Collection的方法");

//            iterator.remove();//删除方法


        }
        System.out.println("               "+collection.size());


//        5。判断：
        System.out.println(collection.contains("苹果"));


    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
