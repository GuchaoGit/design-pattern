package com.guc.pattern.entity;

import com.guc.pattern.inface.IShape;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
