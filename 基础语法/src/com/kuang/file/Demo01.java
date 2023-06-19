package com.kuang.file;

import javax.xml.crypto.Data;
import javax.xml.transform.Source;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Date;

/*Flie类的使用
* 1.分隔符
* 2.文件操作
* 3.文件夹的操作
*
*
* */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        seperator();//路径分隔符;名称分隔符\
        fileOpe();
        directoryOpe();


    }
    //        1.分隔符操作
    public static void seperator(){
        System.out.println("路径分隔符"+ File.pathSeparator);
        System.out.println("名称分隔符"+File.separator);

    }
    //        2.文件操作
    public static void fileOpe() throws Exception {
//        1.创建文件
        File file = new File("d:\\javascodes\\file.txt");//这里只是创建文件对象，并不是文件（硬盘上没有）
        System.out.println(file.toString());
        if(!file.exists()){
            boolean newFile = file.createNewFile();//这才是创建文件的操作
            System.out.println("创建的结果是："+newFile);//运行一次是true,再次运行就是FALSE

        }

//        2.删除文件
//        2.1直接删除
//        System.out.println("删除的结果是"+file.delete());
//        2.2使用jvm进行删除
//        file.deleteOnExit();//这是当jvm退出时，自动帮我们删除
//        Thread.sleep(5000);//休眠5s,如果在这里结束程序，那么可以看到硬盘上的文件，5s后消失





//        3.获取文件信息
        System.out.println("获取文件的绝对路径："+file.getAbsolutePath());
        System.out.println("获取路径（写的什么路径，就是啥）"+file.getPath());//你写的相对（绝对）路径， 这里就输出相对（绝对）
        System.out.println("获取文件名称"+file.getName());
        System.out.println("获取父目录"+file.getParent());
        System.out.println("获取文件长度"+file.length());
        System.out.println("文件的创建时间"+new Date(file.lastModified()).toLocaleString());


//        4.判断
        System.out.println("判断文件是否可写（有的文件是只读的）"+file.canWrite());
        System.out.println("判断是否是文件"+file.isFile());
        System.out.println("判断是否是隐藏的"+file.isHidden());





    }

//    3.文件夹的操作
    public static void directoryOpe() throws Exception{
//        1.创建文件夹
        File dir = new File("d:\\javascodes\\aaa\\bbb\\ccc");
        System.out.println(dir.toString());//输出有结果，但是硬盘上并没有文件夹目录
        if(!dir.exists()){
//            dir.mkdir();//只能创建单层目录
            System.out.println("创建结果"+dir.mkdirs());//多级目录

        }
//        2.删除文件夹
//        2.1直接删除
//        System.out.println("删除的结果是"+dir.delete());//注意这里并不是全部删除，而是只删除最底层的ccc（且必须为空）
//        2.2使用虚拟机删除
//        dir.deleteOnExit();
//        Thread.sleep(5000);


//        3.获取文件夹的信息
        System.out.println("获取绝对路径"+dir.getAbsolutePath());
        System.out.println("获取路径"+dir.getPath());
        System.out.println("获取文件夹名称"+dir.getName());
        System.out.println("获取父目录："+dir.getParent());
        System.out.println("获取创建时间"+new Date(dir.lastModified()).toLocaleString());





//        4.判断
        System.out.println("判断是文件夹吗"+dir.isDirectory());
        System.out.println("是否隐藏"+dir.isHidden());

//        5.遍历文件夹
        System.out.println("==文件遍历==============================================");
        File f2 = new File("D:\\月刊少女野崎君\\月刊  pictures");
       String []a=f2.list();//返回的是一个数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println("===文件过滤器：FileFilter接口的使用==============================================");

        File[] files22 = f2.listFiles(new FileFilter() {//定制遍历规则后， 的文件数组
            @Override

            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".jpg")){
                    return true;
                }
                return false;
            }
        });

//        再对数组进行遍历
        for (File s:
             files22) {
            System.out.println(s.getName());
        }




    }




}
