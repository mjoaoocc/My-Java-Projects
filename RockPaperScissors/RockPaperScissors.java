package org.academiadecodigo.bootcamp;

public class RockPaperScissors {
    private static final int NUM_ROUNDS = 3;

    public static void playGame() {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

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
        Choice choice1 = getPlayerChoice(player1);
        Choice choice2 = getPlayerChoice(player2);

        player1.setChoice(choice1);
        player2.setChoice(choice2);

        int result = choice1.compareTo(choice2);

        if (result == 0) {
            System.out.println("It´s a tie");
        } else if ( result <0 ) {
            System.out.println(player2.getName()+" wins");

        }else{
            System.out.println(player1.getName() + " wins");


        }
    }

    private static Choice getPlayerChoice (Player player){
     return generateRandomChoice();

    }

     private static Choice generateRandomChoice () {
         Choice[] choices = Choice.values();
         int randomIndex = (int) (Math.random() * choices.length);
         return choices[randomIndex];
     }
 private static Player determineWinner(Player player1 , Player player2) {
        int score1 = 0 ;
        int score2 = 0;

        for (int round = 1 ; round <= NUM_ROUNDS; round++){
           Choice choice1 = player1.getChoice();
           Choice choice2 = player2.getChoice();
            int result = choice1.compareTo(choice2);


            if (result <0){
                score2++;

            }else if (result>0){
                score1++;

            }
        }
            if (score1>score2){
                return player1;

            } else if (score2>score1) {
                return player2;
            }else{
                return null;

            }
    }


















}
