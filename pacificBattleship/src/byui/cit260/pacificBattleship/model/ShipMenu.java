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
    
    private String shipName;

    
    
    public ShipMenu() {
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.shipName);
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
        if (!Objects.equals(this.shipName, other.shipName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShipMenu{" + "shipName=" + shipName + '}';
    }
    
 
}
