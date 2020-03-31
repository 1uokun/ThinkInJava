package com.holdingObjects;

import java.util.ArrayList;

/**
 * 泛型和类型安全的容器
 *
 *  - Collection
 *  容器，一个独立元素的序列，这些元素都服从一条或多条规则。
 *  比如：List、Set、Queue
 *
 *  - Map
 *  映射，一组成对的"键值对"对象，允许你使用键来查找值。
 *  比如：ArrayList、映射表（也称 字典）允许使用另一个对象来查找某个对象
 *
 *  - 自动向上转型
 *  List<Apple> apples = new ArrayList<Apple>();
 *
 *  - 类的拓展: LinkedList extends List
 *  List<Apple> apples = new LinkedList<Apple>();
 *
 * * *【 Collections 】* * * * * * * * * * * * * * * * * * * * * *
 *                                                               *
 *   Iterator   <-------    Collection     <-------   Map        *
 *      ^                       ^                      ^         *
 *      ^                       ^                      ^         *
 * ListIterator <------- List | Set | Queue    HashMap | TreeMap *
 *                         ^                                     *
 *                         ^                                     *
 *                ArrayList | LinkedList                         *
 *                                                               *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * **/
public class ArrayLearning {
    static class Apple{
        private static long counter; // static 单例模式的基础支撑
        private final long id = counter++;
        long id() { return id; }
    }
    class Banana{
        String id() { return "Banana"; }
    }

    long id() { return Apple.counter; }

    public ArrayLearning(){
        ArrayList arr = new ArrayList();
        arr.add(new Apple());
        arr.add(new Banana());

        // System.out.println(arr.get(0).id()); //Illegal
        // 如果不强制转型，arr.get(0).id()默认返回的是Object类。
        System.out.println(((Apple)arr.get(0)).id());

        // 应用预定义的泛型
        ArrayList<Apple> apple = new ArrayList<Apple>();
        apple.add(new Apple());
        // 编译期错误
        // apple.add(new Banana()); // Illegal

        System.out.println(apple.get(0).id());
    }

    public static void main(String[] args) {
        new ArrayLearning();
    }
}
