package com.pawan.designpattern.creational.abstractfactorypattern.furnitures.premium;

import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;

public class PremiumSofa implements Furniture {
    @Override
    public void whoAmI() {
        System.out.println("I am a premium sofa");
    }
}
