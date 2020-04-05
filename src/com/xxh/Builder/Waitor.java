package com.xxh.Builder;

public class Waitor  {
    private AMealBuilder mb;
    public  void setBuilder(AMealBuilder mb){
        this.mb=mb;
    }
    public Meal Consrtact(){
        mb.buildDrink();
        mb.buildFood();
        return mb.getMeal();
    }
}
