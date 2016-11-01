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
    private String userName;
    private double nuclearParts;
    private double numOfPOW;
    private double numOfUsedPOW;
    private Ship currentShip;

    public Game() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Ship getCurrentShip() {
        return currentShip;
    }

    public void setCurrentShip(Ship currentShip) {
        this.currentShip = currentShip;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.userName);
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
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "userName=" + userName + ", nuclearParts=" + nuclearParts + ", numOfPOW=" + numOfPOW + ", numOfUsedPOW=" + numOfUsedPOW + '}';
    }
    
   
    
}
