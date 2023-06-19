package com.kuang.io.Reader_Write.printWrite;

import java.io.FileWriter;
import java.io.PrintWriter;

/*
* PrintWrite的使用
* */
public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建打印流
        FileWriter f1 = new FileWriter("d:\\print.txt");
        PrintWriter p1 = new PrintWriter(f1);
//        2.调用打印方法
        p1.println(242422222);

//        3.关闭
        p1.close();
        System.out.println("打印流执行完毕");


    }
}
