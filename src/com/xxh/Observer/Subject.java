package com.xxh.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{
    List<Observer>observers;
    Subject(){
        observers=new ArrayList<>();
    }
    public void add(Observer observer){
        observers.add(observer);
    }
    public void Remove(Observer observer){
        observers.remove(observer);
    }
    public abstract void  notifyObservers();
}
