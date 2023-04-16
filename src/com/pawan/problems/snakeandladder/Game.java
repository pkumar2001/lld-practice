package com.pawan.problems.snakeandladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    Game() {
        initializeGame();
    }

    void initializeGame() {
        board = new Board(10, 5, 6);
        dice = new Dice(2);
        winner = null;
        addPlayers();
    }

    void addPlayers() {
        Player player1 = new Player(1, 0);
        Player player2 = new Player(2, 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    void startGame() {
        while (winner == null) {
            Player player = playerToTurn();
            System.out.println("player turn is:" + player.id + " current position is: " + player.currentPosition);
            int diceNumbers = dice.rollDice();

            int playerNewPosition = player.currentPosition + diceNumbers;
            playerNewPosition =jumpCheck(playerNewPosition);
            player.currentPosition = playerNewPosition;

            if(playerNewPosition >= board.cells.length*board.cells.length){
                winner = player;
            }
        }
        System.out.println("WINNER IS:" + winner.id);
    }

    Player playerToTurn() {
        Player player = this.playersList.poll();
        this.playersList.addLast(player);
        return player;
    }

    int jumpCheck(int playerNewPosition) {
        if (playerNewPosition > board.cells.length * board.cells.length) {
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null){
            return cell.jump.getEnd();
        }
        return playerNewPosition;
    }
}
