package com.xxh.AbstartFactory;

public class Banana extends Fruit {
    Banana(){
        this.name="banana";
    }
    @Override
    public void eat() {
        System.out.println("i eat like a banana");
    }
}
