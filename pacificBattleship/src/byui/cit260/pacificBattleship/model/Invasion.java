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
public class Invasion extends Scene implements Serializable{
    
    private String unit;

    public Invasion() {
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.unit);
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
        final Invasion other = (Invasion) obj;
        if (!Objects.equals(this.unit, other.unit)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Invasion{" + "unit=" + unit + '}';
    }

}
