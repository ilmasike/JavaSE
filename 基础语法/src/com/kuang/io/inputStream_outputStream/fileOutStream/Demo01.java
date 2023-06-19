package com.kuang.io.inputStream_outputStream.fileOutStream;
/*
* 文件字节输出流：FileOutputStream
*
* */

import java.io.FileOutputStream;

public class Demo01 {
    public static void main(String[] args) throws Exception{
//        1.创建输出流对象：
        FileOutputStream f1 = new FileOutputStream("D:b.txt");//有重载的
        // ：new FileOutputStream("D:b.txt"，true);就不再覆盖而是接着往后写（没关闭流之前不会覆盖）

//
//        2.读出来文件
//        f1.write('s');
//        f1.write('j');
//        f1.write(97);
        String a="jsaiodfhi,sdf,fj";
        f1.write(a.getBytes());//获取字符串对应的字节数组





//        3.关闭流
        f1.close();
        System.out.println("执行完毕");



    }
}
