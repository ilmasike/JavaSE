package com.kuang.usualClass.baozhuangClass;

public class Demo03 {
    public static void main(String[] args) {
        Integer integer1 = new Integer(100);//手动装箱：其class文件:是Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println("手动装箱的结果是："+(integer1==integer2));

        Integer integer3=100;//自动装箱：其class文件是：Integer integer3=Integer.Valueof(100);
        Integer integer4=100;
        System.out.println("100时：自动装箱的结果是："+(integer3==integer4));//这一步可以换成integer=200；对比试试



//        同样是自动装箱：如果把数字改为200：结果就不再试TRUE
//        可以ctrl 按住，看下valueOf的源码：
        Integer integer5=200;//自动装箱：其class文件是：Integer integer3=Integer.Valueof(200);
        // 在缓冲区内：并不实例化对象，而是用缓冲区Integer已经存在的对象return IntegerCache.cache[i + (-IntegerCache.low)]
        // 在缓冲区外才实例化对象（new）（-128--->127,一共256个数字范围）
        Integer integer6=200;
        System.out.println("200时：自动装箱的结果是："+(integer5==integer6));


        System.out.println("===========integer缓冲区的代码=========================");


        /*
        * public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }*/

        Integer integer7=101;//自动装箱：其class文件是：Integer integer3=Integer.Valueof(101);
        Integer integer8=101;
        System.out.println("对比下101时：自动装箱的结果是："+(integer7==integer8));//此时调用的是缓冲区已经存在的对象



        /*手动装箱：肯定是不同地址的引用对象
        * 自动装箱：缓冲区内，对应的是ValueOf已经在栈中创建好了的对象，自然是相等的地址
        *          缓冲区外，对象的是ValueOf 中，return的new Integer(i)  方法，也是新建了实例化对象，所以不是相等地址
        * */





    }
}
