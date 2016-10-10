/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;
/**
 *
 * @author ort09
 */
public class Transport implements Serializable{
    
    private int troopsRemaining;

    public Transport() {
    }

    public int getTroopsRemaining() {
        return troopsRemaining;
    }

    public void setTroopsRemaining(int troopsRemaining) {
        this.troopsRemaining = troopsRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.troopsRemaining;
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
        final Transport other = (Transport) obj;
        if (this.troopsRemaining != other.troopsRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transport{" + "troopsRemaining=" + troopsRemaining + '}';
    }
    
    
    
}
