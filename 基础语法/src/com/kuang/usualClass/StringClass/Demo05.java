package com.kuang.usualClass.StringClass;
/*StringBuffer   StringBuilder
* 相比于String：1.效率高   2.节省内存
* @author:hututu
*
*
*
* */

public class Demo05 {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();

        //运行效率 StringBuild效率高
//        1.append();追加
        sb.append("玩归玩，闹归闹，别拿姐开玩笑");
        System.out.println(sb);
        sb.append("世界第一");
        System.out.println(sb);
        sb.append("java是世界上最好的语言");
        System.out.println(sb);
        sb.append(12);
        System.out.println(sb);
//        2.insertI();添加，在某个位置
        sb.insert(1,"kakarote");
        System.out.println(sb);
        sb.insert(3,3242);
        System.out.println(sb);
//        3.replace方法
        sb.replace(1,3,"更换体");
        System.out.println(sb);
//        4.delete();删除
        sb.delete(1,3);
        System.out.println(sb);

       System.out.println(" Trump is the mom of the knowlydge:川普：没有人比我更懂");
//       清空
        sb.delete(0,sb.length());
        System.out.println(sb+"清空");








    }
}
