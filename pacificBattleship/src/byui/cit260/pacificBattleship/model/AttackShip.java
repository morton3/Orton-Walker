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
public class AttackShip implements Serializable{
    
    private String shipType;
    private int attackRange;
    private int attackDamage;

    public AttackShip() {
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.shipType);
        hash = 97 * hash + this.attackRange;
        hash = 97 * hash + this.attackDamage;
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
        final AttackShip other = (AttackShip) obj;
        if (this.attackRange != other.attackRange) {
            return false;
        }
        if (this.attackDamage != other.attackDamage) {
            return false;
        }
        if (!Objects.equals(this.shipType, other.shipType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AttackShip{" + "shipType=" + shipType + ", attackRange=" + attackRange + ", attackDamage=" + attackDamage + '}';
    }
    
    
}
