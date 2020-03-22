package com.interfaces;

abstract class AbstractWithoutMethod {
}

/**
 * 抽象类
 *
 * 保证子类必须要有哪些方法，注意是子类与父类的关系
 * **/
abstract class AbstractWithMethod {
    abstract void print();
}

/**
 * 接口 - 策略模式
 *
 * 建立类与类之间的协议，注意是类与类之间的关系
 * 还能多重继承，有逗号隔开
 *
 * 设计模式：策略模式(Strategy Pattern)
 *     对象必须遵循我的接口
 *
 * **/
interface InterfaceMethod {
    void console();
}

interface InterfaceMethod2 {
    void console();
}

/**
 * 适配接口
 *
 * 让任何类都可以对该方法进行适配的方式。
 * 这就是使用接口而不是类的强大之处
 * **/
public class Abstract extends AbstractWithMethod implements InterfaceMethod,InterfaceMethod2{
    public static void main(String[] args) {
        Abstract a = new Abstract(){
            @Override
            public void print(){
                System.out.println("Abstract print");
            }

            @Override
            public void console(){
                System.out.println("Abstract console");
            }
        };
        a.print();
        a.console();
    }


    @Override
    void print() {

    }

    @Override
    public void console() {

    }

}

class AbstractCannotExtendsAnyMoreByAbstract extends Abstract {

}

/**
 * 通过继承来扩展接口
 * **/
interface InterfaceMethod3 extends InterfaceMethod {
    void console2();
}
