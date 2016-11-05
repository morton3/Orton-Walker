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
    
        Ship battleship = new Ship();
        Ship transport = new Ship();
        Ship submarine = new Ship();
        Ship aircraftCarrier = new Ship();
        Ship destroyer = new Ship();
        Ship activeShip = new Ship();
        ShipClass battleship0 = new ShipClass();
        ShipClass transport0 = new ShipClass(); 
        int POW = 15;
        
        public static void setShip(ShipClass battleship0, ShipClass transport0, Ship battleship,Ship transport, Ship submarine, Ship aircraftCarrier, Ship destroyer) {
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
        battleship.setMaxHull(10);
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
        transport.setMaxHull(10);
        transport.setDescription("");
        transport.setCoordinate(null);
        transport.setSymbol("");
        transport.setShipClass(transport0);
        
        submarine.setName("U.S.S. submarine name");
        submarine.setType("Submarine");
        submarine.setDefense(0);
        submarine.setAccuracy(70);
        submarine.setUserControl(true);
        submarine.setAttack(10);
        submarine.setHull(10);
        submarine.setMaxHull(10);
        submarine.setDescription("");
        submarine.setCoordinate(null);
        submarine.setSymbol("");
        submarine.setShipClass(battleship0);
        
        aircraftCarrier.setName("U.S.S. arircraft carrier");
        aircraftCarrier.setType("Aircraft Carrier");
        aircraftCarrier.setDefense(0);
        aircraftCarrier.setAccuracy(75);
        aircraftCarrier.setUserControl(true);
        aircraftCarrier.setAttack(10);
        aircraftCarrier.setHull(10);
        aircraftCarrier.setMaxHull(10);
        aircraftCarrier.setDescription("");
        aircraftCarrier.setCoordinate(null);
        aircraftCarrier.setSymbol("");
        aircraftCarrier.setShipClass(battleship0);
        
        destroyer.setName("U.S.S. destroyer");
        destroyer.setType("Destroyer");
        destroyer.setDefense(0);
        destroyer.setAccuracy(60);
        destroyer.setUserControl(true);
        destroyer.setAttack(10);
        destroyer.setHull(10);
        destroyer.setMaxHull(10);
        destroyer.setDescription("");
        destroyer.setCoordinate(null);
        destroyer.setSymbol("");
        destroyer.setShipClass(battleship0);
        }

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
        
        Ship battleship = new Ship();
        Ship activeShip = new Ship();
        
        activeShip = createActiveShip(battleship);
        CommandMenu commandMenu = new CommandMenu(activeShip);
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
      
      return activeShip;
      
    }
    
}
