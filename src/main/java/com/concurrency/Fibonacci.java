package com.concurrency;

/**
 * 斐波那契数列
 * **/
public class Fibonacci{
    private int result;
    private Fibonacci(int i) {
        result = this.run(i);
    }

    private int run(int i){
        if(i<2){
            return i;
        }else {
            return run(i-1)+run(i-2);
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(20);
        System.out.println("Fibonacci: "+f.result);

        new Thread(new Ex2Fibonacci()).start();
    }
}

class Ex2Fibonacci implements Runnable{
    private int fib(int x) {
        if(x < 2) return x;
        return fib(x - 2) + fib(x - 1);
    }

    @Override
    public void run() {
        System.out.println("Ex2Fibonacci:"+fib(20));
    }
}
