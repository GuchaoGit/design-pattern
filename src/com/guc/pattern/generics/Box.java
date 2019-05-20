package com.guc.pattern.generics;

/**
 * @Author guc
 * @Date 2019/5/20 10:48
 * @Description 泛型类
 */
public class Box <T>{
    private T t;

    public Box(T t){
        this.t =t;
    }

    public void add(T t){
        this.t =t;
    }
    public T get(){
        return t;
    }
}
