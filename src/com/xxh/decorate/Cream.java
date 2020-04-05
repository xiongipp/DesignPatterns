package com.xxh.decorate;

public class Cream extends Decorate {

    Cream(IBirthdatCake iBirthdatCake) {
        super(iBirthdatCake);
    }
    public  void putCream(){
        System.out.println("奶油被加了");
    }
}

