package com.xxh.Visitor;

public class Costumer extends AVisitor {
    Costumer(){
        this.name="顾客";
    }
    @Override
    public void visit(Apple apple) {
        System.out.println(name+"称苹果");
    }

    @Override
    public void visit(Book apple) {
        System.out.println(name+"看书");
    }
}
