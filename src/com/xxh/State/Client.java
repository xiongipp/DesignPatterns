package com.xxh.State;

public class Client {
    public static void main(String[] args) {
        ThreadContext tc=new ThreadContext();
        tc.start();
        tc.getcpu();
        tc.suspend();
    }
}
