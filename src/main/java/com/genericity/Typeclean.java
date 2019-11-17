package com.genericity;

import java.util.ArrayList;

/**
 * Java泛型是使用擦除来实现的
 *
 * 1.在泛型代码内部，无法获得任何有关泛型参数类型的信息
 * 2.List<String>和List<Integer>是相同的类型，因为这两种形式都被
 *   擦除成它们的"原生"类型，即List
 * **/
public class Typeclean {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);   //true
    }
}

class HasF{
    public void f(){System.out.println("I has a f void");}
}

class Manipulator<T> {
    public T obj;
    public Manipulator(T x){ obj = x; }
    public void manipulator(){
        //Error: cannot find symbol: method f();
        //obj.f();
        /**
         * 在编译器就会错误，泛型参数T有没有f方法是不知道的
         * 由于有了擦除，Java编译器无法将obj.f()这一需求映射到
         * HasF拥有f()这一事实上。
         * 我们必须协助泛型类 <T extends HasF>
         * **/
    }
}
/**
 * 边界<T extends HasF>声明T必须具有类型HasF或者从HasF导出的类型。
 * **/
class Manipulator2<T extends HasF>{
    private T obj;
    public Manipulator2(T x){ obj = x; }
    public void manipulator(){
        obj.f();
    }
}

/**
 * 何时使用泛型更合适
 *
 * 当你希望代码能跨多个类工作时，使用泛型才有所帮助
 * **/
//Manipulator反泛化
class Manipulator3{
    private HasF obj;
    public Manipulator3(HasF x){ obj = x; }
    public void manipulator(){
        obj.f();
    }
}