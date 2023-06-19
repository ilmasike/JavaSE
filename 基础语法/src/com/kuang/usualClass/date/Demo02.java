package com.kuang.usualClass.date;
/*calendar类
*
* */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;

public class Demo02 {
    public static void main(String[] args) {
//        Calendar的构造方法是protected的，所以不能直接new
//        1.创建Calendar对象
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime().toLocaleString());
//        2.获取时间信息
        System.out.println("先获取年");
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);//0表示1月，所以最终结果要加一
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));


//       3. 修改时间：Calendar.set
        Calendar cal2=Calendar.getInstance();
        cal2.set(Calendar.YEAR,2020);
        cal2.set(Calendar.MONTH,8);
        System.out.println(cal2.get(Calendar.YEAR));
        System.out.println(cal2.getTime().toLocaleString());

//        4.基于当前时间，进行添加或者减少：add，
        cal2.add(Calendar.HOUR,2);
        System.out.println("添加后"+cal2.getTime().toLocaleString());

//        补充方法：

        int min=cal2.getActualMinimum(Calendar.DAY_OF_MONTH);//获取当前时间的最大值(比如本月的最大一天)，最小值
        System.out.println(min);//1

        int max=cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(max);//30

//        加一天后看看效果：
        cal2.add(Calendar.MONTH,1);
        int min2=cal2.getActualMinimum(Calendar.DAY_OF_MONTH);//获取当前时间的最大值(比如本月的最大一天)，最小值
        System.out.println(min2);//1

        int max2=cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(max2);//31







    }

}
