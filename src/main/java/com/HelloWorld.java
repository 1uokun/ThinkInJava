package com;

import java.lang.Character;
import java.util.*;
import net.sf.json.JSONObject;

public class HelloWorld {
    public static void main(String[] args) {
        new PrintOneToHundred();
    }
}

class Obj {
    String name;
    int age;
}

class Void {
    Void(int i){
        System.out.println("Void Int:"+i);
    }

    Void(String s){
        System.out.println("Void String:"+s);
    }

    void Func(int i){
        System.out.println("Func2 "+i);
    }

}

class ListCharacter {
    ListCharacter(){
        for(char c=0;c<128;c++){
            if(Character.isLowerCase(c)){
                System.out.println("value:"+ (int)c +";\ncharacter:"+ c);
            }
        }
    }
}

class ForEach {
    ForEach(){
        float f[] = new float[10];
        for(int i=0;i<f.length;i++){
            f[i]=i;
        }
        for(float x : f){
            System.out.println(x);
        }
    }
}

class PrintOneToHundred {
    PrintOneToHundred(){
        int f[] = new int[100];
        for(int x =0;x<f.length;x++){
            System.out.println(x);
            if(x>9)return;
        }
    }
}
