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
public class ShipAbility implements Serializable{
    
    private String ability;
    private boolean active;
    private int count;

    public ShipAbility() {
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.ability);
        hash = 97 * hash + (this.active ? 1 : 0);
        hash = 97 * hash + this.count;
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
        final ShipAbility other = (ShipAbility) obj;
        if (this.active != other.active) {
            return false;
        }
        if (this.count != other.count) {
            return false;
        }
        if (!Objects.equals(this.ability, other.ability)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShipAbility{" + "ability=" + ability + ", active=" + active + ", count=" + count + '}';
    }
    
    
    
}
