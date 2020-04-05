package com.xxh.Observer2;

import java.util.ArrayList;
import java.util.List;

public abstract class AStockPrice {
    protected float price1,price2;
    protected  String code;//code区分对象
    protected List<IStockHolder>stockHolders;
    public void Add(IStockHolder ish){
        stockHolders.add(ish);
    }
    public void Remove(IStockHolder ish){
        stockHolders.remove(ish);
    }
    AStockPrice(String code){
        stockHolders=new ArrayList<>();
        price1=price2=0;
        this.code=code;
    }

    public float getPrice1() {
        return price1;
    }

    public float getPrice2() {
        return price2;
    }

    public void setPrice1(float price1) {
        this.price1 = price1;
        notifyHolder();
    }
    abstract protected void notifyHolder();
}
