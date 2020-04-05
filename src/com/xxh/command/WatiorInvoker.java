package com.xxh.command;

import java.util.ArrayList;

public class WatiorInvoker {
    private ArrayList<Command>commands=null;
    public  WatiorInvoker(){
        commands=new ArrayList<>();
    }
    public  void addCommands(Command command){
        commands.add(command);
    }
    public  void OrderUp(){
        System.out.println("订单来了");
        for (Command cmd:commands){
            if (cmd!=null){
                cmd.execute();
            }
        }
    }
}
