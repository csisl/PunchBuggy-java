package main;
import java.util.ArrayList;

public interface Vehicle {
    String color = null;
    int count = 0;
    String[] colors = { "red", "orange", "yellow", "green", "blue",
            "purple", "pink", "black", "white", "silver" };
    String getColor();
    void incrementCount();
    void decrementCount();
    int getCount();
}
