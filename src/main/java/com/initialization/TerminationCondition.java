package com.initialization;

class Book {
    private boolean login = false;
    Book(boolean login){
        this.login = login;
    }

    void login(){
        this.login = true;
    }

    void logout(){
        this.login = false;
    }

    protected void finalize(){
        if(this.login)
            System.out.println("Error: still login in");
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book book = new Book(true); // book变量还在内存中
//        book.logout();

        new Book(true); // 只有这个被回收了
        // Force garbage collection & finalization:
        System.gc();
    }
}
