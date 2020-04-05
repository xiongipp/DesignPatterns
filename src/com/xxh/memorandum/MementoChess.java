package com.xxh.memorandum;


public class MementoChess {
    String lable;
    int x,y;

    public MementoChess(String lable, int x, int y) {
        this.lable = lable;
        this.x = x;
        this.y = y;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
