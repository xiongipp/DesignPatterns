package com.xxh.Prototype;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable<Integer,MyFruit> fruitHashtable= new Hashtable<>();

    public  void Add(Integer key,MyFruit fruit){
        fruitHashtable.put(key,fruit);
    }
    public  void remove(MyFruit myFruit){
        fruitHashtable.remove(myFruit);
    }
    public MyFruit getFruit(Integer key){
        MyFruit myFruit = fruitHashtable.get(key);
        return (MyFruit) myFruit.clone();
    }
}
