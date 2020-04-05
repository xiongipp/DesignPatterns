package com.xxh.Observer;

public class ConsernSubjectB extends Subject {
    @Override
    public void notifyObservers() {
        System.out.println("b chaged");
        for (Observer o:observers){
            o.response();
        }
    }
}
