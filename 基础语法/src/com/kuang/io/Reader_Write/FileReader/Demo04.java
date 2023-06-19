package com.kuang.io.Reader_Write.FileReader;

import java.io.FileReader;
import java.io.FileWriter;

/*
* 使用FileReader和FileWriter进行文件的复制。注意：不能复制图片视频等其他二进制文件（图片没有字符编码），只能是文本文件
*
* */
public class Demo04 {
    public static void main(String[] args) throws Exception {
//        1.首先建立文件读取流，文件写入流
        FileReader f1 = new FileReader("C:\\Users\\10186\\Desktop\\jihua.txt");
        FileWriter f2 = new FileWriter("C:\\Users\\10186\\Desktop\\mako222.txt");

//        2.读取文件，和写入文件
        char[] chars = new char[10];
        int count=0;
        while((count=f1.read(chars))!=-1){
            f2.write(chars,0,count);
        }
//        3.关闭流

        f1.close();
        f2.close();
        System.out.println("复制完毕");


    }
}
