/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacificbattleship;


import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.ShipMenu;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Invasion;
import byui.cit260.pacificBattleship.model.SalvageShip;
import byui.cit260.pacificBattleship.model.Schematic;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.NuclearPart;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.Trap;
import byui.cit260.pacificBattleship.model.Base;
import byui.cit260.pacificBattleship.view.StartProgramView;
import byui.cit260.pacificBattleship.view.CommandMenu;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author ort09
 */
public class PacificBattleship {
    private static Game currentGame = null;
    private static Game player = null;
    
    private static Ship battleship = new Ship();
    private static Ship transport = new Ship();
    private static Ship submarine = new Ship();
    private static Ship aircraftCarrier = new Ship();
    private static Ship destroyer = new Ship();
    private static ShipClass battleship0 = new ShipClass();
    private static ShipClass transport0 = new ShipClass(); 
    private static int current = 5;
    private static int max = 5;
    private static int POW = 15;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static int getCurrent() {
        return current;
    }

    public static void setCurrent(int current) {
        PacificBattleship.current = current;
    }

    public static int getMax() {
        return max;
    }

    public static void setMax(int max) {
        PacificBattleship.max = max;
    }

    public static int getPOW() {
        return POW;
    }

    public static void setPOW(int POW) {
        PacificBattleship.POW = POW;
    }

    public static void setCurrentGame(Game currentGame) {
        PacificBattleship.currentGame = currentGame;
    }

    public static Game getPlayer() {
        return player;
    }

    public static void setPlayer(Game player) {
        PacificBattleship.player = player;
    }

    public static Ship getBattleship() {
        return battleship;
    }

    public static void setBattleship(Ship battleship) {
        PacificBattleship.battleship = battleship;
    }

    public static Ship getTransport() {
        return transport;
    }

    public static void setTransport(Ship transport) {
        PacificBattleship.transport = transport;
    }

    public static Ship getSubmarine() {
        return submarine;
    }

    public static void setSubmarine(Ship submarine) {
        PacificBattleship.submarine = submarine;
    }

    public static Ship getAircraftCarrier() {
        return aircraftCarrier;
    }

    public static void setAircraftCarrier(Ship aircraftCarrier) {
        PacificBattleship.aircraftCarrier = aircraftCarrier;
    }

    public static Ship getDestroyer() {
        return destroyer;
    }

    public static void setDestroyer(Ship destroyer) {
        PacificBattleship.destroyer = destroyer;
    }

    public static ShipClass getBattleship0() {
        return battleship0;
    }

    public static void setBattleship0(ShipClass battleship0) {
        PacificBattleship.battleship0 = battleship0;
    }

    public static ShipClass getTransport0() {
        return transport0;
    }

    public static void setTransport0(ShipClass transport0) {
        PacificBattleship.transport0 = transport0;
    }
    
    

    public static void main(String[] args) {
        
        
        
        battleship0.setName("Salvaged Battleship");
        battleship0.setBonusDefense(0);
        battleship0.setBonusHull(0);
        battleship0.setSymbol("b");
        
        transport0.setName("Salvaged Transport");
        transport0.setBonusDefense(0);
        transport0.setBonusHull(0);
        transport0.setSymbol("t");
        
        battleship.setName("U.S.S. Tennessee");
        battleship.setType("Battleship");
        battleship.setDefense(1);
        battleship.setAccuracy(80);
        battleship.setUserControl(true);
        battleship.setAttack(4);
        battleship.setHull(6);
        battleship.setDescription("");
        battleship.setCoordinate(null);
        battleship.setSymbol("");
        battleship.setShipClass(battleship0);
        
        
        transport.setName("U.S.S. President Jackson");
        transport.setType("Transport");
        transport.setDefense(0);
        transport.setAccuracy(100);
        transport.setUserControl(true);
        transport.setAttack(10);
        transport.setHull(10);
        transport.setDescription("");
        transport.setCoordinate(null);
        transport.setSymbol("");
        transport.setShipClass(transport0);
        

        
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        
    }  
}
