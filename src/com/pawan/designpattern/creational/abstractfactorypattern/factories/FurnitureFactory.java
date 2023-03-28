package com.pawan.designpattern.creational.abstractfactorypattern.factories;

import com.pawan.designpattern.creational.abstractfactorypattern.furnitures.Furniture;

public abstract class FurnitureFactory {
    public abstract Furniture getFurniture(String item);
}
