package com.pawan.designpattern.structural.decoratorpattern.decorator;

import com.pawan.designpattern.structural.decoratorpattern.pizza.BasePizza;

public class ExtraCheeseDecorator extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+25;
    }
}
