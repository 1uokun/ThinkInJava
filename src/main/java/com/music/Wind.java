package com.music;

/**
 * Wind 管风琴 乐器（Instrument）的一种
 * **/
public class Wind extends Instrument{
    public void play(Note n){

        System.out.println("Wind.play()" + n);
    }
}
