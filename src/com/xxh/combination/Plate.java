package com.xxh.combination;

import java.util.ArrayList;

public class Plate extends MyElement {
    private ArrayList<MyElement> list=new ArrayList<>();
    @Override
    public void eat() {
        for(Object o:list){
            ((MyElement)o).eat();
        }
    }
    public void add(MyElement me){
        list.add(me);
    }
    public  void delete(MyElement me){
        list.remove(me);
    }
}
