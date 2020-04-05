package com.xxh.Facade;

public class GeneralFacade {
    private TV tv;
    private Light light;
    private Air air;
    GeneralFacade(){
        this.tv=new TV();
        light=new Light();
        air=new Air();

    }
    public void on(){
        air.on();
        light.on();
        tv.on();
    }
    public void  off(){
        air.off();
        tv.off();
        light.off();
    }
}
