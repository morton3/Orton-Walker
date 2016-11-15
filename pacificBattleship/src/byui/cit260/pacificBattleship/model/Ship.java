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
public enum Ship implements Serializable{
    
    Battleship("battleship",1,90,true,5,8,8,"Battleship description","B");
    
    
    
    
    
    
    
    private final String type;
    private final int defense;
    private final int accuracy;
    private final boolean userControl;
    private final int attack;
    private final int hull;
    private final int maxHull;
    private final String description;
    private final Location coordinate;
    private final String symbol;
    private final ShipClass shipClass;

        Ship(String type, int defense, int accuracy,boolean userControl,int attack,
        int hull,int maxHull,String description,String symbol){
                this.type = type;
                
                this.defense = defense;
                this.accuracy = accuracy;
                this.userControl = userControl;
                this.attack = attack;
                this.hull = hull;
                this.maxHull = maxHull;
                this.description = description;
                coordinate = new Location(9,2);
                this.symbol = symbol;
                shipClass = new ShipClass(0);
}


 
    public String getType() {
        return type;
    }

   
    

    public int getDefense() {
        return defense;
    }

   

    public int getAccuracy() {
        return accuracy;
    }

    

    public boolean isUserControl() {
        return userControl;
    }

    

    public int getAttack() {
        return attack;
    }

   

    public int getHull() {
        return hull;
    }

    

    public int getMaxHull() {
        return maxHull;
    }

   

    public String getDescription() {
        return description;
    }

   

    public Location getCoordinate() {
        return coordinate;
    }

  

    public String getSymbol() {
        return symbol;
    }

 

    public ShipClass getShipClass() {
        return shipClass;
    }

 

   
    
}
