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
    private String name;
    private double scrapAmount;
    private double numOfUnusedPrisoners;
    private double numOfUsedPrisoners;

    public Game() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScrapAmount() {
        return scrapAmount;
    }

    public void setScrapAmount(double scrapAmount) {
        this.scrapAmount = scrapAmount;
    }

    public double getNumOfUnusedPrisoners() {
        return numOfUnusedPrisoners;
    }

    public void setNumOfUnusedPrisoners(double numOfUnusedPrisoners) {
        this.numOfUnusedPrisoners = numOfUnusedPrisoners;
    }

    public double getNumOfUsedPrisoners() {
        return numOfUsedPrisoners;
    }

    public void setNumOfUsedPrisoners(double numOfUsedPrisoners) {
        this.numOfUsedPrisoners = numOfUsedPrisoners;
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.scrapAmount) ^ (Double.doubleToLongBits(this.scrapAmount) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.numOfUnusedPrisoners) ^ (Double.doubleToLongBits(this.numOfUnusedPrisoners) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.numOfUsedPrisoners) ^ (Double.doubleToLongBits(this.numOfUsedPrisoners) >>> 32));
        return hash;
    } 

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", scrapAmount=" + scrapAmount + ", numOfUnusedPrisoners=" + numOfUnusedPrisoners + ", numOfUsedPrisoners=" + numOfUsedPrisoners + '}';
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
        if (Double.doubleToLongBits(this.scrapAmount) != Double.doubleToLongBits(other.scrapAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfUnusedPrisoners) != Double.doubleToLongBits(other.numOfUnusedPrisoners)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfUsedPrisoners) != Double.doubleToLongBits(other.numOfUsedPrisoners)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
