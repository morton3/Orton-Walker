/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.EnemyShipList;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.ShipList;

/**
 *
 * @author ort09
 */
public class ShipControl {
    
        public static Ship[] createShips() {
            
        Ship[] ships = new Ship[ShipList.values().length];
        
        Ship battleship = new Ship();
        battleship.setShipName("USS Tennessee");
        battleship.setDescription("The description......");
        battleship.setType("Battleship");
        battleship.setDefense(1);
        battleship.setAccuracy(80);
        battleship.setUserControl(true);
        battleship.setAttack(4);
        battleship.setHull(10);
        battleship.setMaxHull(10);
        battleship.setDescription("");
        battleship.setLocation(null);
        battleship.setShipClass(ShipClass.battleship1);
        battleship.setSymbol(battleship.getShipClass().getSymbol());
        ships[ShipList.battleship.ordinal()] = battleship;
        
        Ship transport = new Ship();
        transport.setShipName("USS President Jackson");
        transport.setType("Transport");
        transport.setDefense(0);
        transport.setAccuracy(100);
        transport.setUserControl(false);
        transport.setAttack(10);
        transport.setHull(6);
        transport.setMaxHull(6);
        transport.setDescription("");
        transport.setLocation(null);
        transport.setShipClass(ShipClass.transport1);
        transport.setSymbol(transport.getShipClass().getSymbol());
        ships[ShipList.transport.ordinal()] = transport;
        
        Ship submarine = new Ship();
        submarine.setShipName("USS submarine name");
        submarine.setType("Submarine");
        submarine.setDefense(0);
        submarine.setAccuracy(70);
        submarine.setUserControl(false);
        submarine.setAttack(10);
        submarine.setHull(8);
        submarine.setMaxHull(8);
        submarine.setDescription("");
        submarine.setLocation(null);
        submarine.setShipClass(ShipClass.submarine1);
        submarine.setSymbol(submarine.getShipClass().getSymbol());
        ships[ShipList.submarine.ordinal()] = submarine;
        
        Ship aircraftCarrier = new Ship();
        aircraftCarrier.setShipName("USS arircraft carrier");
        aircraftCarrier.setType("Aircraft Carrier");
        aircraftCarrier.setDefense(0);
        aircraftCarrier.setAccuracy(65);
        aircraftCarrier.setUserControl(false);
        aircraftCarrier.setAttack(10);
        aircraftCarrier.setHull(14);
        aircraftCarrier.setMaxHull(14);
        aircraftCarrier.setDescription("");
        aircraftCarrier.setLocation(null);
        aircraftCarrier.setShipClass(ShipClass.aircraftCarrier1);
        aircraftCarrier.setSymbol(aircraftCarrier.getShipClass().getSymbol());
        ships[ShipList.aircraftCarrier.ordinal()] = aircraftCarrier;
        
        Ship destroyer = new Ship();
        destroyer.setShipName("USS destroyer");
        destroyer.setType("Destroyer");
        destroyer.setDefense(0);
        destroyer.setAccuracy(60);
        destroyer.setUserControl(false);
        destroyer.setAttack(10);
        destroyer.setHull(12);
        destroyer.setMaxHull(12);
        destroyer.setDescription("");
        destroyer.setLocation(null);
        destroyer.setShipClass(ShipClass.destroyer1);
        destroyer.setSymbol(destroyer.getShipClass().getSymbol());
        ships[ShipList.destroyer.ordinal()] = destroyer;
        
        return ships;
    }

    public static Ship[] createEnemyShips() {
        
        Ship[] enemyShips = new Ship[EnemyShipList.values().length];
        
        Ship enemy1 = new Ship();
        enemy1.setShipName("USS enemy1 name");
        enemy1.setType("Battleship");
        enemy1.setDefense(0);
        enemy1.setAccuracy(60);
        enemy1.setUserControl(false);
        enemy1.setAttack(10);
        enemy1.setHull(12);
        enemy1.setMaxHull(12);
        enemy1.setDescription("");
        enemy1.setLocation(null);
        enemy1.setShipClass(ShipClass.battleship1);
        enemy1.setSymbol(enemy1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemy1.ordinal()] = enemy1;
        
        Ship enemy2 = new Ship();
        enemy2.setShipName("USS enemy2 name");
        enemy2.setType("Battleship");
        enemy2.setDefense(0);
        enemy2.setAccuracy(60);
        enemy2.setUserControl(false);
        enemy2.setAttack(10);
        enemy2.setHull(12);
        enemy2.setMaxHull(12);
        enemy2.setDescription("");
        enemy2.setLocation(null);
        enemy2.setShipClass(ShipClass.battleship1);
        enemy2.setSymbol(enemy2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemy2.ordinal()] = enemy2;
        
        return enemyShips;
    }
    
}
