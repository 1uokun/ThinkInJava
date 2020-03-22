package com.initialization;

/**
 * 涉及基本类型的重载
 *
 * 基本类型能从一个"较小"的类型自动提升至一个"较大"的类型,
 * 具体为:
 * -------------------------------------------------
 *      char      ->
 *                ->  int -> long -> float -> double
 *  byte -> short ->
 * -------------------------------------------------
 *
 * 但不能从"较大"自动降级为"较小"的类型
 * **/
public class OverloadedBasicType {
    void f0(char x){ System.out.println("f0(char)"); }

    void f1(char x){ System.out.println("f1(char)"); }
    void f1(byte x){ System.out.println("f1(byte)"); }
    void f1(short x){ System.out.println("f1(short)"); }
    void f1(int x){ System.out.println("f1(int)"); }

    void f2(long x){ System.out.println("f2(long)"); }

    void f3(float x){ System.out.println("f3(float)"); }

    void f4(double x){ System.out.println("f4(double)"); }

    public static void main(String[] args) {
        OverloadedBasicType overload = new OverloadedBasicType();

        char c = 1;
        byte b = 1;
        int x = 1;


        overload.f0(c);
        overload.f1(c); //f1(int) char会直接提升至int，而不是byte
        overload.f1(b);

        overload.f1(x);
        overload.f2(x);
        overload.f3(x);
        overload.f4(x);

//        double y = 1;
//        overload.f1(y); //error
//        overload.f2(y); //error
//        overload.f3(y); //error
//        overload.f4(y); //error
    }
}
