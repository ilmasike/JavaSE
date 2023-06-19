package com.kuang.io.Reader_Write.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;

/*
* 字符缓冲流BufferedWrite的使用
*
*
* */
public class Demo02 {
    public static void main(String[] args) throws Exception {
//        1.新建字符缓冲流：
        FileWriter f1 = new FileWriter("d:\\f.txt");
        BufferedWriter b1 = new BufferedWriter(f1);
//        2.缓冲流的写入
        for (int i = 0; i <7 ; i++) {
            b1.write("bulma is my wife\r\n");//也可以通过newline来换行
            b1.newLine();
            b1.flush();
        }

//        3.关闭
        b1.close();
        System.out.println("字符缓冲流的写入，执行完毕");

    }
}
