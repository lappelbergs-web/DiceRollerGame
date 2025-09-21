package DiceGame.Game.Methods;

import java.util.Random;

public class Rolling {
    public static int rollTwoDice() {

        Random random = new Random();
        int rollDice1 = random.nextInt(1, 7);
        int rollDice2 = random.nextInt(1, 7);
        int totalScore = rollDice1 + rollDice2;
        System.out.println("You rolled a " + rollDice1 + " and a " + rollDice2);
        return totalScore;

    }

    public static class AddToScore {
        private static int totalScore = 0;

        public static int AddToScore() {
            int roller = rollTwoDice();
            totalScore += roller;
            System.out.println("This is your score: " + totalScore );
            return totalScore;
        }
    }

}

//a
// (int) ((Math.random() * 6 ) + 1);
//makes all methods because it was too confusing to have different files for each method