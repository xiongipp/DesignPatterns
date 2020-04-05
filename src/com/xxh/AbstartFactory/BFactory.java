package com.xxh.AbstartFactory;

public class BFactory extends AFruitFactory {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }
}
