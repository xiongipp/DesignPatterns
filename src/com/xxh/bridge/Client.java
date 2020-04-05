package com.xxh.bridge;

public class Client {
    public static void main(String[] args) {
        Color color=new Blue();
        Pen pen=new MidPen();
        pen.setColorColor(color);
        pen.draw("一个奥特曼");
    }
}
