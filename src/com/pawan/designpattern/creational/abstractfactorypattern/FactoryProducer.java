package com.pawan.designpattern.creational.abstractfactorypattern;

import com.pawan.designpattern.creational.abstractfactorypattern.factories.FurnitureFactory;
import com.pawan.designpattern.creational.abstractfactorypattern.factories.NormalFurnitureFactory;
import com.pawan.designpattern.creational.abstractfactorypattern.factories.PremiumFurnitureFactory;

public class FactoryProducer {
    public static FurnitureFactory getFurnitureFactory(String type){
        switch (type){
            case "normal": return new NormalFurnitureFactory();
            case "premium": return new PremiumFurnitureFactory();
        }
        return new NormalFurnitureFactory();
    }
}
