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
public class Upgrade implements Serializable{
    
    private String upgradeName;
    private String upgradeType;
    private int upgradeCurrentLevel;
    private int upgradeMaxLevel;
    private double upgradeCurrency;

    public Upgrade() {
    }

    public String getUpgradeName() {
        return upgradeName;
    }

    public void setUpgradeName(String upgradeName) {
        this.upgradeName = upgradeName;
    }

    public String getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
    }

    public int getUpgradeCurrentLevel() {
        return upgradeCurrentLevel;
    }

    public void setUpgradeCurrentLevel(int upgradeCurrentLevel) {
        this.upgradeCurrentLevel = upgradeCurrentLevel;
    }

    public int getUpgradeMaxLevel() {
        return upgradeMaxLevel;
    }

    public void setUpgradeMaxLevel(int upgradeMaxLevel) {
        this.upgradeMaxLevel = upgradeMaxLevel;
    }

    public double getUpgradeCurrency() {
        return upgradeCurrency;
    }

    public void setUpgradeCurrency(double upgradeCurrency) {
        this.upgradeCurrency = upgradeCurrency;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.upgradeName);
        hash = 31 * hash + Objects.hashCode(this.upgradeType);
        hash = 31 * hash + this.upgradeCurrentLevel;
        hash = 31 * hash + this.upgradeMaxLevel;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.upgradeCurrency) ^ (Double.doubleToLongBits(this.upgradeCurrency) >>> 32));
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
        final Upgrade other = (Upgrade) obj;
        if (this.upgradeCurrentLevel != other.upgradeCurrentLevel) {
            return false;
        }
        if (this.upgradeMaxLevel != other.upgradeMaxLevel) {
            return false;
        }
        if (Double.doubleToLongBits(this.upgradeCurrency) != Double.doubleToLongBits(other.upgradeCurrency)) {
            return false;
        }
        if (!Objects.equals(this.upgradeName, other.upgradeName)) {
            return false;
        }
        if (!Objects.equals(this.upgradeType, other.upgradeType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Upgrade{" + "upgradeName=" + upgradeName + ", upgradeType=" + upgradeType + ", upgradeCurrentLevel=" + upgradeCurrentLevel + ", upgradeMaxLevel=" + upgradeMaxLevel + ", upgradeCurrency=" + upgradeCurrency + '}';
    }
    
    
    
}
