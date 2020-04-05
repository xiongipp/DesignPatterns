package com.xxh.combination;

/*
* 优点：清楚的定义分层次的复杂对象，新增构建容易
* 缺点：设计抽象，业务逻辑复杂，不是随意方法都与叶子对象子类有关联，
* 增减新构件出现一些问题
* */
public class ComClient {
    public static void main(String[] args) {
        MyElement o1,o2,o3,o4,o5;
        Plate p1,p2,p3;
        o1=new Apple();
        o2=new Banana();
        o3=new Banana();
        o4=new Banana();
        o5=new Apple();
        p1=new Plate();
        p2=new Plate();
        p3=new Plate();

        p1.add(o1);
        p1.add(o2);
        p1.add(o3);
        p2.add(p1);
        p2.add(o4);
        p3.add(p2);
        p3.add(o5);

        p3.eat();
    }
}
