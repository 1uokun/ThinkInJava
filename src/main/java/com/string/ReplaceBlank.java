package com.string;

/**
 * 后序遍历替换空格 O(n)
 *
 * "We are happy" to "We%20are%20happy"
 * **/
public class ReplaceBlank {
    public static void main(String[] args) {
        char[] ch = "We are happy".toCharArray();

        int len = ch.length;
        int count = 0;

        for(int i=0;i<len;i++){
            if(ch[i] == ' '){
                count+=2;
            }
        }

        char[] result = new char[len+count]; // *静态类型需要提前定好长度（内存）
        do {
            len--;

            if(ch[len] == ' '){
                count-=2;
                result[len+count] = '%';
                result[len+count+1] = '2';
                result[len+count+2] = '0';
            }else {
                result[len+count] = ch[len];
            }

        }while (len>0);

        System.out.println(result);

    }
}
