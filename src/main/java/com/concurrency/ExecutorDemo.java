package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executor 执行器
 *
 * - 用于管理Thread对象，从而【简化并发编程】。
 * Executor在客户端和任务执行之间提供了一个间接层；与客户端直接执行任务不同，这个中介对象将执行任务。
 * Executor允许你管理异步任务的执行，而无须显式地管理线程的生命周期。
 *
 * - Executor在Java SE5/6中是启动任务的优选方法。
 * **/
public class ExecutorDemo {
    public static void main(String[] args) {
        // CachedThreadPool 为每个任务
        ExecutorService exec = Executors.newCachedThreadPool();
        // 限制线程的数量
        ExecutorService exec2 = Executors.newFixedThreadPool(5);

        // 执行
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }

        // 调用shutdown()可以防止新任务被提交给这个exec。
        // 当前线程(main()的线程)运行shutdown()被调用前提交的所有任务。
        // 执行后退出
        exec.shutdown();
    }
}
