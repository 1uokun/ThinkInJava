package com;

class Component {
    Component(int i){
        System.out.println("Component constructor"+i);
    }

}

class React extends Component {
    React(){
        super(1);
        System.out.println("React constructor");
    }
}

public class Extends {
    public static void main(String[] args) {
        System.out.println("Main constructor");
        React r = new React();
    }
}

/**
 * public  接口访问权限
 * private 你无法访问
 * protected 继承访问权限
 * **/

/**
 * 构造器传递参数
 *
 * 导出类中的构造器内携带参数，
 * 基类必须用super显式地赋值参数的值
 * **/