package com.kuang.exception.Demo01;

public class
Test {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try {
            new Test().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }

    //    写一个主动抛出异常的方法
//    假设这个方法中，处理不了这个异常，在方法上抛出异常
    public void test(int a,int b)throws ArithmeticException{
        if (b==0) {
            throw new ArithmeticException();//主动抛出异常：throw throws,抛出异常一般在方法中使用
        }
        System.out.println(a/b);
    }


    public void a(){b();}
    public void b(){a();}
}


/*//try  catch  finally
        try {//try监控区域


            if (b==0) {
                throw new ArithmeticException();
            }
            System.out.println(a/b);
//            new Test().a();//java.lang.StackOverflowError出现了错误
//假设要捕获多个异常：从小到大。Error < Exception < Throwable
        } catch (Error e) {    //catch(想要捕获的异常类型)
            System.out.println("error");
        }catch (Exception e){
            System.out.println("exception");
        }catch (Throwable e){
            System.out.println("Throwable");
        }

        finally {
            System.out.println("finally的输出");
        }*/
