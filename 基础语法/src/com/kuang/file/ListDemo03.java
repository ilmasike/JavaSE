package com.kuang.file;

import java.io.File;

/*案例1递归遍历文件夹*/
public class ListDemo03 {
    public static void main(String[] args) {
        lisDir(new File("D:\\javascodes"));
        System.out.println("==遍历文件夹：======================");
        lisDir(new File("D:\\javascodes2"));
        System.out.println("==删除文件夹：======================");
        delDir(new File("D:\\javascodes2"));
        System.out.println("删除后遍历这个文件夹：");
        lisDir(new File("D:\\javascodes2"));


    }
    /*案例1递归遍历文件夹*/
    public static void lisDir(File dir){
        File[] f1 = dir.listFiles();
        System.out.println(dir.getAbsolutePath());//在这里输出文件夹的路径

        if(f1!=null&&f1.length>0){
            for (File f:
                 f1) {
                if(f.isDirectory()){//如果是文件夹，接着递归下去
                    lisDir(f);//对这个文件夹进行递归 遍历；
                }
                System.out.println(f.getAbsolutePath());//如果是文件，直接输出名字
            }

        }

    }

    /*案例2递归删除文件夹*/
    /*delete之能删除空目录（用递归）*/
    public static void delDir(File dir ){
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files!=null&&files.length>0) {
                for (File f:
                     files) {
                    if(f.isDirectory()){
                        delDir(f);
                    }else{
                        System.out.println("此时发现了文件，为"+f.getAbsolutePath()+",删除的结果是"+f.delete());
                    }

                }

            }
            System.out.println("此时都是空文件夹，路径为："+dir.getAbsolutePath()+",此文件夹删除的结果是"+dir.delete());



        }
    }




}
