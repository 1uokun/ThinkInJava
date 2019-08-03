package com.interfaces;

public abstract class StringProcessor implements Processor{
    public String name(){
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);//保证StringProcessor子类要有该方法
    public static String s = "abc";
    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
    }
}

class Upcase extends StringProcessor {
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
