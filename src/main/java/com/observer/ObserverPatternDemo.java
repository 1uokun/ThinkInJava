package com.observer;

/**
 * 观察者模式使用案例
 * **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new MyObserver(subject);
        subject.setState(123);
    }

}

class MyObserver extends Observer{

    MyObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    void update() {
        System.out.println("监听到Subject更新: "+this.subject.getState());
    }
}
