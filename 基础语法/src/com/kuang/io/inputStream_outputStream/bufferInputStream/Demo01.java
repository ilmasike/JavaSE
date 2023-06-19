package com.kuang.io.inputStream_outputStream.bufferInputStream;
/*字节缓冲流，bufferedInputStream
*
*
*
* */

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo01 {
    public static void main(String[] args) throws  Exception {
//        1.实例化字节缓冲流
        FileInputStream f1 = new FileInputStream("D:\\a.txt");
        BufferedInputStream b1 = new BufferedInputStream(f1);//缓冲流的目的：增强节点流
//        2.读取：用缓冲流进行读取：缓冲区默认大小为DEFAULT_BUFFER_SIZE = 8192;
//        int data=0;
//        while((data=b1.read())!=-1){
//            System.out.print((char)data);
//        }

//        也可以不要8192，自己设置缓冲区的大小
        byte arr[]=new byte[1024];
        int count=0;
        while((count=b1.read(arr))!=-1){
//            System.out.println((char)count);//注意不要这么写， count不是data的功能，读出来的只是数字
            System.out.println(new String(arr,0,count));
        }





//        3.关闭流
//        f1.close();
        b1.close();//关闭缓冲流即可，自然会把字节流给关闭

        System.out.println("执行完毕");







    }
}
