package com.pawan.designpattern.creational.abstractfactorypattern.furnitures.normal;

import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;

public class NormalChair implements Furniture {
    @Override
    public void whoAmI() {
        System.out.println("I am a normal chair");
    }
}
