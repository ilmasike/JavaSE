package com.kuang.oop.demo01;

public class Demo04 {
    public static void main(String[] args) {
//        值传递
        int b=9023;
        change(b);
        System.out.println(b);//这里输出的依然是9023，因为java是值传递，只是把9023放到change方法里
//        并没有影响主方法中的数。change中形参a不等于主函数中的a.
//        与demo05对照着看


    }


//    注意这里返回值为空，只是执行了一个操作
    public static void change(int a){
        a=10;
    }
}
