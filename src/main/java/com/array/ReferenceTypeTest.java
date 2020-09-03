package com.array;

import java.util.ArrayList;

/**
 * 引用类型测试
 * **/
public class ReferenceTypeTest {
    public static void main(String[] args) {
        ArrayList<Obj> arr = new ArrayList<Obj>();

        Obj obj = new Obj("Niko", 24);

        arr.add(obj);

//        Obj obj2 = obj;
        Obj obj2 = new Obj(obj);
        obj2.name = "Bellic";

        arr.add(obj2);

        System.out.println(arr.get(0).name+"; "+arr.get(1).name);

    }
}

class Obj {
    String name;
    int age;

    Obj(){

    }

    Obj(String name, int age){
        this.name = name;
        this.age = age;
    }

    Obj(Obj obj){
        this.name = obj.name;
        this.age = obj.age;
    }


}
