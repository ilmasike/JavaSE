package com.kuang.io.Reader_Write.FileReader;

import java.io.FileWriter;

/*
* 字符流FileWriter的使用,写入文件
* */
public class Demo03 {
    public static void main(String[] args) throws Exception {
//        1.创建FileWrite对象
        FileWriter f1 = new FileWriter("D:\\c.txt");

//        2.通过文件流写入硬盘文件
//        f1.write("我们是不要战争的，但是必须通过战争解决和平问题。不要枪杆子，必须先拿起枪杆子。");
        for (int i = 0; i <10 ; i++) {
            f1.write("布尔玛是我老婆\r\n");
            f1.flush();
        }

//   3.关闭流
        f1.close();
        System.out.println();
        System.out.println("写入完毕");

    }
}
