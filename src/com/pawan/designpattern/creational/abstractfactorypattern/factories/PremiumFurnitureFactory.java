package com.pawan.designpattern.creational.abstractfactorypattern.factories;

import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;
import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.premium.PremiumChair;
import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.premium.PremiumSofa;

public class PremiumFurnitureFactory extends FurnitureFactory{
    @Override
    public Furniture getFurniture(String item) {
        switch (item){
            case "chair": return new  PremiumChair();
            case "sofa": return new PremiumSofa();
        }
        return null;
    }
}
