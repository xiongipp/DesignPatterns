package com.xxh.template;

public class Client {
    public static void main(String[] args) {
        ADefiniteIntegral[]x=new ADefiniteIntegral[2];
        x[0]=new DefiniteIntegralLn(2.17,20,100);
        x[1]=new DefiniteIntegralXX(0,56,100);
        System.out.println(x[0].CalDefiniteIntegral());
        System.out.println(x[1].CalDefiniteIntegral());
    }
}
