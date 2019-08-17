package com.concurrency;

import java.util.concurrent.*;

public class CacheThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor exec =  (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
            exec.shutdown();
        }
    }
}
