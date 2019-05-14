package com.guc.pattern.entity;

import com.guc.pattern.inface.IShape;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
