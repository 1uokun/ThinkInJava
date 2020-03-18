package com.delegation;

/**
 * Delegation代理模式
 *
 * 对于OOP继承，往往所有方法都会暴露给子类，
 * 因为private关键字是不可修改的，
 * 所以在不知道应不应该暴露给子类时，可以利用Delegation代理类实现
 * **/

class SpaceShipControls {
    void up(int velocity){
        System.out.println("up to "+velocity);
    }
    void down(int velocity){
        System.out.println("down to "+velocity);
    }
    void left(int velocity){}
    void right(int velocity){}
}

class SpaceShipDelegation {
    /**
     * 先拿到Controls的所有方法
     *
     * idea自动生成delegation method方法：【 ⌘N 】
     * 右键 new SpaceShipControls() -> generate -> Delegate Methods
     * **/
    private SpaceShipControls controls = new SpaceShipControls();

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }
}

public class SpaceShip extends SpaceShipDelegation{
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        int velocity = 1;
        spaceShip.down(velocity);
        // spaceShip.left(velocity); // Cannot resolve method `left`
    }
}


