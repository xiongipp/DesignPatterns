package com.xxh.Observer2;

import java.util.ArrayList;
import java.util.List;

public class buyHolder implements IStockHolder{
    private List<AStockPrice>attionList;
    private String name;
    buyHolder(String name){
        attionList=new ArrayList<>();
        this.name=name;
    }
    @Override
    public void update(AStockPrice asp) {
        if(attionList.contains(asp)){
            System.out.println(name);
            if(asp.getPrice1()-asp.getPrice2()>0){
                System.out.println("nice");
            }else {
                System.out.println("bad");
            }
       }
    }

    @Override
    public void addHolder(AStockPrice asp) {
        attionList.add(asp);
        asp.Add(this);
    }
}
