package com.genericity;

/**
 * 使用泛型可以暂时不指定类型
 * 用<T>代替
 * **/
public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a = a;
    }
    public void set(T a){
        this.a = a;
    }
    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder3<Container> h3 = new Holder3<Container>(new Container());
        //h3一旦被声明为Container类型，就不能设置为其他类型了
        Container a = h3.get();
        //h3.set("asd");  //Arg type error
        //h3.set(1);

        Holder3<String> hs = new Holder3<String>(new String());
        hs.set("asd");
        System.out.println(hs.get());   //asd
    }
}
