package com.xxh.Strategy;

public class Chef {
    private ICutFruit cutmethod;
    public void setCutStrategy(ICutFruit cutStrategy){
        this.cutmethod=cutStrategy;
    }
    public void makeFruit(String name){
        this.cutmethod.CutStrategy(name);
    }
}
