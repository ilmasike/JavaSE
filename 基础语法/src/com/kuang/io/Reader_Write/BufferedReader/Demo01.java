package com.kuang.io.Reader_Write.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

/*
* 提高字符流的功能的：BufferedReader/  BufferedWrite
*
*
* */
public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建字符缓冲流：

        FileReader f1 = new FileReader("d:\\a.txt");
        BufferedReader b1 = new BufferedReader(f1);
//        2.字符缓冲流读取：
        System.out.println("=2.1通过字符缓冲流的遍历，来读取=================================");
        int data=0;
//        while((data=b1.read())!=-1){
//            System.out.print((char)data);
//        }
//        也可以自己也创建缓冲区：
        char[] chars = new char[5];
        int count=0;
//        while((count=b1.read(chars))!=-1){
//            System.out.println(new String(chars,0,count));
//        }

        System.out.println("=2.2一行一行的读===================================");
        String data2=null;
        while((data2=b1.readLine())!=null){
            System.out.print(data2);
        }






//        3.关闭流：
        b1.close();
        System.out.println();
        System.out.println("字符缓冲流读取成功");
    }
}
