package com.concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * 从任务中产生返回值
 *
 * 在Java SE5中引入的 Callable 是一种具有类型参数的泛型
 * 从方法call()中return返回值
 * 必须用 ExecutorService.submit()方法调用它
 * **/
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        ArrayList<Future<String>> futures = new ArrayList<Future<String>>();

        for(int i=0;i < 5;i++){
            TaskWithResult taskWithResult = new TaskWithResult(i);
            futures.add(exec.submit(taskWithResult));
        }

        for(Future<String> fs : futures)
            try {
                //用isDone()方法来查询Future是否已经完成
                if(fs.isDone()){
                    System.out.println(fs.get());
                }
            }catch (InterruptedException | ExecutionException e){
                System.out.println(e);
                return;
            }finally {
                exec.shutdown();//dont forget shutdown the executor
            }
    }
}

class TaskWithResult implements Callable<String>{
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}
