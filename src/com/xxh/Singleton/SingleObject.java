package com.xxh.Singleton;


public class SingleObject {
//懒汉，按需加载
//    private static SingleObject instance;
//    private SingleObject(){
//
//    }
//    public static SingleObject getInstance(){
//        if(instance==null){
//            instance=new SingleObject();
//        }
//        return instance;
//    }

//恶汉,一启动自动加载完成
    private static SingleObject singleinstance=new SingleObject();
    private static SingleObject get(){
        return  singleinstance;
    }


}
