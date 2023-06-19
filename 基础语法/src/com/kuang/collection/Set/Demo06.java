package com.kuang.collection.Set;
/*TreeSet集合的使用
* comparator:实现定制比较（比较器）。而comparable：可比较的。
* */

import com.kuang.collection.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo06 {
    public static void main(String[] args) {
//        创建集合,并制定比较规则
        TreeSet<Student> t = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int n1=o1.getAge()-o2.getAge();
                int n2=o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }
        });//此时我们的Student
        // 不一定就非得实现而comparable接口了。因为这里已经定制了比较的规则。


        t.add(new Student("xiaoxin",23));
        t.add(new Student("qiiq",13));
        t.add(new Student("sdfsdf",34));
        t.add(new Student("sdfsdf",64));
        System.out.println(t);//可以输出，说明添加成功：红黑树添加成功说明比较规则是成功的


        System.out.println("===牛刀小试==========================================");
        //红黑树集合TreeSet直接添加会无法输出打印。得让元素类型所在类 实现comparable接口，
        // 或者直接在Treeset 上，进行匿名内部类：comparator来定制比较规则
        TreeSet<Cat> h = new TreeSet<>(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                int n1=o1.getAge()-o2.getAge();
                int n2=o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }
        });
        h.add(new Cat("x删掉n",23));
        h.add(new Cat("qi计算的iq",13));
        h.add(new Cat("sdf水电费sdf",34));
        h.add(new Cat("sdf换个地方sdf",64));

        System.out.println(h);


    }

}
