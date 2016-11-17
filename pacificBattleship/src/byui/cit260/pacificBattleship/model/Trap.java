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
public class Trap extends Scene implements Serializable {
    private int damage;

    public Trap() {
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.damage;
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
        final Trap other = (Trap) obj;
        if (this.damage != other.damage) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trap{" + "damage=" + damage + '}';
    }

    
}
