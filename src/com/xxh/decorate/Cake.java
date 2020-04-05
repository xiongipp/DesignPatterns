package com.xxh.decorate;

public class Cake  implements IBirthdatCake{
    Cake(){
        System.out.println("蛋糕坯被创建了");
    }
    @Override
    public String Show() {
        System.out.println("蛋糕坯");
        return "蛋糕坯";
    }
}
