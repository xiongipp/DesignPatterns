package com.xxh.command;

public class Operator {
    public void MakeFruit(Order order) {
        String str="";
        for (String key:order.getFriutmap().keySet()){
            str+=key+order.getFriutmap().get(key);
        }
        System.out.println("混合:"+str);
    }
}
