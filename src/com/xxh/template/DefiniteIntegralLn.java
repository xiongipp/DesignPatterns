package com.xxh.template;

public class DefiniteIntegralLn extends  ADefiniteIntegral{

    private double a,b;
    private int c;
    DefiniteIntegralLn(double a,double b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double geta() {
        return a;
    }

    public double getb() {
        return b;
    }

    public int getc() {
        return c;
    }

    @Override
    double function(double x) {
        return Math.log(x);
    }

}
