package se.jensen.Leo.DiceGame.Game;


public class Player {
    private final String firstname;
    private final String lastname;
    private int score;

    public Player(String firstname, String lastname, int score) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = 0;

    }

    public void addToScore(int totalScore) {
        this.score += totalScore;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }
    public int getScore() {
        return score;
    }
}
//a

