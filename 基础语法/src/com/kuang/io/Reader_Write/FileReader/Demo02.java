package com.kuang.io.Reader_Write.FileReader;
/*
FileReader的使用
* 字符流的实现类：文件字符流：FileReader、FileWriter继承于
* 转换流intputStreamReader、outputStreamWriter
*
* */

import java.io.FileReader;

public class Demo02 {
    public static void main(String[] args) throws Exception {
//        1.创建字符流：
        FileReader f1 = new FileReader("d:\\a.txt");


//        2.读取数据
//        2.1单个字符读取：
        int data=0;
//        while((data=f1.read())!=-1){//每次读取一个字符（3字节）
//            System.out.print((char)data);
//        }

        System.out.println("===通过数组的方式一次输出多个字节================================================");
//        2.1创建于一个字符缓冲区
        char[] chars = new char[10];
        int data2=0;
        while((data2=f1.read(chars))!=-1){
            System.out.print(new String(chars,0,data2));
        }




//        3.关闭流
        f1.close();
        System.out.println();
        System.out.println("读取完毕");
    }
}
