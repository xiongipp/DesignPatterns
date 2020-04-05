package com.xxh.bridge;

public class Blue implements Color {
    @Override
    public void bepaint(String type, String name) {
        System.out.println("笔的类型："+type+",我是蓝色帮你画："+name);
    }
}
