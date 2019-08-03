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
    }
}
