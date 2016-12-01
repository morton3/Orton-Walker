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
        transport.setDescription("The description......");
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
        submarine.setDescription("The description......");
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
        aircraftCarrier.setDescription("The description......");
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
        destroyer.setDescription("The description......");
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
        
        Ship enemyBattleship1 = new Ship();
        enemyBattleship1.setShipName("Yamato");
        enemyBattleship1.setType("Battleship");
        enemyBattleship1.setDefense(0);
        enemyBattleship1.setAccuracy(60);
        enemyBattleship1.setUserControl(false);
        enemyBattleship1.setAttack(10);
        enemyBattleship1.setHull(12);
        enemyBattleship1.setMaxHull(12);
        enemyBattleship1.setDescription("");
        enemyBattleship1.setLocation(null);
        enemyBattleship1.setShipClass(ShipClass.battleship1);
        enemyBattleship1.setSymbol(enemyBattleship1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyBattleship1.ordinal()] = enemyBattleship1;
        
        Ship enemyBattleship2 = new Ship();
        enemyBattleship2.setShipName("Yamato");
        enemyBattleship2.setType("Battleship");
        enemyBattleship2.setDefense(0);
        enemyBattleship2.setAccuracy(60);
        enemyBattleship2.setUserControl(false);
        enemyBattleship2.setAttack(10);
        enemyBattleship2.setHull(12);
        enemyBattleship2.setMaxHull(12);
        enemyBattleship2.setDescription("");
        enemyBattleship2.setLocation(null);
        enemyBattleship2.setShipClass(ShipClass.battleship1);
        enemyBattleship2.setSymbol(enemyBattleship2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyBattleship2.ordinal()] = enemyBattleship2;
        
        Ship enemyBattlecruisers1 = new Ship();
        enemyBattlecruisers1.setShipName("Kongō");
        enemyBattlecruisers1.setType("Battlecruisers");
        enemyBattlecruisers1.setDefense(0);
        enemyBattlecruisers1.setAccuracy(60);
        enemyBattlecruisers1.setUserControl(false);
        enemyBattlecruisers1.setAttack(10);
        enemyBattlecruisers1.setHull(12);
        enemyBattlecruisers1.setMaxHull(12);
        enemyBattlecruisers1.setDescription("");
        enemyBattlecruisers1.setLocation(null);
        enemyBattlecruisers1.setShipClass(ShipClass.battleship1);
        enemyBattlecruisers1.setSymbol(enemyBattlecruisers1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyBattlecruisers1.ordinal()] = enemyBattlecruisers1;
        
        Ship enemyBattlecruisers2 = new Ship();
        enemyBattlecruisers2.setShipName("Kongō");
        enemyBattlecruisers2.setType("Battlecruisers");
        enemyBattlecruisers2.setDefense(0);
        enemyBattlecruisers2.setAccuracy(60);
        enemyBattlecruisers2.setUserControl(false);
        enemyBattlecruisers2.setAttack(10);
        enemyBattlecruisers2.setHull(12);
        enemyBattlecruisers2.setMaxHull(12);
        enemyBattlecruisers2.setDescription("");
        enemyBattlecruisers2.setLocation(null);
        enemyBattlecruisers2.setShipClass(ShipClass.battleship1);
        enemyBattlecruisers2.setSymbol(enemyBattlecruisers2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyBattlecruisers2.ordinal()] = enemyBattlecruisers2;
        
         Ship enemySubmarine1 = new Ship();
        enemySubmarine1.setShipName("I-506");
        enemySubmarine1.setType("submarine");
        enemySubmarine1.setDefense(0);
        enemySubmarine1.setAccuracy(60);
        enemySubmarine1.setUserControl(false);
        enemySubmarine1.setAttack(10);
        enemySubmarine1.setHull(12);
        enemySubmarine1.setMaxHull(12);
        enemySubmarine1.setDescription("");
        enemySubmarine1.setLocation(null);
        enemySubmarine1.setShipClass(ShipClass.battleship1);
        enemySubmarine1.setSymbol(enemySubmarine1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemySubmarine1.ordinal()] = enemySubmarine1;
        
        Ship enemySubmarine2 = new Ship();
        enemySubmarine2.setShipName("I-506");
        enemySubmarine2.setType("submarine");
        enemySubmarine2.setDefense(0);
        enemySubmarine2.setAccuracy(60);
        enemySubmarine2.setUserControl(false);
        enemySubmarine2.setAttack(10);
        enemySubmarine2.setHull(12);
        enemySubmarine2.setMaxHull(12);
        enemySubmarine2.setDescription("");
        enemySubmarine2.setLocation(null);
        enemySubmarine2.setShipClass(ShipClass.battleship1);
        enemySubmarine2.setSymbol(enemySubmarine2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemySubmarine2.ordinal()] = enemySubmarine2;
        
        Ship enemyDestroyer1 = new Ship();
        enemyDestroyer1.setShipName("Yūgumo1");
        enemyDestroyer1.setType("Destroyer");
        enemyDestroyer1.setDefense(0);
        enemyDestroyer1.setAccuracy(60);
        enemyDestroyer1.setUserControl(false);
        enemyDestroyer1.setAttack(10);
        enemyDestroyer1.setHull(12);
        enemyDestroyer1.setMaxHull(12);
        enemyDestroyer1.setDescription("");
        enemyDestroyer1.setLocation(null);
        enemyDestroyer1.setShipClass(ShipClass.battleship1);
        enemyDestroyer1.setSymbol(enemyDestroyer1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyDestroyer1.ordinal()] = enemyDestroyer1;
        
        Ship enemyDestroyer2 = new Ship();
        enemyDestroyer2.setShipName("Yūgumo2");
        enemyDestroyer2.setType("Destroyer");
        enemyDestroyer2.setDefense(0);
        enemyDestroyer2.setAccuracy(60);
        enemyDestroyer2.setUserControl(false);
        enemyDestroyer2.setAttack(10);
        enemyDestroyer2.setHull(12);
        enemyDestroyer2.setMaxHull(12);
        enemyDestroyer2.setDescription("");
        enemyDestroyer2.setLocation(null);
        enemyDestroyer2.setShipClass(ShipClass.battleship1);
        enemyDestroyer2.setSymbol(enemyDestroyer2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyDestroyer2.ordinal()] = enemyDestroyer2;
        
        Ship enemyAircraftCarrier1 = new Ship();
        enemyAircraftCarrier1.setShipName("Shōkaku2");
        enemyAircraftCarrier1.setType("Aircraft Carrier");
        enemyAircraftCarrier1.setDefense(0);
        enemyAircraftCarrier1.setAccuracy(60);
        enemyAircraftCarrier1.setUserControl(false);
        enemyAircraftCarrier1.setAttack(10);
        enemyAircraftCarrier1.setHull(12);
        enemyAircraftCarrier1.setMaxHull(12);
        enemyAircraftCarrier1.setDescription("");
        enemyAircraftCarrier1.setLocation(null);
        enemyAircraftCarrier1.setShipClass(ShipClass.battleship1);
        enemyAircraftCarrier1.setSymbol(enemyAircraftCarrier1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyAircraftCarrier1.ordinal()] = enemyAircraftCarrier1;
        
        Ship enemyAircraftCarrier2 = new Ship();
        enemyAircraftCarrier2.setShipName("Shōkaku2");
        enemyAircraftCarrier2.setType("enemyAircraft Carrier");
        enemyAircraftCarrier2.setDefense(0);
        enemyAircraftCarrier2.setAccuracy(60);
        enemyAircraftCarrier2.setUserControl(false);
        enemyAircraftCarrier2.setAttack(10);
        enemyAircraftCarrier2.setHull(12);
        enemyAircraftCarrier2.setMaxHull(12);
        enemyAircraftCarrier2.setDescription("");
        enemyAircraftCarrier2.setLocation(null);
        enemyAircraftCarrier2.setShipClass(ShipClass.battleship1);
        enemyAircraftCarrier2.setSymbol(enemyAircraftCarrier2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyAircraftCarrier2.ordinal()] = enemyAircraftCarrier2;
        
        return enemyShips;
    }
    
}
