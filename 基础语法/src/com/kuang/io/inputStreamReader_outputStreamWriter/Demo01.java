package com.kuang.io.inputStreamReader_outputStreamWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/*
使用inputStreamReader读取文件,指定使用编码。
* 转换桥：InterputStreamReader,字节流通向字符流的桥梁，他使用指定的charset读
* 取字节，并将其解码为字符。其中inputStream是字节流的抽象类，Reader是字符流的抽象类
*
* 所以转换流：就是内存中的字符，和硬盘中的字节进行的转换
* */
public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建转换桥流对象
        FileInputStream f1 = new FileInputStream("d:\\a.txt");
//        InputStreamReader i1 = new InputStreamReader(f1, "utf-8");//这里用的是utf-8,我们也可以
//        用下gbk
        InputStreamReader i1 = new InputStreamReader(f1, "gbk");//abuwobuaini娌℃湁涓�涓汉姘戠殑,
//        这里是乱码，而如果把源文件改为gbk格式，就能正常读取了



//        注意：使用FileReader时,是不能指定编码的，只能是默认的编码。而这里转换流可以指定编码
//        2.读取文件
        int data=0;
        while((data=i1.read())!=-1){
            System.out.print((char)data);
        }
//        3.关闭流
        i1.close();
        System.out.println();
        System.out.println("字符转换流读取完毕");


    }
}
