package com;

public class Delegation extends SpaceShipDelegation {
    Delegation(){
        super("神州五号");
    }

    public static void main(String[] args) {
//        SpaceShipB shipb = new SpaceShipB();
        Delegation shipb = new Delegation();
        shipb.left(10);
        shipb.up(20);
    }
}

//class Delegation {
//    public static void main(String[] args) {
//        SpaceShipB s = new SpaceShipB();
//
//    }
//}

class SpaceShipControls {
    void up(int i){};
    void down(int i){};
    void left(int i){};
    void right(int i){};
}

/**
 * 这里的SpaceShip并非真正的SpaceShipControls类型，
 * 只是包含了它所有的方法（继承暴露所有方法）
 *
 * 如果它只有左右移动的权限，则需要使用代理
 * **/
class SpaceShip extends SpaceShipControls {
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.right(10); //向右移动10
    }
}

class SpaceShipDelegation extends SpaceShipControls{
    private String name;
    private SpaceShipControls controls =
            new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name = name;
    }

    //Delegation methods
    public void left(int i){
        System.out.println(this.name+"move left "+i+"step");
        controls.left(i);
    }

    public void right(int i){
        System.out.println(this.name+"move right "+i+"step");
        controls.right(i);
    }

    public void up(int i){
        System.out.println("can't not do this");
    }
    public void down(int i){
        System.out.println("can't not do this");
    }
}
/*
 * 代理
 * 首先：何为代理？
 * 构建一个类，方法或接口与需要被代理的类保持一致，
 * 这个类便可代理并在方法或接口中添加自定义逻辑
 * **/
