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
public class TrapSceneType {
    private int trapName;
    private int damage;
    private int trapUncovered;
    private int trapActive;

    public TrapSceneType() {
    }

    public int getTrapName() {
        return trapName;
    }

    public void setTrapName(int trapName) {
        this.trapName = trapName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getTrapUncovered() {
        return trapUncovered;
    }

    public void setTrapUncovered(int trapUncovered) {
        this.trapUncovered = trapUncovered;
    }

    public int getTrapActive() {
        return trapActive;
    }

    public void setTrapActive(int trapActive) {
        this.trapActive = trapActive;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.trapName;
        hash = 23 * hash + this.damage;
        hash = 23 * hash + this.trapUncovered;
        hash = 23 * hash + this.trapActive;
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
        final TrapSceneType other = (TrapSceneType) obj;
        if (this.trapName != other.trapName) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        if (this.trapUncovered != other.trapUncovered) {
            return false;
        }
        if (this.trapActive != other.trapActive) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrapSceneType{" + "trapName=" + trapName + ", damage=" + damage + ", trapUncovered=" + trapUncovered + ", trapActive=" + trapActive + '}';
    }
    
    
    
}
