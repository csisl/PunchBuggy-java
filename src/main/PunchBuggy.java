package main;

public class PunchBuggy implements Vehicle {

    private final String color;
    private int count;

    public PunchBuggy(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void incrementCount() {
        this.count++;
    }

    public void decrementCount() {
        if (this.count > 0) {
            this.count--;
        } else {
            System.out.println("Can't go lower than 0");
        }
    }

    public int getCount() {
        return this.count;
    }

}
