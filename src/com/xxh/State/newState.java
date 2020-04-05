package com.xxh.State;

public class newState extends ThreadState {
    newState(){
        state=StateSet.NEW;
        System.out.println("新建线程");
    }

    public void start(ThreadContext tc){
        System.out.println("start方法");
        if(state==StateSet.NEW){
            tc.setThreadState(new RunnableState());
        }else {
            System.out.println("当前不是新建状态");
        }
    }
}
