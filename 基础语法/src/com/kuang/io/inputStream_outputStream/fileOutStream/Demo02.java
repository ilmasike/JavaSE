package com.kuang.io.inputStream_outputStream.fileOutStream;
/*文件字节流：复制文件
* 案例，先读取，再写入*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo02 {
    public static void main(String[] args) throws Exception{
//        1.创建流
//        1.1文件读取：创建文件字节输入流：read
        FileInputStream f1 = new FileInputStream("C:\\Users\\10186\\Desktop\\mako.jfif");
        //1.2文件写出去：文件字节输出流
        FileOutputStream f2 = new FileOutputStream("C:\\Users\\10186\\Desktop\\mako2.jfif");


//        2.开始读：
        byte a[]=new byte[1024];
        int data=0;
        while((data=f1.read(a))!=-1){
//            System.out.println(new String(a));

//            f2.write(a);//每次读完都要写进去
//            但是这里最后一次，可能读的会有类似覆盖的错误。所以这里不要直接write，而是用重载方法：
            f2.write(a,0,data);//这里，比如最后一次的a[]:[gdf]注意只有d是最后一个，此时data不是1024而是1，
//            那么（a,0,data）就是从a的第0个，也就是g开始，而到data的长度1结束。后面的df不会再写入



        }


//        3.关闭流
        f1.close();
        f2.close();
        System.out.println("执行完毕，奥里给");


        System.out.println();


    }
}
