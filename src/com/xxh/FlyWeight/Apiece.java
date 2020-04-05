package com.xxh.FlyWeight;

public  abstract class Apiece {
    protected String inkind;
    public Apiece(String inkind){
        this.inkind=inkind;
    }
    //落子位置
    public abstract void play(int x,int y);


}
