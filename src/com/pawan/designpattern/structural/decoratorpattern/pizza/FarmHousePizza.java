package com.pawan.designpattern.structural.decoratorpattern.pizza;

public class FarmHousePizza implements BasePizza{
    @Override
    public int cost() {
        return 150;
    }
}
