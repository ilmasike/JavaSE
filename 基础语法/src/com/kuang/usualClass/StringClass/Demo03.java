package com.kuang.usualClass.StringClass;
/*。需求:
。已知String .str = "this is a text" ;。
1.将str中的单词单独获取出来
2.将str中的text替换为practice。
3.在text前面插入一个easy。
4.将每个单词的首字母改为大写
*/

import javax.xml.transform.Source;
import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        String str="this is a text";
//        1.将str中的单词单独获取出来
        String arr[]=str.split(" ");


        System.out.print(Arrays.toString(str.split(" ")));
        System.out.println();
        System.out.println("-----------------------------------------------");
//        2.将str中的text替换为practice。
        System.out.println((str.replace("text","practice")));
        System.out.println("----------------------------------------------------");

//     3.在text前面插入一个easy。
        for (int i = 0; i < str.split(" ").length; i++) {
            if(str.split(" ")[i].equals("text")) {
                System.out.print("easy"+str.split(" ")[i]+"\t");
                continue;
            }
            System.out.print(str.split(" ")[i]+"\t");

        }
        System.out.println();


        System.out.println(str);
//        4.将每个单词的首字母改为大写
        System.out.println("==========================");
        for (int i = 0; i <arr.length ; i++) {
//            获取首字母
            char firstChar=arr[i].charAt(0);
//            把首字母大写
           char upCase_firstChar= Character.toUpperCase(firstChar);
//           得把字符拼接起来  :subString截取方法
            System.out.print((upCase_firstChar + arr[i].substring(1, arr[i].length()))+"\t");





        }


















    }
}
