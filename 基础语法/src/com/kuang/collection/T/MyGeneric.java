package com.kuang.collection.T;

/*泛型：1.提高代码的重用性   2.防止类型转换异常，提高代码的安全性*/

/*T (类型占位符)   E（元素）  K（）   V（value）   */


/*泛型类：类名<T,E,K>
* 1.T是类型占位符，表示一种引用类型，不是基本类型。可以编写多个（用逗号隔开）
* 2.注意：不能实例化。可以创建变量
* 3.不同的泛型对象，不能相互赋值。MyGeneric<String>  m2=m;注意因为这里的m是int类型
* */

public class MyGeneric <T> {
//    使用泛型T
//    1.创建变量
    T t;

//    2.添加方法，使用泛型（作为方法的参数）
    public void show(T a){
        System.out.println(a);
//        注意:不能new 对象：T t1=new T();
//        因为是不知道T 到底是什么数据类型，不能保证其构造方法是否能用（万一是私有的呢），
//        也没法保证其一定是无参构造等
    }



//    3.使用泛型作为方法的返回值：
    public T t_Get(){
        return t;
    }

//    测试一下
    public static void main(String[] args) {
//        使用泛型类来创建对象：注意这里不能再用占位符，而应该是实际的引用类型
        MyGeneric<String> o = new MyGeneric<>();//后面的<>，在jdk1.7后可写可不写
       o.t="卡卡罗特";
       o.show("琪琪");
       o.show("布尔玛");
       o.show("山吹见取");
       o.show("山口百惠");
        o.show("松阪庆子");
        o.show("小野洋子&&约翰列侬");
        o.show("鲍勃迪伦");

        String s = o.t_Get();
        System.out.println(s);
        System.out.println("==========================================");

        MyGeneric<Integer> m = new MyGeneric<>();
        m.t=23;
        m.show(234);
        System.out.println(m.t_Get());


    }
}
