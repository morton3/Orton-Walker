/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.ShipList;

/**
 *
 * @author ort09
 */
public class ShipControl {
    
        public static Ship[] createShips() {
            ShipClass[] battleshipClasses = ShipClassControl.createBattleshipClasses(); 
        
        Ship[] ships = new Ship[ShipList.values().length];
        
        Ship battleship = new Ship();
        battleship.setShipName("USS Tennessee");
        battleship.setType("Battleship");
        battleship.setDefense(1);
        battleship.setAccuracy(80);
        battleship.setUserControl(true);
        battleship.setAttack(4);
        battleship.setHull(6);
        battleship.setMaxHull(10);
        battleship.setDescription("");
        battleship.setLocation(null);
        battleship.setSymbol("");
        battleship.setShipClass(null);
        ships[ShipList.battleship.ordinal()] = battleship;
        
        Ship transport = new Ship();
        transport.setShipName("USS President Jackson");
        transport.setType("Transport");
        transport.setDefense(0);
        transport.setAccuracy(100);
        transport.setUserControl(false);
        transport.setAttack(10);
        transport.setHull(10);
        transport.setMaxHull(10);
        transport.setDescription("");
        transport.setLocation(null);
        transport.setSymbol("");
        ships[ShipList.transport.ordinal()] = transport;
        
        Ship submarine = new Ship();
        submarine.setShipName("USS submarine name");
        submarine.setType("Submarine");
        submarine.setDefense(0);
        submarine.setAccuracy(70);
        submarine.setUserControl(false);
        submarine.setAttack(10);
        submarine.setHull(10);
        submarine.setMaxHull(10);
        submarine.setDescription("");
        submarine.setLocation(null);
        submarine.setSymbol("");
        ships[ShipList.submarine.ordinal()] = submarine;
        
        Ship aircraftCarrier = new Ship();
        aircraftCarrier.setShipName("USS arircraft carrier");
        aircraftCarrier.setType("Aircraft Carrier");
        aircraftCarrier.setDefense(0);
        aircraftCarrier.setAccuracy(75);
        aircraftCarrier.setUserControl(false);
        aircraftCarrier.setAttack(10);
        aircraftCarrier.setHull(10);
        aircraftCarrier.setMaxHull(10);
        aircraftCarrier.setDescription("");
        aircraftCarrier.setLocation(null);
        aircraftCarrier.setSymbol("");
        ships[ShipList.aircraftCarrier.ordinal()] = aircraftCarrier;
        
        Ship destroyer = new Ship();
        destroyer.setShipName("USS destroyer");
        destroyer.setType("Destroyer");
        destroyer.setDefense(0);
        destroyer.setAccuracy(60);
        destroyer.setUserControl(false);
        destroyer.setAttack(10);
        destroyer.setHull(10);
        destroyer.setMaxHull(10);
        destroyer.setDescription("");
        destroyer.setLocation(null);
        destroyer.setSymbol("");
        ships[ShipList.destroyer.ordinal()] = destroyer;
        
        return ships;
    }
    
}
