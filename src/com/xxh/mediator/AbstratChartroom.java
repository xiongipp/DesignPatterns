package com.xxh.mediator;

public abstract class AbstratChartroom {
    public abstract  void register(Member member);
    public abstract  void sendText(String from,String to,String msg);
    public abstract  void sendImage(String from,String to,String msg);
}
