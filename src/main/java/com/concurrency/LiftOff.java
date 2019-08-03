package com.concurrency;

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
        }

    }
}
