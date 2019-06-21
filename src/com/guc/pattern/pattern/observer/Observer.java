package com.guc.pattern.pattern.observer;


/**
 * @Author guc
 * @Date 2019/6/21 10:44
 * @Description 观察者接口
 */
public abstract class Observer {
    protected Observable observable;
    public abstract void update(Observable observable,Object arg);
}
