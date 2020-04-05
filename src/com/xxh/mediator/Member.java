package com.xxh.mediator;

public abstract class Member {
    String name;
    AbstratChartroom chatroom;

    Member(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstratChartroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstratChartroom chatroom) {
        this.chatroom = chatroom;
    }
    public abstract void sendText(String to,String msg);
    public abstract void sendImage(String to,String img);
    public void receiveText(String from, String newMsg) {
        System.out.println(from+" 给尊敬的你【"+this.name+"】发消息内容是："+newMsg);
    }
    public void receiveImage(String from,String image){
        System.out.println(from+" 给尊敬的你【"+this.name+"】发图片是："+image);
    }
}
