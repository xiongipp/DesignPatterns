package com.xxh.decorate;

public class Decorate implements IBirthdatCake {
    private IBirthdatCake birthdatCake;
    Decorate(IBirthdatCake iBirthdatCake){
        this.birthdatCake=iBirthdatCake;
    }
    @Override
    public String Show() {
        return birthdatCake.Show();
    }
}
