package com.xxh.decorate;

public class Fruit extends Decorate{

    Fruit(IBirthdatCake iBirthdatCake) {
        super(iBirthdatCake);
    }

    public void putFruit(){
        System.out.println("水果被加了");
    }
}
