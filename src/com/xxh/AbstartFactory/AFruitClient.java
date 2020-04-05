package com.xxh.AbstartFactory;

public class AFruitClient {
    public static void main(String[] args) {
        SFactory sFactory = new SFactory();
        BFactory bFactory = new BFactory();
//        Fruit fruit = sFactory.createFruit();
        Fruit fruit = bFactory.createFruit();
        fruit.eat();
    }
}
