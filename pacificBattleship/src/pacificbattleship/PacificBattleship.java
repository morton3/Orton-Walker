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
    


    public static Game getCurrentGame() {
        return currentGame;
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

    
    

    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        
        
    }  
}
