package com.xxh.AbstartFactory;

public class Apple extends Fruit {
    Apple(){
        this.name="apple";
    }
    @Override
    public void eat() {
        System.out.println("i eat like an apple");
    }
}
