package com.genericity;

/**
 * 下推堆栈
 * **/
public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item = null;
            next = null;
        }
        Node(U item, Node<U> next){
            this.item = item;
            this.next = next;
        }
        boolean end(){
            return item == null && next == null;
        }
    }


    //top 末端哨兵
    private Node<T> top = new Node<T>();

    //pop
    public T pop(){
        T result = top.item;
        if(!top.end())
            top = top.next;
        return top.item;
    }

    //push
    public void push(T item){
        top = new Node<T>(item, top);
    }


    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s :"Hello World".split(" ")){
            lss.push(s);
        }

        String s;
        while((s = lss.pop()) != null){
            System.out.println(s);
        }
    }

}
