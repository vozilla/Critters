// Name: Tuan Le & Ronin Sloan
// Class: CS &145
// Assignment: Lab 2 -- Critters (Lion)
// Purpose: Lion class for Critters program

import java.awt.*;
import java.util.*; // used for RNG

public class Lion extends Critter {
    private int turnCount = 3;
    private int turn = 3;
    private Color initial;

    // Lion constructor
    public Lion() {
    }

    // Decides what move the lion will do next
    // Also decides if lion will change color based on turn number
    public Action getMove(CritterInfo info) {
        int turnThree = turnCount % 3;
        if(turnThree == 0) {
            turnCount = 1;
            getColor();
        }
        else {
            turnCount++;
        }
        if(info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        }
        else if(info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        else {
            return Action.HOP;
        }
    }
    // uses an RNG to get the lion's color
    public Color getColor() {
        
        if (turn == 3){
            Color colorRandom = getRandomColor();
            initial = colorRandom;
            turn = 0;
            return colorRandom;
        }
        else{
            turn++;
            return initial;
        }
    }
    //gets random color for lion
    // uses an RNG to get the lion's color
    public Color getRandomColor() {
        Random randomColor = new Random();
        int colorRNG = randomColor.nextInt(3);
        if(colorRNG == 0) {
            return Color.RED;
        }
        else if(colorRNG == 1) {
            return Color.GREEN;
        }
        else {
            return Color.BLUE;
        }
    }
    // displays L for lions
    public String toString() {
        return "L";
    }
}
