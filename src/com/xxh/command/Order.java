package com.xxh.command;

import java.util.HashMap;

public class Order {
    private  int ID;
    private HashMap<String ,Integer>friutmap;
    Order(){
        friutmap=new HashMap<>();
    }
    public int getID(){
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public HashMap<String, Integer> getFriutmap() {
        return friutmap;
    }

    public void setFriutmap(String fruitkind,int number) {
        this.friutmap.put(fruitkind,number);
    }
}
