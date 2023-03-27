package com.pawan.designpattern.structural.decoratorpattern.decorator;

import com.pawan.designpattern.structural.decoratorpattern.pizza.BasePizza;

public class MushroomDecorator extends ToppingDecorator{

    BasePizza basePizza;

    public MushroomDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
