package com.xxh.State;

public class BlockedState extends ThreadState {
    BlockedState(){
        state=StateSet.BLOCKED;
        System.out.println("blocked state");
    }
    public void resume(ThreadContext tc){
        if(state==StateSet.BLOCKED){
            tc.setThreadState(new RunnableState());
        }else {
            System.out.println("不是阻塞状态");
        }
    }
}
