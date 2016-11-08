/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.view.CommandMenu;
import java.util.HashSet;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author Nathan
 */
public class GameControl {
    


    public static Game createPlayer(String name) {
      if (name == null){
          return null;
      }
      Game player = new Game();
      player.setUserName(name);
      PacificBattleship.setPlayer(player);
      
       return player;
    }

    public static void createNewGame(Game player) {
        
        
        ShipClass battleship0 = new ShipClass();
        
        battleship0.setName("Salvaged Battleship");
        battleship0.setBonusDefense(0);
        battleship0.setBonusHull(0);
        battleship0.setSymbol("b");
        
        Ship start = new Ship();
        
        start.setName("U.S.S. Tennessee");
        start.setType("Battleship");
        start.setDefense(1);
        start.setAccuracy(80);
        start.setUserControl(true);
        start.setAttack(4);
        start.setHull(6);
        start.setMaxHull(10);
        start.setDescription("");
        start.setCoordinate(null);
        start.setSymbol("");
        start.setShipClass(battleship0);
        
        CommandMenu.setActiveShip(start);
        
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.displayCommandMenuView();
    }


    public static void upgradeView(String upgrade) {
        int POW = 1;
        int current = 2;
        int max = 5;
        
            if (POW < 1 || current == max){ 
                System.out.println("You can not upgrade this ship " + upgrade);
            }
            else {
                System.out.println("You have upgraded your ship " + upgrade);
            }
                }
    
      public static Ship createActiveShip(Ship theShip) {
      
      Ship activeShip = new Ship();
      
      activeShip.setName(theShip.getName());
      activeShip.setType(theShip.getType());
      activeShip.setDefense(theShip.getDefense());
      activeShip.setAccuracy(theShip.getAccuracy());
      activeShip.setUserControl(theShip.isUserControl());
      activeShip.setAttack(theShip.getAttack());
      activeShip.setHull(theShip.getHull());
      activeShip.setMaxHull(theShip.getMaxHull());
      activeShip.setDescription(theShip.getDescription());
      activeShip.setCoordinate(theShip.getCoordinate());
      activeShip.setSymbol(theShip.getSymbol());
      activeShip.setShipClass(theShip.getShipClass());
      
      CommandMenu.setActiveShip(activeShip);
      
      
      
      return activeShip;
      
    }
    
      
}
