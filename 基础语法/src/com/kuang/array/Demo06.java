package com.kuang.array;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int  []a={1,2,3,4,5,656,768,1324,3,54};
//        打印输出
        System.out.println(Arrays.toString(a));
        System.out.println("自己写的打印输出的方法：");
        printArray(a);


///自己写一个排序后输出：
        System.out.println("排序后输出：");
        Arrays.sort(a);//对数组进行排序：升序
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+"\t");
        }


//    填充：Arrays.fill();
        Arrays.fill(a,9);
        System.out.println("填充后打印"+Arrays.toString(a));
//        设定第2,4个数进行填充
        Arrays.fill(a,2,6,138);
        System.out.println("填充后打印"+Arrays.toString(a));

    }




//    自己仿造Arrays.toString来写一个方法
    public static void printArray(int a[]){
        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
            if(i!=a.length-1){
                System.out.print(a[i]+", ");
            }else{
                System.out.print(a[i]);
            }

        }
        System.out.println("]");
    }
}
