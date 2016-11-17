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
    private Ship[] ship;

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

    public Ship[] getShip() {
        return ship;
    }

    public void setShip(Ship[] ship) {
        this.ship = ship;
    }

   
    }


    
    
    
    

