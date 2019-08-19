package com.genericity;


/**
 * 存储任意类型的对象容器
 * **/
class Container {};
/**
 * Java SE5之前，
 * 我们可以让这个类直接持有Object类型的对象
 * **/
public class Holder2 {
    public Object a;
    //constructor
    public Holder2(Object a) {
        this.a = a;
    }
    //set
    public void set(Object a){
        this.a = a;
    }
    //get
    public Object get(){
        return a;
    }

    //来看实例
    public static void main(String[] args) {
        //创建一个数组
        Container[] c = new Container[10];
        
        Holder2 h = new Holder2(new Container());

        //创建一个Container对象
        Container a = (Container)h.get();

        //创建一个字符串
        h.set("Set a string");
        String s = (String)h.get();
        System.out.println(s);

        //创建一个int
        h.set(1);
        Integer i = (Integer)h.get();
        System.out.println(i);

        System.out.println(a.getClass());
        System.out.println(c.length);
    }
}
