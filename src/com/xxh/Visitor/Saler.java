package com.xxh.Visitor;

public class Saler extends AVisitor {
    Saler(){
        this.name="收银员";
    }
    @Override
    public void visit(Apple apple) {
        System.out.println(name+"给苹果打价码");
    }

    @Override
    public void visit(Book apple) {
        System.out.println(name+"给书打价码");
    }
}
