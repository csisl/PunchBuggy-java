package main;
import java.util.ArrayList;

public class Player {

    private final String username;
    private final ArrayList<Vehicle> punchBuggies = new ArrayList<>();
    private final ArrayList<Vehicle> jeeps = new ArrayList<>();
    private final Score score;

    public Player(String username) {
        this.username = username;
        this.score = new Score();
        this.initializePunchBuggies();
    }

    // TODO: can you initialize a generic vehicle here?
    private void initializePunchBuggies() {
        for (String color: Vehicle.colors) {
            Vehicle punchBuggy = new PunchBuggy(color);
            punchBuggies.add(punchBuggy);
            score.initializeColorScore(color);
        }
    }

    public void displayScore() {
        score.printTotalScore();
    }

    public void addPoint(String color) {
        score.addPoint(color);
        this.getCurrentVehicle(color).incrementCount();
    }

    public void removePoint(String color) {
        if (score.getTotalScore() > 0 && getCurrentVehicle(color).getCount() > 0) {
            score.decrementTotalScore();
            getCurrentVehicle(color).decrementCount();
        } else {
            System.out.println("Can't decrement score!");
        }
    }

    // TODO: can we make this a generic method instead of just
    // looping through the punchbuggies array
    private Vehicle getCurrentVehicle(String color) {
        Vehicle currentVehicle = null;
        for (Vehicle vehicle: punchBuggies) {
            if (vehicle.getColor().equals(color)) {
                currentVehicle = vehicle;
                break;
            }
        }
        return currentVehicle;
    }

}
