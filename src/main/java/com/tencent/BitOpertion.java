package com.tencent;


/**
 * 位运算
 *
 * **/
public class BitOpertion {
    public static void main(String[] args) {
        int a = 3;  // 0011
        int b = 5;  // 0101
        int c = 8;  // 1000
        int result;

        System.out.println("a: "+Integer.toBinaryString(a));//自动转为二进制
        result = a & b; // &与操作 对应位都为1结果才为1，否则0

        System.out.println("与运算所有结果为1才为1："+result); //1

        result = a | b; // |或操作 对应位有一个位为1则为1
        System.out.println("或运算有一个位为1时就为1："+result); //0111 -> 7

        result = b ^ c; // ^异或操作 对应位不同时为1，相同时为0
        System.out.println("异或运算相反时为1相同时为0："+result); //1101 => 13

        /**
         * int 4个字节32位 所以a的完整二进制表示为一下：
         *  0000-0000 0000-0000 0000-0000 0000-0011
         * 去反操作
         *  1111-1111 1111-1111 1111-1111 1111-1100
         * 高位为1表示为负数，负数在计算机里是以补码的形式表现的
         *  0011+1 = 0100
         * **/
        result = ~a;   //~去反操作 对应位1变成0，0变成1
        System.out.println("去反操作：原码 反码 补码"+result);

        result = a<<2;  //0011 -> //1100
        System.out.println("a<<2表示a的二进制中的1左移2位"+result);
    }

    BitOpertion(){
        int[] A = {1,1,1,2};
        System.out.println("唯一不同的值："+singleNumber(A,4));
    }

    /**
     * 使用异或找到数组中唯一不同的值
     * **/
    int singleNumber(int A[], int n){
        int one = 0, two = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("start");

            two |= A[i] & one;//two 积累值
            System.out.println(two);
            one ^= A[i];//one不断求反
            System.out.println(one);

            int t = one & two;//第三次的时候one和two都保留了该位的值
            System.out.println(t);

            one &= ~t;//清零出现三次的该位的值
            System.out.println(one);

            two &= ~t;
            System.out.println(two);

            System.out.println("end");

        }
        return one;
    }
}
