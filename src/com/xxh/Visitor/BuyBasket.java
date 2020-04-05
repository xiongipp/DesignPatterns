package com.xxh.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket  {
    private ArrayList<Iproduct> list=new ArrayList<>();
    public void accept(AVisitor visitor){
        Iterator<Iproduct> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }
    public void add(Iproduct product){
        list.add(product);
    }
    public void remove(Iproduct iproduct){
        list.remove(iproduct);
    }

}
