package com.xxh.mediator;

public class myClient {
    public static void main(String[] args) {
        Member member1,member2,member3;
        member1 = new Diamond("王老五");
        member2=new CommonMember("苦主");
        member3=new CommonMember("女主");

        AbstratChartroom chartroom=new ChartGrop();
        chartroom.register(member1);
        chartroom.register(member2);
        chartroom.register(member3);

        member1.sendText("女主","今晚继续，小sb");
        member1.sendImage("女主","色图1");
        member1.sendImage("女主","色图2");
        member1.sendText("女主","别忘了这些，嘿嘿");
        member3.sendText("王老五",".....，别太过分");
        member2.sendText("女主","今晚一起吃饭，给你生日礼物，快来哦");

    }
}
