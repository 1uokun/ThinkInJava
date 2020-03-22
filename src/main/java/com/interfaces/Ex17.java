package com.interfaces;

/**
 * 证明在接口中的域隐式地是static和final的。
 * **/
public class Ex17 implements Months,Day.Hour{
    public static void main(String[] args) {
        System.out.println("ex17 JANUARY: "+Ex17.JANUARY); // static
        System.out.println("ex17 moment: "+Ex17.moment); // static
        // final
        // ex17.JANUARY = 2;//Cannot assign a value to finial variable 'JANUARY'
    }
}

interface Months {
    static final int JANUARY = 1; // 灰色表默认
}

/**
 * 嵌套接口
 *
 * 使用方式：implements Day.Hour
 * **/
interface Day {
    interface Hour {
        String moment = "24h";
    }
}
