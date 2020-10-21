package com.initialization;

class Test2 {
    String s1;
    String s2 = "s2";
    String s3;
    Test2(){
        s3 = "s3";
    }
}

public class ConstructorTest2 {
    public static void main(String[] args) {
//        Test2 test2 = new Test2();
//        System.out.println(test2.s1);
//        System.out.println(test2.s2);
//        System.out.println(test2.s3);
        new ConstructorTest2(){
            @Override
            public PageUrl getPageUrl(int page) {
                return new PageUrl("over pageUrl");//You can return other pageUrl
            }
        };
    }

    public ConstructorTest2(){
        PageUrl pageUrl = getPageUrl(0);
        System.out.println("pageUrl: "+pageUrl);
    }

    // 有时候返回一个类的方法不一定写在这个类里面
    public PageUrl getPageUrl(int page){
        return null;
    }
}

class PageUrl{
    String str;
    public PageUrl(String str){
        this.str = str;
        System.out.println("Initial");
    }

    @Override
    public String toString() {
        return this.str;
    }
}
