package com.observer;

/**
 * 观察者模式——观察者 抽象类
 * **/
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
