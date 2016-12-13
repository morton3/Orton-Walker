/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;
import java.io.Serializable;
/**
 *
 * @author Nathan
 */
public class Base extends Scene implements Serializable{
    private int defense;
    private int attack;
    private int power;
    private int POW;

    public int getPOW() {
        return POW;
    }

    public void setPOW(int POW) {
        this.POW = POW;
    }
    
    
    

    public Base() {
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.defense;
        hash = 67 * hash + this.attack;
        hash = 67 * hash + this.power;
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
        final Base other = (Base) obj;
        if (this.defense != other.defense) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.power != other.power) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Base{" + "defense=" + defense + ", attack=" + attack + ", power=" + power + '}';
    }
    
    
}