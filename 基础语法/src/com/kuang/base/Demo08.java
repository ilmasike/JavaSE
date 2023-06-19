package com.kuang.base;

public class Demo08 {
    //类变量：static  随着类一起生一起死
    static double salary=2500;

//===============================================================
//    实例变量：在类里，方法外。从属于对象（类）。如果不自行初始化，这
//    个类型的默认值0或者0.0，除了基本类型其余都是null，boolean是false
    String name;
    int age;
//    属性（变量）
//===================================================================
//    main方法
    public static void main(String[] args) {
        int i=10;//局部变量（存在方法里的）：使用时必须声明和初始化值   int i;sout时出错。
        System.out.println(i);
        Demo08 demo08 = new Demo08();
        demo08.name="胡振坤";//对实例变量进行赋值
        System.out.println(demo08.name);
        System.out.println(demo08.age);
//---------------------------------------------------------------------
        System.out.println(salary);//类变量不用赋值，可以直接输出

    }
//===========================================================
//    其他方法：
    public void add(){
    }
}
