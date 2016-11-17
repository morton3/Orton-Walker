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
public class SalvageShip extends Scene implements Serializable{
    
    private String type;
    private int spawnCoordinate;

    public SalvageShip() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpawnCoordinate() {
        return spawnCoordinate;
    }

    public void setSpawnCoordinate(int spawnCoordinate) {
        this.spawnCoordinate = spawnCoordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + this.spawnCoordinate;
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
        final SalvageShip other = (SalvageShip) obj;
        if (this.spawnCoordinate != other.spawnCoordinate) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalvageShip{" + "type=" + type + ", spawnCoordinate=" + spawnCoordinate + '}';
    }

    
    
}
