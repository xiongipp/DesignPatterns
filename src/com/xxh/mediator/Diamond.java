package com.xxh.mediator;

public class Diamond extends Member {
    Diamond(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String msg) {
        System.out.println("这是高级会员的消息");
        chatroom.sendText(name,to,msg);
    }

    @Override
    public void sendImage(String to, String img) {
        System.out.println("这是高级会员的图片");
        chatroom.sendImage(name,to,img);
    }
}
