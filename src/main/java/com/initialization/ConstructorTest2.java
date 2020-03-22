package com.initialization;

class Test2 {
    String s1;
    String s2 = "s2";
    String s3;
    Test2(){
        s3 = "s3";
    }
}

public class ConstructorTest2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.s1);
        System.out.println(test2.s2);
        System.out.println(test2.s3);
    }
}
