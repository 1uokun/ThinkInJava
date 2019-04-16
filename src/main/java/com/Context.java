package com;

public class Context {

    float f = 3.14f;
    int i = func();
    int func(){
        return 1;
    }
    int a1[];
    int [] a2;
    public static void main(String[] args) {
        int[] a3 = {1,2,3,4,5};
        for(int i:a3){
            System.out.println(a3[i-1]);
        }
    }
}

class Apple {
    public void one(){
        this.two();
        two();
    }

    public void two(){
        System.out.println("Two");
    }
}