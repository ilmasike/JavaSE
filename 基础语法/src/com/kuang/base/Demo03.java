package com.kuang.base;

public class Demo03 {
    public static void main(String[] args) {
//        整数拓展，   进制，   二进制0b，     十进制，  八进制0，  十六进制0x,
    int i=10;
    int i2=010;//八进制0
    int i3=0x10;//十六进制0x
        System.out.println(i);//10
        System.out.println(i2);//8
        System.out.println(i3);//16
//        ====================================================
        System.out.println("=====================================================");
// 浮点数拓展：银行业务怎么表示？钱
        //对应的类：BigDecimal  数学工具类
        //关于float和double的区分
//        float 有限 离散  舍入误差   大约  接近但不等于
//        double
//        最好完全避免使用浮点数进行比较
//        最好完全避免使用浮点数进行比较
//        最好完全避免使用浮点数进行比较（也就是说银行业务不能用float表示，而是用BigDecimal）
        float f=0.1f;//0.1
        double d=1.0/10;//0.1
        System.out.println(f==d);//false
//        -----------------------------------------------
        float d1=2342352353f;
        float d2=d1+1;
        System.out.println(d1==d2);//true

//        ===============================================
        //字符拓展
//        ==============================================
        char c1='a';
        char c2='中';
        char c3='s';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换

        //所有的字符本质还是数字；
        //编码，  Unicode表：97=a;65=A;    2字节     65536字符   2的16次方就是65536
        //U0000    UFFFF
        char c4='\u0062';//注意u是转义字符
        System.out.println(c4);
        char c8 = '\u0061';
        System.out.println(c8);

//        转义字符
        //  \t就是回车   \n是换行
        System.out.println("hello\tworld");//制表格，相当于多了table
        System.out.println("hello\nworld");

        System.out.println("=====================================================");
        //拓展string
        String sa=new String("hello world");
        String sb=new String("hello world");
        System.out.println(sa==sb);//false
//        ------------------------------------------------
        String sc="hello world";
        String sd="hello world";
        System.out.println(sc==sd);//true
        //对象  从内存分析   为什么结果不一样（可以用equal试试）（一个比较的地址，一个比较的内容）


//        布尔值拓展
        boolean flag=true;
        if(flag==true){      //或者写成if(flag).......新手老手的区别：less is more!!!
            System.out.println();
        }

    }
}
