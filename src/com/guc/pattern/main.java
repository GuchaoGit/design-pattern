package com.guc.pattern;

import com.guc.pattern.entity.Product;
import com.guc.pattern.inface.IShape;
import com.guc.pattern.pattern.*;

public class main {

    public static void main(String[] args) {
        System.out.println("this is start");

        System.out.println("工厂模式示例：");
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        System.out.println("");
        System.out.println("单例模式示例：");
        SingletonObject.getInstance().showMessage();
        SingletonObject3.getInstance().showMessage();
        SingletonObject2.getInstance().showMessage();

        System.out.println("");
        System.out.println("建造者模式示例：");
        Product apple = new ProductBuilder().setName("苹果").setCategory("水果").setPrice(9.98f).build();
        System.out.println(apple.toString());

    }

}
