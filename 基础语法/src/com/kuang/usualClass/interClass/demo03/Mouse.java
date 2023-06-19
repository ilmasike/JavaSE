package com.kuang.usualClass.interClass.demo03;

public class Mouse implements Usb{
    @Override
    public void service() {
        System.out.println("实现usb接口的功能的实现，电脑连接成功，USB可用，鼠标开始公国");
    }
}
