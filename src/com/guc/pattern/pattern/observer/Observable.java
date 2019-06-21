package com.guc.pattern.pattern.observer;

import java.util.Vector;

/**
 * @Author guc
 * @Date 2019/6/21 10:45
 * @Description TODO
 */
public class Observable {
    private Vector<Observer> observers;
    private int state;
    public Observable(){
        observers = new Vector<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public synchronized void notifyAllObservers(){
        for (Observer observer:observers){
            observer.update(this,null);
        }
    }

}
