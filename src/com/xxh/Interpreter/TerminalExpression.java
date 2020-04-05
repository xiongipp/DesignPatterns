package com.xxh.Interpreter;

public class TerminalExpression implements Expression {
    private String data;
    TerminalExpression(String da){
        this.data=da;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
