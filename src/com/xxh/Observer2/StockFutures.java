package com.xxh.Observer2;

public class StockFutures extends AStockPrice {
    StockFutures(String code){
        super(code);
    }
    @Override
    protected void notifyHolder() {
        for (IStockHolder holder:stockHolders){
            holder.update(this);
        }
    }

}
