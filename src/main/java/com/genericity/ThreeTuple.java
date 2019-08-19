package com.genericity;

/**
 * 利用继承机制实现长度更长的元组
 * **/
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;
    public ThreeTuple(A a,B b,C c){
        super(a,b);
        third = c;
    }
}
