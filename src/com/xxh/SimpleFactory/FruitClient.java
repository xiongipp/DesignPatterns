package com.xxh.SimpleFactory;

public class FruitClient {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.makeFruit("apple");
        apple.eat();
        Fruit banana = fruitFactory.makeFruit("banana");
        banana.eat();
    }
}
