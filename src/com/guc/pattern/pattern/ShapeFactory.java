package com.guc.pattern.pattern;

import com.guc.pattern.entity.Circle;
import com.guc.pattern.entity.Rectangle;
import com.guc.pattern.entity.Square;
import com.guc.pattern.inface.IShape;

/**
 * 工厂模式
 */
public class ShapeFactory {
    public IShape getShape(String shapeType){
        if (shapeType == null){
            System.out.println("wrong shape type");
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
