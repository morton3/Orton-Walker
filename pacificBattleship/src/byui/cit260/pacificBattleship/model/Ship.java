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
public class Ship implements Serializable{
    
    private String name;
    private String type;
    private int defense;
    private int accuracy;
    private boolean userControl;
    private int attack;
    private int hull;
    private int maxHull;
    private String description;
    private Location coordinate;
    private String symbol;
    private ShipClass shipClass;

    public Ship() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public boolean isUserControl() {
        return userControl;
    }

    public void setUserControl(boolean userControl) {
        this.userControl = userControl;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    public int getMaxHull() {
        return maxHull;
    }

    public void setMaxHull(int maxHull) {
        this.maxHull = maxHull;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Location coordinate) {
        this.coordinate = coordinate;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ShipClass getShipClass() {
        return shipClass;
    }

    public void setShipClass(ShipClass shipClass) {
        this.shipClass = shipClass;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + this.defense;
        hash = 41 * hash + this.accuracy;
        hash = 41 * hash + (this.userControl ? 1 : 0);
        hash = 41 * hash + this.attack;
        hash = 41 * hash + this.hull;
        hash = 41 * hash + this.maxHull;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.coordinate);
        hash = 41 * hash + Objects.hashCode(this.symbol);
        hash = 41 * hash + Objects.hashCode(this.shipClass);
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
        final Ship other = (Ship) obj;
        if (this.defense != other.defense) {
            return false;
        }
        if (this.accuracy != other.accuracy) {
            return false;
        }
        if (this.userControl != other.userControl) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.hull != other.hull) {
            return false;
        }
        if (this.maxHull != other.maxHull) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.coordinate, other.coordinate)) {
            return false;
        }
        if (!Objects.equals(this.shipClass, other.shipClass)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship{" + "name=" + name + ", type=" + type + ", defense=" + defense + ", accuracy=" + accuracy + ", userControl=" + userControl + ", attack=" + attack + ", hull=" + hull + ", maxHull=" + maxHull + ", description=" + description + ", coordinate=" + coordinate + ", symbol=" + symbol + ", shipClass=" + shipClass + '}';
    }
    
}
