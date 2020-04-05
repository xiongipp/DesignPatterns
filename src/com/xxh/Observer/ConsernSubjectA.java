package com.xxh.Observer;

public class ConsernSubjectA extends Subject {
    @Override
    public void notifyObservers() {
        System.out.println("a chaged");
        for (Observer o:observers){
            o.response();
        }
    }
}
