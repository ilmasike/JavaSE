package com.kuang.usualClass.StringClass;

public class Demo01 {
//   字符串字面值是存储在字符串池中，目的是可以共享。 字符串池是在方法区中
public static void main(String[] args) {
    String name="卡卡罗特--dragon ball:kakaroot:孙悟空";
    name="布尔玛：bulma";//字符串不可变性：给name赋值，并没有修改字符串池中的“卡卡罗特”，而是重新开辟一个空间
    String name2="布尔玛：bulma";//此时先从字符串池里找，既然有已经存在的，就不再重新创建
    System.out.println(name==name2);//true


    System.out.println("==================使用new，在堆和字符串池中，各存储一个=====================");

    String str2=new String("java是最好的语言");
    String str3=new String("java是最好的语言");
    System.out.println(str3==str2);//false:因为在堆里（new），是不同的对象

//    所以：用字符串比较的时候不要用==，而是equals
    System.out.println(str2.equals(str3));





}





}
