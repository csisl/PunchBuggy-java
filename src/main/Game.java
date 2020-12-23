package main;
import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Game() { }

    public void addPlayer(Player player) {
        players.add(player);
    }


    public void removePlayer(String username) {

    }

    public void displayStats() {
        // print out the current score for all players
    }

    public void incrementScore(Player player, String color) {
        player.addPoint(color);
    }

    public void decrementScore(Player player, String color) {
        player.removePoint(color);
    }

}
