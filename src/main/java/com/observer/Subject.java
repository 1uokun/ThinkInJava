package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式——目标类（可自定义数据结构）
 *
 * 和Observer耦合
 * **/
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }

    // 添加目标
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 通知响应
    private void notifyAllObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
