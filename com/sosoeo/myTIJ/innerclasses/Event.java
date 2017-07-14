package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-7-13.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    public void start(){// allow restart time
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
