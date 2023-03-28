package com.pawan.designpattern.creational.factorypattern;

import com.pawan.designpattern.creational.factorypattern.shapes.Shape;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}
