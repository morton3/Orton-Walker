/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author ort09
 */
public class Collectable implements Serializable{
     
    // classes instance variables
    private String collectableType;
    private String name;
    private Ship ship;
    private Location[][] location;
    private boolean active;
    private ShipClass shipClass;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public Collectable() {
    }

    public String getCollectableType() {
        return collectableType;
    }

    public void setCollectableType(String collectableType) {
        this.collectableType = collectableType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }

    public ShipClass getShipClass() {
        return shipClass;
    }

    public void setShipClass(ShipClass shipClass) {
        this.shipClass = shipClass;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.collectableType);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.ship);
        hash = 83 * hash + Arrays.deepHashCode(this.location);
        hash = 83 * hash + (this.active ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.shipClass);
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
        final Collectable other = (Collectable) obj;
        if (this.active != other.active) {
            return false;
        }
        if (!Objects.equals(this.collectableType, other.collectableType)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ship, other.ship)) {
            return false;
        }
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        if (this.shipClass != other.shipClass) {
            return false;
        }
        return true;
    }

  

  

   
    
    
}