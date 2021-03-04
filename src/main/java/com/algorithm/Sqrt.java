package com.algorithm;

/**
 * 使用二分法求X的平方根，要求返回整数
 *
 * left mid right
 * **/
public class Sqrt {
    static int Sqrt(int X){
        int left = 0;
        int right = X;

        while (left <= right){
            int mid = (left+right)/2;
            if(mid * mid == X){
                return mid; //java while里可以直接返回值
            }else if(mid * mid > X){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println("Sqrt 4 is "+Sqrt(4));
    }

}
