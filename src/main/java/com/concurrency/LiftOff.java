package com.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Runnable
 *
 * - 使用方式：
 *  LiftOff launch = new LiftOff();
 *  launch.run();
 *
 * - run为抽象方法
 *  静态方法 `Thread.yield();` 线程调度器
 *
 * - Thread.yield()
 *  Java线程机制的一部分，可以将CPU从一个线程转移给另一个线程
 *  "我已经执行完生命周期中最重要的部分了，此刻正是切换给其他任务执行一段时间的大好时间"
 * **/
public class LiftOff implements Runnable{
    protected int countDown = 10;
    //任务id
    public static int taskCount = 0;
    private final int id = taskCount++; //每一次实例化都会被加1

    public LiftOff(){}

    public LiftOff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "LiftOff!") + "),";
    }

    public void run(){
        while(countDown-- > 0){
            System.out.println(status());
            Thread.yield();
            // Old-style:
//             Thread.sleep(100);
            // Java SE5/6-style:
//             try {
//                 TimeUnit.MILLISECONDS.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
        }

    }
}
