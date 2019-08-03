package com.music;

/**
 * Music 开始演奏
 * **/
public class Music {
    public static void tune(Instrument i){//tune接收Instrument类型参数
        // 同一使用基类，忘记对象类型可以减少迷惑，减少对导出类的考虑
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);//这里却接收Wind类型参数
    }
}
