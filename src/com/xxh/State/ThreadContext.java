package com.xxh.State;

public class ThreadContext {

    private ThreadState state;
    ThreadContext(){
        state=new newState();
    }
    public void setThreadState(ThreadState threadState) {
        this.state=threadState;
    }
    public ThreadState getState(){
        return  this.state;
    }

    public void start(){
        ((newState)state).start(this);
    }
    public void getcpu(){
        ((RunnableState)state).getCpu(this);
    }
    public void suspend(){
        ((RunningState)state).suspend(this);
    }
    public void stop(){
        ((RunningState)state).stop(this);
    }
}
