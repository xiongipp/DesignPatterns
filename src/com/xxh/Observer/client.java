package com.xxh.Observer;

public class client {

    public static void main(String[] args) {
        Subject subject=new ConsernSubjectB();
        Observer observer1=new ConcreteObserver1();
        Observer observer2=new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObservers();
    }
}
