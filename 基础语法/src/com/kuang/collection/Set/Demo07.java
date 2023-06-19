package com.kuang.collection.Set;
/*使用TreeSet集合，实现字符串按照长度进行排序
*
* */

import java.util.Comparator;
import java.util.TreeSet;

public class Demo07 {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1=o1.length()-o2.length();//先比较长度
                int n2=o1.compareTo(o2);//长度不行就按原来的进行比较
                return n1==0?n2:n1;
            }
        });
        s.add("sadfasfdasd");
        s.add("sdfasgsh");
        s.add("jfighk");
        s.add("asdgjiilhphkhdsklfnio");
        s.add("dsf;fjlllnsdrhfyjtukuyulkh");
        System.out.println(s);
    }

}
