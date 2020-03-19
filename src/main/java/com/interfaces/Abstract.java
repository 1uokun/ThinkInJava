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
 * 接口
 *
 * 建立类与类之间的协议，注意是类与类之间的关系
 * 还能多重继承，有逗号隔开
 * **/
interface InterfaceMethod {
    void console();
}

interface InterfaceMethod2 {
    void console();
}

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
