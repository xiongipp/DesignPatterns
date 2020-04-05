package com.xxh.chain;

public class SmallFruitSort extends AbsatractFruitSort {
    public SmallFruitSort(int w) {
        super(w);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("果汁："+fruit);
    }
}
