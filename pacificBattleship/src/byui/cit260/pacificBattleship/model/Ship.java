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
public class Ship implements Serializable{
    
    public Ship battleship = new Ship("USS Tennessee", "Battleship", 1, 80, true, 4, 6, 10, "USS Tennessee description here", "B");
      
    private String shipName;
    private String type;
    private int defense;
    private int accuracy;
    private boolean userControl;
    private int attack;
    private int hull;
    private int maxHull;
    private String description;
    private Location coordinate;
    private String symbol;
    private ShipClass shipClass;


    public Ship(String shipName, String type, int defense, int accuracy,boolean userControl,int attack,
        int hull,int maxHull,String description,String symbol){
                this.type = type;
                this.shipName = shipName;
                this.defense = defense;
                this.accuracy = accuracy;
                this.userControl = userControl;
                this.attack = attack;
                this.hull = hull;
                this.maxHull = maxHull;
                this.description = description;
                coordinate = new Location();
                this.symbol = symbol;
                shipClass = new ShipClass(0);
        }
    
    
    
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public boolean isUserControl() {
        return userControl;
    }

    public void setUserControl(boolean userControl) {
        this.userControl = userControl;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    public int getMaxHull() {
        return maxHull;
    }

    public void setMaxHull(int maxHull) {
        this.maxHull = maxHull;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Location coordinate) {
        this.coordinate = coordinate;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ShipClass getShipClass() {
        return shipClass;
    }

    public void setShipClass(ShipClass shipClass) {
        this.shipClass = shipClass;
    }

}
