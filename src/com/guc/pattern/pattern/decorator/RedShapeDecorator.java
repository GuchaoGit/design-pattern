package com.guc.pattern.pattern.decorator;

import com.guc.pattern.inface.IShape;

/**
 * @Author guc
 * @Date 2019/5/20 15:19
 * @Description 为形状添加颜色装饰
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(IShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(IShape decoratedShape) {
        System.out.println("Border Color:Red");
    }
}
