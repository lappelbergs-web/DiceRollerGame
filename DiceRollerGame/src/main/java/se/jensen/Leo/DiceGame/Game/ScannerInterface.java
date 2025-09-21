package se.jensen.Leo.DiceGame.Game;

import java.util.Scanner;

import static se.jensen.Leo.DiceGame.Game.Rolling.rollTwoDice;

public class ScannerInterface {
    public static void main(String[] args) {
        //starting area of game
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Two-Player Dice Match ====");

        System.out.println("Player 1, enter your first name:");
        String player1Firstname = scanner.nextLine();
        System.out.println("enter your last name:");
        String player1Lastname = scanner.nextLine();
        Player player1 = new Player(player1Firstname, player1Lastname, 0);

        System.out.println("Player 2, enter your first name:");
        String player2Firstname = scanner.nextLine();
        System.out.println("enter your last name:");
        String player2Lastname = scanner.nextLine();
        Player player2 = new Player(player2Firstname, player2Lastname, 0);

        System.out.println("==== welcome to the dice game " + player1.getFullName() + " and " + player2.getFullName() + " ====");
//game itself
        boolean playing = true;
        while (playing) {
            System.out.println("\nType 'play' to roll the dice, or 'quit' to exit:");
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "play":
                    // Each player rolls two times
                    System.out.println("\n-- " + player1.getFullName() + "'s turn --");
                    int roll1 = rollTwoDice();
                    player1.addToScore(roll1);
                    System.out.println(player1.getFullName() + "'s total score: " + player1.getScore());

                    System.out.println("\n-- " + player2.getFullName() + "'s turn --");
                    int roll3 = rollTwoDice();
                    player2.addToScore(roll3);
                    System.out.println(player2.getFullName() + "'s total score: " + player2.getScore());

                    // Determine winner
                    System.out.println("\n==== Match Results ====");
                    if (player1.getScore() > player2.getScore()) {
                        System.out.println(player1.getFullName() + " wins!");
                    } else if (player2.getScore() > player1.getScore()) {
                        System.out.println(player2.getFullName() + " wins!");
                    } else {
                        System.out.println("It's a tie!");
                    }

                    // End after one match
                    playing = false;
                    break;

                case "quit":
                    System.out.println("Game exited.");
                    playing = false;
                    break;

                default:
                    System.out.println("Invalid input. Please type 'play' or 'quit'.");
            }
        }

        scanner.close();
    }
}


//useful shit to know perhaps 😐🙏
//rolling and score:a
//Rolling.AddToScore.AddToScore();
//roll the dice
//Rolling.rollTwoDice();
//player mister constructor
//firstname lastname score
//addToScore (adds to existing score)
//getFullName (gets the full name obv)
//getScore (gets the score and maybe gets me some more adrenaline)
