package com.kuang.collection.Set;
/*HashSet 的使用2
* * 存储结构：哈希表（数组+链表+红黑树（jdk1.8之后））
* 重复依据：hashcode和equals方法。重写二者，就不能再添加重复元素
* */

import com.kuang.collection.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
//        1.添加
        HashSet<Student> h = new HashSet<>();
        h.add(new Student("xiaoxin",23));
        h.add(new Student("qiiq",13));
        h.add(new Student("sdfsdf",34));

        System.out.println(h.size()+h.toString());
//        结果是无序的：3[Student[name='qiiq', age=13], Student[name='xiaoxin', age=23], Student[name='sdfsdf', age=34]]
//
        System.out.println("=====================添加重复的new Student（）===============================");
        h.add(new Student("xiaoxin",23));//能添加成功：正常情况下，重复元素不应该添加成功-->为此重写hashcode、equals方法
//        @Override
//        public int hashCode() {
//            int n1=this.name.hashCode();
//            int n2=this.age;
//            return n1+n2;
//        }
//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj) {
//                return true;
//            } else if (obj == null)


//

        System.out.println(h);//重写hashcode发现，已经不能再添加重复元素

        /*这里分析下HashSet 的    存 储过程：
        * （1）根据hasecode计算保存的位置。如果此位置为空，则直接保存。如果不为空，执行第二步：
        * （2）再执行equals方法：若TRUE则认为是重复元素；否则形成链表
        *
        *
        * */


//        2.删除：
        System.out.println("===========删除操作=========================================");
        h.remove(new Student("xiaoxin",23));//在未重写hashcode和equals之前，是肯定删不掉的。
        System.out.println(h);


//        3.遍历
        System.out.println("===迭代器=======================================");
        Iterator<Student> iterator = h.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===for遍历===============================================");

        for (Student s:
             h) {
            System.out.println(s);

        }


//        4.判断contains    isEmpty
        System.out.println(h.contains(new Student("qiiq",13)));//正常不应该写成new 的形式。
        // 因为重写了二种方法，所以输出是TRUE



//        牛刀小试:
        System.out.println("=====猫猫==============================");
        HashSet<Cat> c = new HashSet<>();
        c.add(new Cat("xiaox水电费in",23));
        c.add(new Cat("qiiq水电费",13));
        c.add(new Cat("sd地方fsdf",34));

        System.out.println(c.size()+c.toString());
        System.out.println("添加重复元素：同时已经重写equals 和  hashcode方法，看看能添加成功么：");
        c.add(new Cat("xiaox水电费in",23));
        System.out.println(c);//重写hashcode发现，已经不能再添加重复元素


    }
}
