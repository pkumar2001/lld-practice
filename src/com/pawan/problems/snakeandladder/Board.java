package com.pawan.problems.snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int noOfSnakes, int noOfLadders){
        this.initializeBoard(boardSize);
        addSnakesAndLadder(noOfSnakes, noOfLadders);
    }

    private void initializeBoard(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize; j++){
                Cell cell = new Cell();
                cells[i][j] = cell;
            }
        }
    }

    private void addSnakesAndLadder(int noOfSnakes, int noOfLadders){
        while(noOfSnakes>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(snakeHead<=snakeTail){
                continue;
            }

            Jump jump = new Jump();
            jump.setStart(snakeHead);
            jump.setEnd(snakeTail);

            Cell cell = getCell(snakeHead);
            cell.jump = jump;
            noOfSnakes--;
        }
        while(noOfLadders>0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(ladderTail<=ladderHead){
                continue;
            }

            Jump jump = new Jump();
            jump.setStart(ladderHead);
            jump.setEnd(ladderTail);

            Cell cell = getCell(ladderHead);
            cell.jump = jump;
            noOfLadders--;
        }
    }

    Cell getCell(int position){
        int row = (position-1)/10;
        int col = (position-1)%10;
        return cells[row][col];
    }
}
