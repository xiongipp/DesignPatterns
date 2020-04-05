package com.xxh.Strategy;

public class client {
    public static void main(String[] args) {
        Chef chef = new Chef();
        HoriBlade horiBlade = new HoriBlade();
        MultiBlade multiBlade = new MultiBlade();
        chef.setCutStrategy(horiBlade);
        chef.makeFruit("苹果");

        chef.setCutStrategy(multiBlade);
        chef.makeFruit("香蕉");
    }
}
