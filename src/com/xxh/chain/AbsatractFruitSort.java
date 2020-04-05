package com.xxh.chain;

import java.util.ArrayList;
import java.util.List;

abstract public class AbsatractFruitSort {
    int weight;
    List<String> fruitBox;
    AbsatractFruitSort nextFruitSort;

    public AbsatractFruitSort(int w) {
        this.weight = w;
        fruitBox = new ArrayList<String>();
    }

    public void getFruitBox() {
        System.out.println("weight:" + weight);
        System.out.println("个数:" + fruitBox.size());
        for (String t : fruitBox) {
            System.out.println(t + ",");
        }
        System.out.println(" ");
    }

    public void setNextSort(AbsatractFruitSort nextFruitSort) {
        this.nextFruitSort = nextFruitSort;
    }

    public void sendFruit(int weight, String fruit) {
        if (this.weight <= weight) {
            pushBox(fruit);
        } else {
            if (nextFruitSort != null) {
                nextFruitSort.sendFruit(weight, fruit);
            }
        }
    }

    protected abstract void pushBox(String fruit);
}
