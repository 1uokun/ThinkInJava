//多态
package com;

public class AnimalSound {
    /**
     * makeSound只能接收Duck类型的参数，不能接收Chicken类型的参数
     * 此时就需要考虑到 - 多态
     * **/
    public void makeSound(Duck duck){
        duck.makeSound();
    }

    /**
     * 使用继承得到多态效果
     *
     * 静态类型的面向对象语言通常被设计为可以 「向上转型」
     * ：当一个类变量赋值时，这个变量的类型既可以使用这个「类本身」
     * ，也可以使用这个「类的超类」
     * **/
    public void makeSound(Animal animal){
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal duck = new Duck2();
        Animal chicken = new Chicken2();
//        makeSound(duck);
//        makeSound(chicken);
    }

}

class Duck {
    public void makeSound(){
        System.out.println("嘎嘎嘎");
    }
}

class Chicken{
    public void makeSound(){
        System.out.println("咯咯咯");
    }
}

/**
 * 使用继承得到多态效果
 *
 * 静态类型的面向对象语言通常被设计为可以 「向上转型」
 * ：当一个类变量赋值时，这个变量的类型既可以使用这个「类本身」
 * ，也可以使用这个「类的超类」
 * **/
abstract class Animal{
    abstract void makeSound();  //抽象方法
}

class Duck2 extends Animal {
    public void makeSound(){
        System.out.println("嘎嘎嘎");
    }
}

class Chicken2 extends Animal {
    public void makeSound(){
        System.out.println("咯咯咯");
    }
}

