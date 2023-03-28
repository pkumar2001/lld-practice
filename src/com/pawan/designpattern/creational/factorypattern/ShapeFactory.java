package com.pawan.designpattern.creational.factorypattern;

import com.pawan.designpattern.creational.factorypattern.shapes.Circle;
import com.pawan.designpattern.creational.factorypattern.shapes.Rectangle;
import com.pawan.designpattern.creational.factorypattern.shapes.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        switch (shapeType){
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
        }
        return null;
    }
}
