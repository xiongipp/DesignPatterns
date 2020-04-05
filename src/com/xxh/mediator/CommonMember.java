package com.xxh.mediator;

public class CommonMember extends Member {

    CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String msg) {
        System.out.println("这是普通会员的消息");
        chatroom.sendText(name,to,msg);
    }

    @Override
    public void sendImage(String to, String img) {
        System.out.println("开通高级会员专享图片发送");
    }
}
