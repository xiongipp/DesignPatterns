package com.xxh.Visitor;

public class Apple implements Iproduct{
    @Override
    public void accept(AVisitor visitor) {
        visitor.visit(this);
    }
}
