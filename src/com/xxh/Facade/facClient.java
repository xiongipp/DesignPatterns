package com.xxh.Facade;

public class facClient {
    public static void main(String[] args) {
        //简洁 yes
        GeneralFacade gsf = new GeneralFacade();
        gsf.off();
        System.out.println("===========================");
        gsf.off();
    }
}
