package org.academiadecodigo.bootcamp;

public class RockPaperScissorsGame {
    private static final int NUM_ROUNDS = 3;

    public static void playGame() {
        Player player1 = new Player("ABC");
        Player player2 = new Player("DEF");


        for (int round = 1; round <= NUM_ROUNDS; round++) {
            System.out.println("Round " + round + ":");
            playRound(player1, player2);
        }


        Player winner = determineWinner(player1, player2);
        if (winner != null) {
            System.out.println("The winner is: " + winner.getName());
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static void playRound(Player player1, Player player2) {

        Choice choice1 = getPlayerChoice();
        Choice choice2 = getPlayerChoice();


        player1.setChoice(choice1);
        player2.setChoice(choice2);
        System.out.println(player1.getName() + " chose to play " + choice1 );
        System.out.println(player2.getName() + " chose to play " + choice2 );


        String result = determineRoundWinner(player1, player2);

        if (result.equals("tie")) {
            System.out.println("It's a tie!");
        } else if (result.equals(player1.getName())) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

    private static Choice getPlayerChoice() {
        return generateRandomChoice();
    }

    private static Choice generateRandomChoice() {
        Choice[] choices = Choice.values();
        int randomIndex = (int) (Math.random() * choices.length);
        return choices[randomIndex];
    }

    private static String determineRoundWinner(Player player1, Player player2) {
        if (player1.getChoice() == player2.getChoice()) {
            return "tie";
        }

        if ((player1.getChoice() == Choice.ROCK && player2.getChoice() == Choice.SCISSORS)
                || (player1.getChoice() == Choice.PAPER && player2.getChoice() == Choice.ROCK)
                || (player1.getChoice() == Choice.SCISSORS && player2.getChoice() == Choice.PAPER)) {
            return player1.getName();
        }

        return player2.getName();
    }

    private static Player determineWinner(Player player1, Player player2) {
        int score1 = 0;
        int score2 = 0;

        for (int round = 1; round <= NUM_ROUNDS; round++) {
            Choice choice1 = player1.getChoice();
            Choice choice2 = player2.getChoice();
            String result = determineRoundWinner(player1, player2);

            if (result.equals(player1.getName())) {
                score1++;
            } else if (result.equals(player2.getName())) {
                score2++;
            }
        }

        if (score1 > score2) {
            return player1;
        }
            return player2;

    }
}

