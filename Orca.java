// Name: Tuan Le & Ronin Sloan
// Class: CS &145
// Assignment: Lab 2 -- Critters (Orca)
// Purpose: Orca class for Critters program

import java.awt.*;

public class Orca extends Critter
{
    public Action getMove(CritterInfo info) {
        //tell the orcas actions and behavior
        if(info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        if(info.getLeft() == Neighbor.OTHER) {
            return Action.INFECT.LEFT;
        }
        if(info.getRight() == Neighbor.OTHER) {
            return Action.INFECT.RIGHT;
        }
        
        else if (info.getFront() == Neighbor.EMPTY) {
            return Action.INFECT;
        }
        else {
            return Action.HOP;
        }
    }
    //gets black for Orca's color.
    public Color getColor() {
        return Color.BLACK;
    }
    
    // displays O for Orca
    public String toString() {
        return "O";
    }
}//end of class

