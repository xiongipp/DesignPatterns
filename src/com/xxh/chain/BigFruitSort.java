package com.xxh.chain;

public class BigFruitSort extends AbsatractFruitSort {
    public BigFruitSort(int w) {
        super(w);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("超市："+fruit);
    }
}
