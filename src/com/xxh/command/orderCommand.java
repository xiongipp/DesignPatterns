package com.xxh.command;

public class orderCommand implements Command{
    Operator operator;
    Order order;
    //参数，执行者，目标
    public  orderCommand(Operator operator,Order order){
        this.operator=operator;
        this.order=order;
    }
    @Override
    public void execute() {
        System.out.println(order.getID()+"号顾客的成品");
        operator.MakeFruit(order);
    }
}
