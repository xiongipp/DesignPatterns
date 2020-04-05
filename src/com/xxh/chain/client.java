package com.xxh.chain;

import java.util.Random;

public class client {


    public static void main(String[] args) {
        AbsatractFruitSort bf,mf,sf;
        bf=new BigFruitSort(9);
        mf= new MidFruitSort(5);
        sf=new SmallFruitSort(2);

        bf.setNextSort(mf);
        mf.setNextSort(sf);

        Random random=new Random();
        for (int i=0;i<100; i++){
            int weight=random.nextInt(10);
            bf.sendFruit(weight,"橙子");
        }
        bf.getFruitBox();
        sf.getFruitBox();
        mf.getFruitBox();
    }
}
