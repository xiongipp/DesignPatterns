package com.xxh.AbstartFactory;

public class SFactory extends AFruitFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
