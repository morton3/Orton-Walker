/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacificbattleship;


import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Player;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.view.StartProgramView;
/**
 *
 * @author ort09
 */
public class PacificBattleship {
    private static Game currentGame = null;
    private static Player player = null;
    private static Ship activeShip = null;
    


    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PacificBattleship.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PacificBattleship.player = player;
    }

    public static Ship getActiveShip() {
        return activeShip;
    }

    public static void setActiveShip(Ship ActiveShip) {
        PacificBattleship.activeShip = ActiveShip;
    }

    
    

    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        
        
    }  
}
