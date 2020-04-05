package com.xxh.State;

public class RunnableState extends ThreadState {

    RunnableState(){
        state=StateSet.RUNNABLE;
        System.out.println("就序状态");
    }
    public  void getCpu(ThreadContext tc){
        System.out.println("get cpu time");
        if(state==StateSet.RUNNABLE){
            tc.setThreadState(new RunningState());
        }else {
            System.out.println("当前不是就序状态");
        }
    }
}
