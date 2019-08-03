package com.genericity;


public class Holder {
    private Object a ;
    public Holder(Object a){this.a = a;}
    public Object get(){return a;}
    public void set(Object a){this.a = a;}
    public static void main(String[] args) {
        Holder h1 = new Holder(new Automobile());
        Automobile b = (Automobile)h1.get();
        h1.set(123);
        System.out.println(b.toString());
    }
}
