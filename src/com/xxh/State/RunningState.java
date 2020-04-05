package com.xxh.State;

public class RunningState extends ThreadState {
    RunningState(){
        state=StateSet.RUNNING;
        System.out.println("running 状态");
    }

    public void suspend(ThreadContext tc){
        if(state==StateSet.RUNNING){
            tc.setThreadState(new BlockedState());
        }else {
            System.out.println("当前不是running状态");
        }
    }
    public void stop(ThreadContext tc){
        if(state==StateSet.RUNNING){
            tc.setThreadState(new DeadState());
        }else {
            System.out.println("当前不是running状态");
        }
    }
}
