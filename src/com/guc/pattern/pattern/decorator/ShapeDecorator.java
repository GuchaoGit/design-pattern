package com.guc.pattern.pattern.decorator;

import com.guc.pattern.inface.IShape;

/**
 * @Author guc
 * @Date 2019/5/20 15:17
 * @Description 装饰者模式
 */
public abstract class ShapeDecorator implements IShape {
    protected IShape decoratedShape;

    public ShapeDecorator(IShape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
