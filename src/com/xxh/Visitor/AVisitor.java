package com.xxh.Visitor;

//抽象访问者
public abstract class AVisitor {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  abstract void visit(Apple apple);
    public  abstract void visit(Book apple);
}
