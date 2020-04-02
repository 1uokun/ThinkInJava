package com.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 优先级 Priority
 *
 * 线程的优先级将该线程的重要性传递给了调度器。
 * 尽管CPU处理现有线程集的顺序是不确定的，但是调度器将倾向于让优先权最高的线程去执行。
 * 然而，这并不是意味着优先权较低的线程将的得不到执行（也就是说，优先权不会导致死锁）。
 * 优先级较低的线程仅仅是执行的频率较低。
 *
 * 在绝大多数时间里，所有线程都应该以默认的优先级允许。
 * - 视图操纵线程优先级通常是一种错误
 * **/
public class PriorityDemo implements Runnable{
    private int countDown = 5;
    private volatile double d;
    private int priority;

    public PriorityDemo(int priority) {
        this.priority = priority;
    }

    public String toString() {
        return Thread.currentThread() + ": "+ countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while(true) {
            for(int i=1;i<100000;i++){
                d += (Math.PI + Math.E) / (double)i;
                if(i % 1000 == 0)
                    Thread.yield();
                    System.out.println(this);
                    if(--countDown == 0) return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            exec.execute(new PriorityDemo(Thread.MIN_PRIORITY));
            exec.execute(new PriorityDemo(Thread.MAX_PRIORITY));
        }

        exec.shutdown();
    }
}
