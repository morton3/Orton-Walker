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
 * @author ort09
 */
public class Upgrade implements Serializable{
    
    private String shipType;
    private String name;
    private int currentAllocation;
    private int maxAllocation;
    
    public Upgrade() {
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentAllocation() {
        return currentAllocation;
    }

    public void setCurrentAllocation(int currentAllocation) {
        this.currentAllocation = currentAllocation;
    }

    public int getMaxAllocation() {
        return maxAllocation;
    }

    public void setMaxAllocation(int maxAllocation) {
        this.maxAllocation = maxAllocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.shipType);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.currentAllocation;
        hash = 67 * hash + this.maxAllocation;
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
        final Upgrade other = (Upgrade) obj;
        if (this.currentAllocation != other.currentAllocation) {
            return false;
        }
        if (this.maxAllocation != other.maxAllocation) {
            return false;
        }
        if (!Objects.equals(this.shipType, other.shipType)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Upgrade{" + "shipType=" + shipType + ", name=" + name + ", currentAllocation=" + currentAllocation + ", maxAllocation=" + maxAllocation + '}';
    }

    
    
}
