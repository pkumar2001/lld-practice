package com.pawan.designpattern.behavioral.strategypattern;

import com.pawan.designpattern.behavioral.strategypattern.strategy.AdditionStrategy;
import com.pawan.designpattern.behavioral.strategypattern.strategy.SubtractionStrategy;

public class Client {


    public static void main(String[] args){
        Context context = new Context(new AdditionStrategy());
        context.execute(10, 5);

        Context context1 = new Context(new SubtractionStrategy());
        context1.execute(100, 50);
    }
}
