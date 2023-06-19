package com.kuang.oop.Demo06;

public class Teacher extends  Person{
}


/*package com.kuang.oop;

import com.kuang.oop.Demo06.Person;
import com.kuang.oop.Demo06.Student;

public class Application {
    public static void main(String[] args) {
//        类型之间的准换：高转低    比如父 子类的转换
        Person student = new Student();
//        student.go;   //此时会报错
//        那么如何让student调用go方法呢？？将student对象转换为Student类型，我们就可以使用Student类型的方法了

        ((Student) student).go();


        System.out.println("============================");
        Student s1 = new Student();
        Person person=s1;
//        person.go   走不了。注意：当子类转换为父类（高类）时，有可能使用不了（损失）一些自己本来的方法


    }}
*/