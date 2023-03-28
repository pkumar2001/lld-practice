package com.pawan.designpattern.creational.abstractfactorypattern;

import com.pawan.designpattern.creational.abstractfactorypattern.factories.FurnitureFactory;
import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;

public class Main {
    public static void main(String[] args){

        FurnitureFactory furnitureFactory = FactoryProducer.getFurnitureFactory("premium");

        Furniture furniture = furnitureFactory.getFurniture("chair");
        furniture.whoAmI();

    }
}
