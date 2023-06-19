package com.kuang.io.inputStream_outputStream.fileInputStream;

/*演示FileInputStream的使用
 * 文件输入字节流：
 *read（）：每次只打一个字节。单个字节读取
 * demo03是把中间的步骤用循环进行表示
 * */

import java.io.FileInputStream;

public class Demo02{
    public static void main(String[] args) throws Exception {
//        1.创建文件字节输入流,并指定文件路径
        FileInputStream f1 = new FileInputStream("d:\\a.txt");
//        2.读取文件：（一次读取多个字节）
        byte[] arrs = new byte[3];
        int count=f1.read(arrs);//首次把文件的字节赋值给 数组
        System.out.println(count);
        System.out.println(new String(arrs));//输出数组



        int count2=f1.read(arrs);//第二次读取文件，赋值给 数组

        System.out.println(count2);
        System.out.println(new String(arrs));//输出数组：ddf


        int count3=f1.read(arrs);//第三次读取文件，赋值给 数组

        System.out.println(count3);
        System.out.println(new String(arrs));//输出数组







//        3.关闭流
        f1.close();
        System.out.println();
        System.out.println("执行完毕");






    }
}
