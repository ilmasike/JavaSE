package com.kuang.exception.Demo02;
//自定义的异常类
//其实想写自己的异常类，可以双击shift来搜下比如ArrayIndexOut..这个异常类，参考下
public class MyException extends Exception {
//    传递数字：>10就抛异常
    private int detail;

    public MyException(int a) {
        this.detail=a;
    }


//    toString,异常的打印信息

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
