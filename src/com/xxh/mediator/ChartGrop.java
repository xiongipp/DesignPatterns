package com.xxh.mediator;

import java.util.Hashtable;

public class ChartGrop extends AbstratChartroom{
    private Hashtable members=new Hashtable();
    @Override
    public void register(Member member) {
        if(!members.contains(member)){
            members.put(member.getName(),member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from, String to,String msg) {
        //把要发的的人取出来。
       Member member= (Member)members.get(to);
       String newMsg=msg;
       newMsg=msg.replaceAll("sb","**");
       member.receiveText(from,newMsg);
    }

    @Override
    public void sendImage(String from, String to,String img) {
        Member member=(Member) members.get(to);
        if(img.length()>4){
            System.out.println("发送"+img+"失败，太大了");
        }else {
            member.receiveImage(from,img);
        }
    }
}
