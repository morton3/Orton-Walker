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
    private Ship[] ship;
    private String upgradeType;
    
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

    public Ship[] getShip() {
        return ship;
    }

    public void setShip(Ship[] ship) {
        this.ship = ship;
    }

    public String getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.upgradeType);
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
        if (!Objects.equals(this.upgradeType, other.upgradeType)) {
            return false;
        }
        return true;
    }

   

    
    
    
}
