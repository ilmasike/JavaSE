package com.kuang.io.inputStream_outputStream.bufferedOutputStream;
/*
* 使用bufferedOutputStream
* 注意flush写入硬盘
* */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Demo01 {
        public static void main(String[] args) throws Exception {
//            1.新建  字节缓冲输出流：bufferedOutputStream
        FileOutputStream f1 = new FileOutputStream("d:\\b.txt");

        BufferedOutputStream b1 = new BufferedOutputStream(f1);
//        2.输出文件：
//            b1.write('s');
//            String string="卡卡罗特 love 牛琪琪";
//            String string2="克林才是人生赢家";
//            b1.write(string.getBytes());


            for (int i = 0; i <10 ; i++) {
                b1.write("bulma love kakaroute\r\n".getBytes());//会先写入8k的缓冲区，此时如果没有close这一步，硬盘
                // 里会只有b.txt ,但是里面没有数据
                b1.flush();//刷新到硬盘
//                 \r\n是换行的意思
            }


//            3.关闭流；
            b1.close();//(这里实际上已经调用了flush方法，即使上面的flush你没写也没事，但是上面写了更保险（效率稍微低点）)
            System.out.println("执行完毕");


}}
