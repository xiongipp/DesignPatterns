package com.xxh.Prototype;

public  abstract class MyFruit implements Cloneable{
    protected String kind;
    public Object clone(){
        Object obj=null;
        try {
            obj=super.clone();
            return obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void show(){
        System.out.println("我是："+kind);
    }
}
