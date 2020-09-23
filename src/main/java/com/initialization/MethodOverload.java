package com.initialization;

public class MethodOverload {

    public static void main(String[] args) {
        MethodOverload methodOverload= new MethodOverload();
        methodOverload.method(null);
    }

    void method(Object object){
        System.out.println("Object: "+object);
    }

    void method(Object2 object2){
        System.out.println("当方法重载遇到null时，优先执行extends的子类"+object2);
    }
}

class Object2 extends Object{

}
