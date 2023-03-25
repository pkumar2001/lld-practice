package com.pawan.designpattern.behavioral.strategypattern.strategy;

public class SubtractionStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        System.out.println(a-b);
    }
}
