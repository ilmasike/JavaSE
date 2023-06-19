package com.kuang.io.inputStreamReader_outputStreamWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
* 使用转换流：OutputStreamWrite()来写入文件，使用指定的编码;
* */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        //    1.创建转换输出流：outputStreamWrite:
        FileOutputStream f1 = new FileOutputStream("d:\\outputStreamWrite.txt");

        OutputStreamWriter o1 = new OutputStreamWriter(f1,"utf-8");
//        2.写入文件
        o1.write("谁是我们的敌人，谁是我们的朋友，这个问题是革命的首要问题！");
        o1.flush();
//        3.关闭流
        o1.close();
        System.out.println();
        System.out.println("转换输出流，执行完毕");


    }
}
