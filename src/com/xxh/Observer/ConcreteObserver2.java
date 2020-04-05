package com.xxh.Observer;

public class ConcreteObserver2 implements Observer {

    @Override
    public void response() {
        System.out.println("target chaged ,2 reacted");
    }
}
