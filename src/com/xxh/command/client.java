package com.xxh.command;

public class client {
    public static void main(String[] args) {
        //创建订单
        Order order1 = new Order();
        order1.setID(1);
        order1.setFriutmap("Apple",1);
        order1.setFriutmap("banana",2);
        order1.setFriutmap("orange",3);

        Order order2 = new Order();
        order2.setID(2);
        order2.setFriutmap("peache",3);
        order2.setFriutmap("tomato",5);
        order2.setFriutmap("potato",1);
        //创建操作者
        Operator op=new Operator();
        //将订单封装成命令对象
        orderCommand cmd=new orderCommand(op,order1);
        orderCommand cmd2=new orderCommand(op,order2);
        //创建调用者，添加命令
        WatiorInvoker waitor=new WatiorInvoker();
        waitor.addCommands(cmd);
        waitor.addCommands(cmd2);
        //执行
        waitor.OrderUp();

    }
}
