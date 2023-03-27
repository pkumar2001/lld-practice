package com.pawan.designpattern.structural.decoratorpattern;

import com.pawan.designpattern.structural.decoratorpattern.decorator.ExtraCheeseDecorator;
import com.pawan.designpattern.structural.decoratorpattern.decorator.MushroomDecorator;
import com.pawan.designpattern.structural.decoratorpattern.pizza.BasePizza;
import com.pawan.designpattern.structural.decoratorpattern.pizza.MargeritaPizza;

public class Main {
    public static void main(String[] args){
        BasePizza basePizza = new MargeritaPizza();

        //decorate with extra-cheese
        BasePizza extraCheesePizza = new ExtraCheeseDecorator(basePizza);

        //decorate with mushroom
        BasePizza mushroomPizza = new MushroomDecorator(extraCheesePizza);

        //Print overall cost
        System.out.println(mushroomPizza.cost());
    }
}
