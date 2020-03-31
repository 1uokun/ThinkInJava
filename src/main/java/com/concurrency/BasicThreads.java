package com.concurrency;

/**
 * BasicThreads.java
 *
 * Thread构造器只接收Runnable对象
 * 调用Thead对象的start()方法为该线程执行必需的初始化操作，然后才调用Runnable对象的run()方法
 * LiftOff在不同线程，因此仍旧执行main()线程中的其他操作(
 *  这种能力并不局限于main()线程，任何线程都可以启动另一个线程
 * )
 * **/
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff"); //先执行这一行

        //简写
        //android > Activity 内有一个方法runOnUiThread
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running after LiftOff");
            }
        }).start();

        Thread ta = new Thread(new Ex1A());
        Thread tb = new Thread(new Ex1B());
        ta.start();
        tb.start();
    }
}

class Ex1A implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i<3){
            i++;
            System.out.println("Ex1A print");//执行顺序随机的
            Thread.yield();
        }
        System.out.println("Ex1A break-out loop");
        return;
    }
}

class Ex1B implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i<3){
            i++;
            System.out.println("Ex1B print");
            Thread.yield();
        }
        System.out.println("Ex1B break-out loop");
        return;
    }
}
