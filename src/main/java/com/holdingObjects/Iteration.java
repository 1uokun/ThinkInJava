package com.holdingObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator
 *
 * 不必知晓容器的确切类型
 *
 * - iterator() 返回一个Iterator。Iterator将准备好返回序列的第一个元素
 * - next()     获得序列中的下一个元素
 * - hasNext()  检查序列中是否还有元素
 * - remove()   将迭代器新近返回的元素删除
 * **/
public class Iteration {

    public static void main(String[] args) {
        List<ArrayLearning> pets = new ArrayList<ArrayLearning>();
        pets.add(new ArrayLearning());
        pets.add(new ArrayLearning());
        display(pets.iterator());
    }

    static void display(Iterator<ArrayLearning> it){
        while(it.hasNext()){
            ArrayLearning p = it.next();

            System.out.println("iterator: "+p.id());
        }
    }
}
