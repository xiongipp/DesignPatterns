package com.xxh.Builder;

public class Bclient {
    public static void main(String[] args) {
        AMealBuilder mb1 = new aSubMealBuilder();
        AMealBuilder mb2 = new bSubMealBuilder();
        Waitor waitor = new Waitor();
        Waitor waitor2 = new Waitor();
        waitor.setBuilder(mb1);
        Meal meal1 = waitor.Consrtact();

        waitor2.setBuilder(mb2);
        Meal meal2 = waitor2.Consrtact();
        System.out.println(meal1.toString());
        System.out.println(meal2.toString());
    }
}
