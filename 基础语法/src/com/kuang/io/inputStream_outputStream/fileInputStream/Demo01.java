package com.kuang.io.inputStream_outputStream.fileInputStream;

/*演示FileInputStream的使用
* 文件输入字节流：
*read（）：每次只打一个字节。单个字节读取
* */

import java.io.FileInputStream;

public class Demo01 {
    public static void main(String[] args) throws Exception {
//        1.创建文件字节输入流,并指定文件路径
        FileInputStream f1 = new FileInputStream("D:\\a.txt");
//        2.读取文件：(单个字节读取)
        int data=0;

        while((data=f1.read())!=-1) {
//            System.out.println(f1.read());//此时输出的未对应的字节数字
            System.out.print((char)(data)+"   ");

            /*
            * 这里注意：我之前犯的错误是没有写data，而是直接
            * System.out.print((char)(f1.read));这肯定不行，因为每次read都会读一次，这属于多次读了
            * */
        }
//        3.关闭流
        f1.close();
        System.out.println();
        System.out.println("执行完毕");


    }
}
