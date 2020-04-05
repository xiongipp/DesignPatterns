package com.xxh.proxy;

import java.util.Random;

public class Clocate implements IShowPic , Runnable {
    private  IShowPic pic;
    private String name;
    @Override
    public void ShowPic(String picName) {
        pic=new CRemoPic();
        this.name=picName;
        System.out.println("准备载入图片："+picName);
        Thread thread=new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        pic.ShowPic(name);
        System.out.println("图片载入完成"+name);
    }
}
