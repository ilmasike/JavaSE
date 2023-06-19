package com.kuang.usualClass.systemClass;

import java.util.Arrays;

/*
 * System构造方法私有，所以用的时候不需要创建对象,此类中的属性方法，都是静态的，可以直接类名进行调用
 * */
public class Demo01 {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());

//        1.arraycopy:实现数组的复制:src要复制的源数组，srcPos:从哪个位置开始复制，dest:目标数组，
//                                       destPos:目标数组的位置，   length：长度
        int a[]={2,4,5,67,7,7,88,456,445,99,2345,2433};
        int b[]=new int[29];
        System.arraycopy(a,0,b,0,a.length);
        for (int s:b) {
            System.out.print(s+"  ");

        }


//        2.arraycopyOf与Arrays.copy的辨别：看源码：里面用的就是arraycopyOf与

        /*public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }
*/


//       3. System.gc;垃圾回收：比如匿名对象new Student（"xiaoming","19"）；创建完后就变为垃圾。此时如果
//        如果用 System.gc();该方法会调用Finalize()方法---->可以通过在Student类中重写Finalize，比如输出一句话，
//        来判断System.gc()是否调用了Finalize()方法：这个过程就是垃圾回收。


        System.gc();


//        4.exit:退出jvm
        System.exit(0);
        System.out.println("c结束了");//这句话不再执行






    }
}
