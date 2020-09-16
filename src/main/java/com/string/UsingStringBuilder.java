package com.string;

/**
 * 字符串拼接
 *
 * - StringBuilder类提供了丰富而全面的方法：
 * insert()、replace()、substring()、reverse()
 * 最常用的还是 append()、 toString()和 delete()
 *
 * 在Java SE5之前用的是StringBuffer
 * **/
public class UsingStringBuilder {
    private String[] arr = new String[10];

    public UsingStringBuilder(){
        for(int i=0;i<arr.length;i++){
            arr[i] = i+"";
        }
    }

    public static void main(String[] args) {
        String s = "";
        s = "A"+"B"+"C"+"D";
//        System.out.println(s);

//        System.out.println(new UsingStringBuilder());
        new Print1ToMaxOfDigits(10);
    }

    //案例：打印出列表arr
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i=0;i<arr.length;i++){
            stringBuilder.append(arr[i]);
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

class Print1ToMaxOfDigits {
    public Print1ToMaxOfDigits(int n){
        Print1ToMaxOfNDigits(n);
    }

    void Print1ToMaxOfNDigits(int n){
        if(n>=0){
            char[] number = new char[n+1];
            for(int i=0;i<10;++i){
                number[0] = (char) (i+'0');
                Print1ToMaxOfNDigitsRecursively(number, n, 0);
            }
        }
    }

    void Print1ToMaxOfNDigitsRecursively(char[] number, int length, int index){
        if(index == length -1 ){
            //PrintNumber
            System.out.println(number);
        }else {
            for(int i=0;i<10;++i){
                number[index+1] = (char) (i + '0');
                Print1ToMaxOfNDigitsRecursively(number, length, index+1);
            }
        }

    }
}
