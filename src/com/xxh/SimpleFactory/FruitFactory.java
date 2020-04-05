package com.xxh.SimpleFactory;

public class FruitFactory {

    public Fruit makeFruit(String name){
        if(name.equals("apple")){
            return new Apple();
        }
        if(name.equals("banana")){
            return new Banana();
        }
        return null;
    }
}
