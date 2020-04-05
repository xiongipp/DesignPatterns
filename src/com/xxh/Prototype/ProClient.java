package com.xxh.Prototype;

public class ProClient
{
    public static void main(String[] args) {
//        MyFruit mf1=new Apple();
//        MyFruit mf2= (MyFruit) mf1.clone();
//        System.out.println(mf1==mf2);

        MyFruit apple = new Apple();
        MyFruit banana = new Banana();
        MyFruitStore myFruitStore = new MyFruitStore();
        myFruitStore.Add(1,banana);
        myFruitStore.Add(2,apple);

        MyFruit fruit1 = myFruitStore.getFruit(1);
        fruit1.show();
        MyFruit fruit2 = myFruitStore.getFruit(2);
        fruit2.show();
        System.out.println(fruit1==fruit2);
    }
}
