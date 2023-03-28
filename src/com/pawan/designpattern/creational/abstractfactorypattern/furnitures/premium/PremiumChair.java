package com.pawan.designpattern.creational.abstractfactorypattern.furnitures.premium;

import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;

public class PremiumChair implements Furniture {
    @Override
    public void whoAmI() {
        System.out.println("I am a premium chair");
    }
}
