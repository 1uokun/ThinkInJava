package com.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SetTimeout {
    public static void main(String[] args) {

        new Ex6();

        //线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
                try {
                    Thread.sleep(1000*3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("V");
            }
        }).start();

        //线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
                try {
                    Thread.sleep(1000*2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("S");
            }
        }).start();
    }
}

class Ex6 {
    Ex6() {
        ExecutorService exec = Executors.newCachedThreadPool(); // 自动分配线程
        ExecutorService exec2 = Executors.newFixedThreadPool(1);//规定线程使用数量
        //1条线程的话遇到sleep只能等待，多条线程的话遇到sleep可以继续下一条线程

        for(int i=0;i<10;i++){
            exec2.execute(new Runnable() {
                @Override
                public void run() {
                    double time = Math.random()*10*1000;
                    try {
                        Thread.sleep((int)time);
                        System.out.println("sleep time: "+time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        exec2.shutdown();
    }
}
