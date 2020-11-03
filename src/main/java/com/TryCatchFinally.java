package com;

/**
 * Q：try里面放return，finally还会执行吗？
 * A：会
 *
 * > 如果从finally块中返回一个值，那么这个值将会成为整个try-catch-finally的返回值，
 * > 无论是否有return语句在try和catch中。这包括在catch块里抛出的异常。
 * **/
public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("count: "+count()); //3
    }

    public static int count() {
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
