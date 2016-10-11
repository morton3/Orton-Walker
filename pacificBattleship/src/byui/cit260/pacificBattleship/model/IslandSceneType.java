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
public class IslandSceneType implements Serializable{
    private int unitDestoryed;
    private int strength;
    private int numOdTroops;

    public IslandSceneType() {
    }

    public int getUnitDestoryed() {
        return unitDestoryed;
    }

    public void setUnitDestoryed(int unitDestoryed) {
        this.unitDestoryed = unitDestoryed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getNumOdTroops() {
        return numOdTroops;
    }

    public void setNumOdTroops(int numOdTroops) {
        this.numOdTroops = numOdTroops;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.unitDestoryed;
        hash = 41 * hash + this.strength;
        hash = 41 * hash + this.numOdTroops;
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
        final IslandSceneType other = (IslandSceneType) obj;
        if (this.unitDestoryed != other.unitDestoryed) {
            return false;
        }
        if (this.strength != other.strength) {
            return false;
        }
        if (this.numOdTroops != other.numOdTroops) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IslandSceneType{" + "unitDestoryed=" + unitDestoryed + ", strength=" + strength + ", numOdTroops=" + numOdTroops + '}';
    }
    
    
    
}
