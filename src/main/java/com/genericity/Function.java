package com.genericity;

import java.util.HashMap;
import java.util.Map;

/**
 * 泛型方法
 * 基于对参数类型的方法
 *
 * 使用泛型类时，必须在穿件对象的时候指定类型参数的值，
 * 而使用泛型方法时，通常不必指明参数类型，因为编译器会为我们找出具体的类型
 * 这称为*类型参数判断(type argument inference)*
 * **/
public class Function<B> {
    //传入的参数的类型下添加一个f方法
    //如参数类型为String，那么相当于String.f(){}
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public <A> void g(A a,B b){
        System.out.println(b);
    }

    public static void main(String[] args) {
        Function func = new Function();
        func.f("AK47");
        func.f(9527);
        func.f(func);
        func.g(func,"作为一个车手");
    }
}
/**
 * 杠杆利用类型参数判断
 * **/
//Map<Person, List<? extends Pet>> petPeople =
//        new HashMap<Person, List<? extends Pet>>();
//解析： Map<A,B> A = Person, B = List<? extends Pet>

/**
 * 显示的类型说明
 */
class New{
    public static <K,V> Map<K,V> map(){
        return new HashMap<K, V>();
    }
}

class SimplerPets {
    public static void main(String[] args) {
        //New.map();    //Does not compile
        //New.<Person, List<Pet>>.map //true
        //如果使用static方法，必须在点操作符之前加上类名
    }
}