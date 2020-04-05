package com.xxh.Builder;

public abstract class AMealBuilder {
    Meal meal;
    AMealBuilder(){
        meal=new Meal();
    }
    public abstract void buildFood();
    public  abstract void buildDrink();
    public Meal getMeal(){
        return  meal;
    }
}
