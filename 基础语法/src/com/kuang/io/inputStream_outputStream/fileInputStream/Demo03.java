package com.kuang.io.inputStream_outputStream.fileInputStream;

/*演示FileInputStream的使用
 *read（）：每次只打一个字节。单个字节读取.这里是用数组缓冲区，来一次读取多个
 * 通常缓冲区也不是特别小到只有三个，比如1024等
 * demo03是把中间的步骤用循环进行表示
 * */


import java.io.FileInputStream;

public class Demo03{
    public static void main(String[] args) throws Exception {
//        1.创建文件字节输入流,并指定文件路径
        FileInputStream f1 = new FileInputStream("d:\\a.txt");
//        2.读取文件：（一次读取多个字节）
        byte[] arrs = new byte[3];
        int count=0;

        while((count=f1.read(arrs))!=-1){
            System.out.println("这一次读取的个数是"+count);
            System.out.println(new String(arrs));

        }









//        3.关闭流
        f1.close();
        System.out.println();
        System.out.println("执行完毕");






    }
}
