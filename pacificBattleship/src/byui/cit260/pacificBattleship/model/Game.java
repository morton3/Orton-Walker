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
public class Game implements Serializable {
    
    // classes instance variables
    private double nuclearParts;
    private double numOfPOW;
    private double numOfUsedPOW;
    private Player player;
    private Map map;
    private Actor[] actor;
    private Ship[] ship;
    
    public Game() {
    }


    public double getNuclearParts() {
        return nuclearParts;
    }

    public void setNuclearParts(double nuclearParts) {
        this.nuclearParts = nuclearParts;
    }

    public double getNumOfPOW() {
        return numOfPOW;
    }

    public void setNumOfPOW(double numOfPOW) {
        this.numOfPOW = numOfPOW;
    }

    public double getNumOfUsedPOW() {
        return numOfUsedPOW;
    }

    public void setNumOfUsedPOW(double numOfUsedPOW) {
        this.numOfUsedPOW = numOfUsedPOW;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player currentPlayer) {
        this.player = currentPlayer;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Ship[] getShip() {
        return ship;
    }

    public void setShip(Ship[] ship) {
        this.ship = ship;
    }

    
    

   
   
    
}
