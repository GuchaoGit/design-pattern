package com.guc.pattern.entity;

import com.guc.pattern.inface.IShape;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
