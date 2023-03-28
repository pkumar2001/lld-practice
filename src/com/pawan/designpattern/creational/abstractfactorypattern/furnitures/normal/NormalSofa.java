package com.pawan.designpattern.creational.abstractfactorypattern.furnitures.normal;

import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;

public class NormalSofa implements Furniture {
    @Override
    public void whoAmI() {
        System.out.println("I am a normal Sofa");
    }
}
