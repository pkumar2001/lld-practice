package com.pawan.problems.snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceCount;
    int min= 1;
    int max = 6;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int totalSum = 0;
        for(int i=0; i<this.diceCount; i++){
            totalSum += ThreadLocalRandom.current().nextInt(min, max+1);
        }
        return totalSum;
    }
}
