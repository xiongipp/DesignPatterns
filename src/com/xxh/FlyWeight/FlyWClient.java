package com.xxh.FlyWeight;

import java.util.Random;


/*
* 优点：大大减少对象创建，减低内存占用，提高效率
* 缺点：提高系统复杂度，需要分离出内部状态和外部状态，外部状态固有特性不随内部状态变化而变化
* */
public class FlyWClient {
    public static void main(String[] args) {
        PieceFactory pf=new PieceFactory();
        Random rm=new Random();
        for(int i=0;i<19 ;i++){
            for ( int j=0;j<19;j++){
                Apiece p;
                if(rm.nextInt()%2==0){
                    p=pf.getPiece("白");
                }else {
                    p=pf.getPiece("黑");
                }
                p.play(rm.nextInt(19),rm.nextInt(19));
            }
        }
        int count = pf.GetPieceCount();
        System.out.println("缓存池的大小："+count);
    }
}
