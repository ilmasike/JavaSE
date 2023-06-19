package com.kuang.io.Reader_Write.FileReader;
/*
* 使用fileInputStream进行文件的读取：文本里只有英文是没问题的，但是有中文（把汉字拆分成4个字节）就乱码。
* 为此我们需要字符流。utf-8字符编码，是支持中文的
*
* */

import java.io.FileInputStream;

public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建文件输入流fileInputStream：
        FileInputStream f1 = new FileInputStream("d:\\a.txt");
//        2.读取文件：
        int data=0;
        while((data=f1.read())!=-1){
            System.out.print((char)data+"\t");
        }

//        3.关闭流
        f1.close();
        System.out.println();
        System.out.println("读取完毕");




    }
}
