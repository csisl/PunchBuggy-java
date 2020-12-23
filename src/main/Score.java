package main;
import java.util.HashMap;

public class Score {

    private int totalScore = 0; // total score for the player
    HashMap <String, Integer> colorScore = new HashMap<>();

    public Score() {

    }

    public void incrementTotalScore() {
        this.totalScore++;
    }

    public void decrementTotalScore() {
        this.totalScore--;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public void printTotalScore() {
        System.out.println("TOTAL SCORE: " + this.totalScore);
        for (HashMap.Entry<String, Integer> entry: colorScore.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void initializeColorScore(String color) {
        colorScore.put(color, 0);
    }

    public void addPoint(String color) {
        this.incrementTotalScore();
        colorScore.put(color, colorScore.get(color) + 1);
    }


}
