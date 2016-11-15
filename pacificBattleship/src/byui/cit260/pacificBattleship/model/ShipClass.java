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
public class ShipClass implements Serializable{
    
    private String name;
    private int bonusDefense;
    private int bonusHull;
    private String symbol;
    private int bonusAccuracy;

    public ShipClass() {
    }

    ShipClass(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    public int getBonusHull() {
        return bonusHull;
    }

    public void setBonusHull(int bonusHull) {
        this.bonusHull = bonusHull;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getBonusAccuracy() {
        return bonusAccuracy;
    }

    public void setBonusAccuracy(int bonusAccuracy) {
        this.bonusAccuracy = bonusAccuracy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.bonusDefense;
        hash = 17 * hash + this.bonusHull;
        hash = 17 * hash + Objects.hashCode(this.symbol);
        hash = 17 * hash + this.bonusAccuracy;
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
        final ShipClass other = (ShipClass) obj;
        if (this.bonusDefense != other.bonusDefense) {
            return false;
        }
        if (this.bonusHull != other.bonusHull) {
            return false;
        }
        if (this.bonusAccuracy != other.bonusAccuracy) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShipClass{" + "name=" + name + ", bonusDefense=" + bonusDefense + ", bonusHull=" + bonusHull + ", symbol=" + symbol + ", bonusAccuracy=" + bonusAccuracy + '}';
    }

    
    
    
    
}
