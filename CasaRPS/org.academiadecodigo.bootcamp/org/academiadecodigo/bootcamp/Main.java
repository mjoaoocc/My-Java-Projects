package org.academiadecodigo.bootcamp;

import java.util.Random;

public class Main {
    private static final int NUM_ROUNDS = 3;

    private enum Choice {
        ROCK,
        PAPER,
        SCISSORS
    }

    private static class Player {
        private final String name;
        private int score;

        public Player(String name) {
            this.name = name;
            this.score = 0;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public void incrementScore() {
            score++;
        }

        public Choice getChoice() {
            Random random = new Random();
            Choice[] choices = Choice.values();
            return choices[random.nextInt(choices.length)];
        }
    }

    public static void playGame() {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        for (int round = 1; round <= NUM_ROUNDS; round++) {
            Choice choice1 = player1.getChoice();
            Choice choice2 = player2.getChoice();
            String result = determineRoundWinner(choice1, choice2);

            System.out.println("Round " + round + ": " + result);

            if (result.equals(player1.getName())) {
                player1.incrementScore();
            } else if (result.equals(player2.getName())) {
                player2.incrementScore();
            }
        }

        Player winner = determineWinner(player1, player2);

        if (winner != null) {
            System.out.println("The winner is: " + winner.getName());
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static String determineRoundWinner(Choice choice1, Choice choice2) {
        if (choice1 == choice2) {
            return "It's a tie!";
        }

        if ((choice1 == Choice.ROCK && choice2 == Choice.SCISSORS) ||
                (choice1 == Choice.PAPER && choice2 == Choice.ROCK) ||
                (choice1 == Choice.SCISSORS && choice2 == Choice.PAPER)) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }
    }

    private static Player determineWinner(Player player1, Player player2) {
        if (player1.getScore() > player2.getScore()) {
            return player1;
        } else if (player2.getScore() > player1.getScore()) {
            return player2;
        } else {
            return null; // It's a tie or no clear winner
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
