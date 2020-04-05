package com.xxh.memorandum;

import java.util.ArrayList;


public class CaretakerChess {
    //备忘录列表
    private ArrayList<MementoChess>memList=new ArrayList<>();

    //添加备忘录对象
    public void addMem(MementoChess mementoChess){
        memList.add(mementoChess);
    }
    public  MementoChess getMem(int i){
        return memList.get(i);
    }

}
