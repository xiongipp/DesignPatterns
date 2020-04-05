package com.xxh.Builder;

public class aSubMealBuilder extends AMealBuilder{

    @Override
    public void buildFood() {
        meal.setFood("鸡腿堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("果汁");
    }
}
