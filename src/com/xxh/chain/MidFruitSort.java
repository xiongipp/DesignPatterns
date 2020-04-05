package com.xxh.chain;

public class MidFruitSort extends AbsatractFruitSort {
    public MidFruitSort(int w) {
        super(w);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("水果罐头："+fruit);
    }
}
