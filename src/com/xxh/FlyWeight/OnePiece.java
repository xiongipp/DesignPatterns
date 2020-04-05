package com.xxh.FlyWeight;

public class OnePiece extends Apiece {

    public OnePiece(String inkind) {
        super(inkind);
    }
    @Override
    public void play(int x, int y) {
        System.out.println("把"+inkind+"放在X:"+x+",Y:"+y);
    }
}
