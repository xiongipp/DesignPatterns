package com.xxh.Observer2;

public interface IStockHolder {
    public void update(AStockPrice asp);
    public void addHolder(AStockPrice asp);//订阅对象
}
