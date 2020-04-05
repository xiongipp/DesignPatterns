package com.xxh.Visitor;

public class Book implements Iproduct {
    @Override
    public void accept(AVisitor visitor) {
        visitor.visit(this);
    }
}
