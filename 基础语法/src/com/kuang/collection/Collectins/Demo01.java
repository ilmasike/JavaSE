package com.kuang.collection.Collectins;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
//        创建集合：
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(342);

        arrayList.add(34);
        arrayList.add(56);
        arrayList.add(898);
        arrayList.add(7384);
        arrayList.add(23);
//        1.调用集合工具类Collections 中的sort方法：
        System.out.print("排序之前：");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.print("排序后");
        System.out.println(arrayList);
//        sort的重载方法中，是有比较器：可以自定义比较规则：
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n1=o2.compareTo(o1);
                return n1;
            }
        });
        System.out.println("自定义排序："+arrayList);

//        2.binarySearch:二分查找：
        int i= Collections.binarySearch(arrayList,7384);//找23，返回的是23 的位置
        System.out.println(i);



//        3.copy复制：
        List<Integer> arrayList2 = new ArrayList<>();
//        Collections.copy(arrayList2,arrayList);//报错：IndexOutOfBoundsException: Source does not fit in dest
        //他要求二者大小一致，此时的arrayList2 的长度为零
        for (int j = 0; j <arrayList.size() ; j++) {
            arrayList2.add(0);
        }
        Collections.copy(arrayList2,arrayList);//不再报错
        System.out.println(arrayList2.toString());

//        4.reverse反转：调换位置
        Collections.reverse(arrayList2);
        System.out.println(arrayList2);

//        5.shuffle:打乱（洗牌）
        Collections.shuffle(arrayList2);
        System.out.println(arrayList2);

//        补充：（1）把集合arrayList转为数组（2）把数组转为集合
//        注意:把数组转为集合，这个集合是受限集合，不能添加和删除！！
        System.out.println("把集合转为数组===============================");
        Integer arr[]=arrayList2.toArray(new Integer[0]);
        System.out.println(arr.length+ Arrays.toString(arr));


        System.out.println("把数组转为集合============================");
        String name[]={"sdf","sdf","gh","df","trh","trhhg","trhj"};
        System.out.println("name数组:"+Arrays.toString(name));
        List a=Arrays.asList(name);
        System.out.println("集合a:"+a);

//        a.add("我爱你");//会报错，因为这是受限集合，不能添加或者删除
//        System.out.println(a);

        int[]nums={23,46,6789};//怎样把这个数组，转为集合？
//        List <Integer>list1=Arrays.asList(nums);//会报错？？为什么？？
        List <int[]>list1=Arrays.asList(nums);//只能这样写。但是这样的话，集合中就不再是一个数据，而是一个数组
//        所以基本类型转为集合时，有一个问题：不能用int[]； int[]nums={23,46,6789,};需要修改为包装类：
//        可以这样写：
        Integer[]nums2={23,46,6789};
        List <Integer>list2222=Arrays.asList(nums2);
        System.out.println(list2222);

        





    }
}
