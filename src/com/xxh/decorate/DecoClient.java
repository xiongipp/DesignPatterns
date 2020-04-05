package com.xxh.decorate;

public class DecoClient {
    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake.Show());;
        Cream cream = new Cream(cake);
        cream.putCream();
        cream.Show();
        Fruit fruit = new Fruit(cream);
        fruit.Show();
    }
}
