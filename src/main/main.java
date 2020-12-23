package main;
import java.util.HashMap;

public class main {

    public static void main(String[] args) {
        Game currentGame = new Game();
        Player player1 = new Player("csisl");
        currentGame.addPlayer(player1);

        currentGame.incrementScore(player1, "blue");
        currentGame.decrementScore(player1, "red");
        currentGame.incrementScore(player1, "red");
        currentGame.incrementScore(player1, "red");
        player1.displayScore();
    }

}