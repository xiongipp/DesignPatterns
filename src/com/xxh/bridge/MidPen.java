package com.xxh.bridge;

public class MidPen extends Pen {
    @Override
    public void draw(String name) {
        String penType="中号毛笔";
        this.color.bepaint(penType,name);
    }
}
