package com.pawan.designpattern.behavioral.strategypattern;

import com.pawan.designpattern.behavioral.strategypattern.strategy.Strategy;

public class Context {
    Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(int a, int b){
        strategy.execute(a, b);
    }
}
