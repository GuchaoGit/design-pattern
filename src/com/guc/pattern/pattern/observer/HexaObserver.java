package com.guc.pattern.pattern.observer;

/**
 * @Author guc
 * @Date 2019/6/21 10:51
 * @Description TODO
 */
public class HexaObserver extends Observer {

    public HexaObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }
    @Override
    public void update(Observable observable, Object arg) {
        System.out.println( "Hex String: "
                + Integer.toHexString( observable.getState() ).toUpperCase() );
    }
}
