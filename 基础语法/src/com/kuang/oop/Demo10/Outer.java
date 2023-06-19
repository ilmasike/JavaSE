package com.kuang.oop.Demo10;

public class Outer {
    private int id=1979;
    public void out(){
        System.out.println("这里是外部类的out方法");
    }

    public  class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
        //
        public void getID(){//获得外部类的私有属性
            System.out.println(id);
        }

    }



}



/*package com.kuang.oop;

import com.kuang.oop.Demo10.Outer;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();//先把外部类实例化
        outer.out();

//        对于内部类，可以通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();



    }
}
*/
