package com.genericity;

class AutoMobile{};
/**
 * 只能持有指定对象AutoMobile
 * **/
public class Holder {
    private AutoMobile a;
    public Holder(AutoMobile a){
        this.a = a;
    }
    AutoMobile get(){
        return a;
    }

    public static void main(String[] args) {
        Holder h = new Holder(new AutoMobile());
    }
}
