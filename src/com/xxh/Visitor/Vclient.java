package com.xxh.Visitor;

public class Vclient {
    public static void main(String[] args) {
        Iproduct b1 = new Book();
        Iproduct b2 = new Book();
        Iproduct a1 = new Apple();
        Iproduct a2 = new Apple();

        BuyBasket buyBasket = new BuyBasket();
        buyBasket.add(b1);
        buyBasket.add(b2);
        buyBasket.add(a1);
        buyBasket.add(a2);

        AVisitor visitor = new Costumer();
        visitor.setName("顾客张三");
        buyBasket.accept(visitor);
    }
}
