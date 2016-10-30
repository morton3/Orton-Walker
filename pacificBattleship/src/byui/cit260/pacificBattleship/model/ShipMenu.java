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
public class ShipMenu implements Serializable {
    
    private String userRank;
    private String userName;
    private String shipLevel;
    private String shipClass;
    private String shipName;
    private String shipSymbol;
    private int shipAttack;
    private int shipAccuracy;
    private int shipDefense;
    private int currentHull;
    private int maxHull;
    private int currentPart;
    private int POWs;

    
    
    public ShipMenu() {
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShipLevel() {
        return shipLevel;
    }

    public void setShipLevel(String shipLevel) {
        this.shipLevel = shipLevel;
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getShipAttack() {
        return shipAttack;
    }

    public void setShipAttack(int shipAttack) {
        this.shipAttack = shipAttack;
    }

    public int getShipAccuracy() {
        return shipAccuracy;
    }

    public void setShipAccuracy(int shipAccuracy) {
        this.shipAccuracy = shipAccuracy;
    }

    public int getShipDefense() {
        return shipDefense;
    }

    public void setShipDefense(int shipDefense) {
        this.shipDefense = shipDefense;
    }

    public int getCurrentHull() {
        return currentHull;
    }

    public void setCurrentHull(int currentHull) {
        this.currentHull = currentHull;
    }

    public int getMaxHull() {
        return maxHull;
    }

    public void setMaxHull(int maxHull) {
        this.maxHull = maxHull;
    }

    public int getCurrentPart() {
        return currentPart;
    }

    public void setCurrentPart(int currentPart) {
        this.currentPart = currentPart;
    }

    public int getPOWs() {
        return POWs;
    }

    public void setPOWs(int POWs) {
        this.POWs = POWs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.userRank);
        hash = 41 * hash + Objects.hashCode(this.userName);
        hash = 41 * hash + Objects.hashCode(this.shipLevel);
        hash = 41 * hash + Objects.hashCode(this.shipClass);
        hash = 41 * hash + Objects.hashCode(this.shipName);
        hash = 41 * hash + this.shipAttack;
        hash = 41 * hash + this.shipAccuracy;
        hash = 41 * hash + this.shipDefense;
        hash = 41 * hash + this.currentHull;
        hash = 41 * hash + this.maxHull;
        hash = 41 * hash + this.currentPart;
        hash = 41 * hash + this.POWs;
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
        final ShipMenu other = (ShipMenu) obj;
        if (this.shipAttack != other.shipAttack) {
            return false;
        }
        if (this.shipAccuracy != other.shipAccuracy) {
            return false;
        }
        if (this.shipDefense != other.shipDefense) {
            return false;
        }
        if (this.currentHull != other.currentHull) {
            return false;
        }
        if (this.maxHull != other.maxHull) {
            return false;
        }
        if (this.currentPart != other.currentPart) {
            return false;
        }
        if (this.POWs != other.POWs) {
            return false;
        }
        if (!Objects.equals(this.userRank, other.userRank)) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.shipLevel, other.shipLevel)) {
            return false;
        }
        if (!Objects.equals(this.shipClass, other.shipClass)) {
            return false;
        }
        if (!Objects.equals(this.shipName, other.shipName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShipMenu{" + "userRank=" + userRank + ", userName=" + userName + ", shipLevel=" + shipLevel + ", shipClass=" + shipClass + ", shipName=" + shipName + ", shipAttack=" + shipAttack + ", shipAccuracy=" + shipAccuracy + ", shipDefense=" + shipDefense + ", currentHull=" + currentHull + ", maxHull=" + maxHull + ", currentPart=" + currentPart + ", POWs=" + POWs + '}';
    }

 

}
