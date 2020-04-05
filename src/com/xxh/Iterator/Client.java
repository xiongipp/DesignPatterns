package com.xxh.Iterator;

public class Client {

    public static  void display(Television tv){
        TVIterator i=tv.createIterator();
        while (!i.isLast()){
            System.out.println(i.currentChannel());
            i.next();
        }
    }
}
