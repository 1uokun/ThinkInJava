package com.genericity;

/**
 * 泛型可以定义多种类型
 * 仅一次方法调用就能返回多个对象
 * **/
public class TwoTuple<A,B> {
    //这里使用public但不必担心安全性，
    //比如值会被篡改
    //因为使用了final，所以值或类型无法被篡改
    public final A first;
    public final B second;

    public TwoTuple(A a, B b){
        first = a;
        second = b;
    }

    public String toString(){
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> twoTuple = new TwoTuple<String, Integer>("Sting",123);
        System.out.println(twoTuple);
    }
}
