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
    private int nuclearParts;
    private int numOfPOW;
    private int numOfUsedPOW;
    private Player player;
    private Map map;
    private Actor[] actor;
    private Ship[] ship;
    private Ship[] enemyShips;
    private Ship activeShip;
    private Collectable[] collectables;
    private Base[] bases;
    
    public Game() {
    }


    public int getNuclearParts() {
        return nuclearParts;
    }

    public void setNuclearParts(int nuclearParts) {
        this.nuclearParts = nuclearParts;
    }

    public int getNumOfPOW() {
        return numOfPOW;
    }

    public void setNumOfPOW(int numOfPOW) {
        this.numOfPOW = numOfPOW;
    }

    public int getNumOfUsedPOW() {
        return numOfUsedPOW;
    }

    public void setNumOfUsedPOW(int numOfUsedPOW) {
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

    public Ship getActiveShip() {
        return activeShip;
    }

    public void setActiveShip(Ship activeShip) {
        this.activeShip = activeShip;
    }

    public Ship[] getEnemyShips() {
        return enemyShips;
    }

    public void setEnemyShips(Ship[] enemyShips) {
        this.enemyShips = enemyShips;
    }

    public Collectable[] getCollectables() {
        return collectables;
    }

    public void setCollectables(Collectable[] collectables) {
        this.collectables = collectables;
    }

    public Base[] getBases() {
        return bases;
    }

    public void setBases(Base[] bases) {
        this.bases = bases;
    }

    
    

   
   
    
}
