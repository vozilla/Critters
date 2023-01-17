// Name: Tuan Le & Ronin Sloan
// Class: CS &145
// Assignment: Lab 2 -- Critters (Giant)
// Purpose: Giant class for Critters program

import java.awt.*;

public class Giant extends Critter
{
    private int feecount;

    public Action getMove(CritterInfo info) {
        //tell the actions and behavior
        if(info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }
        else {
            return Action.RIGHT;
        }
    }//end of action

    //gets color
    public Color getColor() {
        return Color.GRAY;
    }
    public String toString() {
        
        if(feecount < 6){
            feecount++;
            return "fee";
        }
        if(feecount < 12){
            feecount++;
            return "fie";
        }
        if(feecount < 18){
            feecount++;
            return "foe";
        }
        if(feecount < 24){
            feecount++;
            return "fum";
        }
        else{
            feecount = 0;
            return "fee";
        }
        
    }//end of string
}//end of class
