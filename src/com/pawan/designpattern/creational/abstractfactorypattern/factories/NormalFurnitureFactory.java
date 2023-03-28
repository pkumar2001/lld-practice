package com.pawan.designpattern.creational.abstractfactorypattern.factories;

import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;
import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.normal.NormalChair;
import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.normal.NormalSofa;

public class NormalFurnitureFactory extends FurnitureFactory{
    @Override
    public Furniture getFurniture(String item) {
        switch (item){
            case "chair": return new NormalChair();
            case "sofa": return new NormalSofa();
        }
        return null;
    }
}
