package com.guc.pattern.pattern.observer;

/**
 * @Author guc
 * @Date 2019/6/21 10:50
 * @Description TODO
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }
    @Override
    public void update(Observable observable, Object arg) {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( observable.getState() ) );
    }
}
