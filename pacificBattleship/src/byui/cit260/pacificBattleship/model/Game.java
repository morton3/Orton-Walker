/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nathan
 */
public class Game implements Serializable {
    
    // classes instance variables
    private double nuclearParts;
    private double numOfPOW;
    private double numOfUsedPOW;
    private Player currentPlayer;

    public Game() {
    }


    public double getNuclearParts() {
        return nuclearParts;
    }

    public void setNuclearParts(double nuclearParts) {
        this.nuclearParts = nuclearParts;
    }

    public double getNumOfPOW() {
        return numOfPOW;
    }

    public void setNumOfPOW(double numOfPOW) {
        this.numOfPOW = numOfPOW;
    }

    public double getNumOfUsedPOW() {
        return numOfUsedPOW;
    }

    public void setNumOfUsedPOW(double numOfUsedPOW) {
        this.numOfUsedPOW = numOfUsedPOW;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.nuclearParts) ^ (Double.doubleToLongBits(this.nuclearParts) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numOfPOW) ^ (Double.doubleToLongBits(this.numOfPOW) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numOfUsedPOW) ^ (Double.doubleToLongBits(this.numOfUsedPOW) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.nuclearParts) != Double.doubleToLongBits(other.nuclearParts)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfPOW) != Double.doubleToLongBits(other.numOfPOW)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfUsedPOW) != Double.doubleToLongBits(other.numOfUsedPOW)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "nuclearParts=" + nuclearParts + ", numOfPOW=" + numOfPOW + ", numOfUsedPOW=" + numOfUsedPOW + '}';
    }
    
   
    
}
