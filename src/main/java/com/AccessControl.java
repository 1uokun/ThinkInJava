//权限控制
package com;

class Access {
    private String name;
    protected void set(String nm){name = nm;};
    Access(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

class AccessC extends Access{
    AccessC(String name){
        super(name);
        set(name);
    }
    public String toString(){
        return "123";
    }
}

public class AccessControl {
    public static void main(String[] args) {
        AccessC accessC = new AccessC("Niko");
        accessC.set("Bellic");
        System.out.println(accessC.toString());
    }
}


