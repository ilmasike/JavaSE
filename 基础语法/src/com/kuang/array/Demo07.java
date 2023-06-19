package com.kuang.array;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int a[]={2,4,6,89,6,3,2,54,7,8,3,7,9,34,7,8,8,897,3,3344,3497334};
//        sort(a);
        int arrays[]=sort2(a);
        System.out.println(Arrays.toString(arrays));
        System.out.println("=================================");


    }


//    冒泡排序：比较数组中两个相邻的元素，如果第一个数比第二个数大，就交换位置：
//    每一次比较都会产生一个最大或者最小的数字
//    下一轮，则可以少一次排序
//    依次循环，知道结束

//    自己写的冒泡排序：写错了，错在不是用，相邻的值进行比较，而是用固定的i与逐渐变化的j进行比较
    public static void sort(int a[]){
//        外层循环：判断这个要走多少次
        int temp=0;
        for (int i = 0; i <a.length-1 ; i++) {
//            内层循环，如果第一个数比第二个数大，则交换位置
            for (int j = i+1; j < a.length-1; j++) {
                if(a[i]>=a[j]){
                   temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;

                }
            }

        }

        System.out.println(Arrays.toString(a));

    }


//   狂神的冒泡排序：
public static int[] sort2(int[] array) {
    int temp = 0;
// 外层循环，它决定一共走几趟 //-1为了防止溢出
    for (int i = 0; i < array.length - 1; i++) {
        int flag = 0; //通过符号位可以减少无谓的比较，如果已经有序了，就退出循环
//内层循环，它决定每趟走一次
        for (int j = 0; j < array.length - i - 1; j++) {
//如果后一个大于前一个,则换位
            if (array[j + 1] > array[j]) {
//          if (array[j + 1] < array[j]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                flag = 1;
            }
        }
        if (flag == 0) {
            break;
        }
    }
    return array;
}



}
