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
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.model.UpgradeList;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public class ShipControl {
    
        public static Ship[] createShips() {
            
        Ship[] ships = new Ship[ShipList.values().length];
        
        Ship battleship = new Ship();
        battleship.setShipName("USS Tennessee");
        battleship.setDescription(
                  "\n***********************************************************************************************************"
                + "\n* USS Tennessee (BB-43), the lead ship of her class of battleship, was the third ship of the United States*"
                + "\n* Navy named in honor of the 16th US state. During World War II in the Pacific Theater, she was damaged   *"
                + "\n* during the attack on Pearl Harbor in December 1941 but was repaired and modernized. She participated    *"
                + "\n* in shore bombardments at the Aleutian Islands, Tarawa, the Marshall Islands, the Marianas, the          *"
                + "\n* Philippines, Iwo Jima, Okinawa among others. She was also involved in the Battle of Surigao Strait, the *"
                + "\n* final battleship vs. battleship conflict ever. After the end of World War II, Tennessee was placed on   *"
                + "\n* reserve in the \"mothball fleet\" for nearly 15 years before finally being scrapped in 1959.            *"     
                + "\n***********************************************************************************************************"
        );
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
        transport.setDescription(
                  "\n***********************************************************************************************************"
                + "\n* USS President Jackson (APA-18) was a President Jackson-class attack transport that saw service          *"
                + "\n* with the US Navy in World War II and the Korean War. She was the lead ship in her class.                *"
                + "\n***********************************************************************************************************"
        );
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
        submarine.setShipName("USS Silversides");
        submarine.setDescription(
                  "\n*************************************************************************************************************"
                + "\n* USS Silversides (SS/AGSS-236) is a Gato-class submarine, the first ship of the United States Navy to be   *"
                + "\n* named for the silversides, a small fish marked with a silvery stripe along each side of its body. Her keel*"
                + "\n* was laid down on 4 November 1940 by the Mare Island Navy Yard in Vallejo, California. She was             *"
                + "\n* launched on 26 August 1941 (sponsored by Mrs. Elizabeth H. Hogan), and commissioned on 15                 *"
                + "\n* December 1941, with Lieutenant Commander Creed C. Burlingame (Class of 1927) in command. The USS          *"
                + "\n* Silversides was the top scoring surviving U.S. Submarine of WWII. Currently resides in Muskegon, MI at    *"
                + "\n* the Great Lakes Naval Memorial & Museum.                                                                  *"     
                + "\n*************************************************************************************************************"
        );
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
        aircraftCarrier.setShipName("USS Enterprise");
        aircraftCarrier.setDescription(
                  "\n***************************************************************************************************************"
                + "\n* USS Enterprise (CV-6), was the seventh U.S. Navy vessel to bear the name. Colloquially called \"the Big E\",*"
                + "\n* she was the sixth aircraft carrier of the United States Navy. A Yorktown-class carrier, she was launched    *"
                + "\n* in 1936 and was one of only three American carriers commissioned before World War II to survive the         *"
                + "\n* war (the others being Saratoga and Ranger). She participated in more major actions of the war against       *"
                + "\n* Japan than any other United States ship. These actions included the Battle of Midway, the Battle of the     *"
                + "\n* Eastern Solomon’s, the Battle of the Santa Cruz Islands, various other air-sea engagements during the        *"
                + "\n* Guadalcanal Campaign, the Battle of the Philippine Sea, and the Battle of Leyte Gulf. On three occasions    *" 
                + "\n* during the Pacific War, the Japanese announced that she had been sunk in battle, a fact that gave her       *"
                + "\n* the name \"The Grey Ghost\". Enterprise earned 20 battle stars, the most for any U.S. warship in World      *"
                + "\n* War II, and became the most decorated U.S. ship of World War II.                                            *"         
                + "\n***************************************************************************************************************"
        );
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
        destroyer.setShipName("USS Walker");
        destroyer.setDescription(
                  "\n***************************************************************************************************************"
                + "\n* Walker transited the Panama Canal on 1 November 1943 and proceeded to join the forces engaged in            *"
                + "\n* the conquest of Tarawa. After a month of operations in that area, the destroyer took part in the            *"
                + "\n* Marshall Islands campaign from 29 January through 8 February 1944. She joined forces at Funafuti for        *"
                + "\n* the invasion of Kwajalein; and, as part of a heavy cruiser bombardment unit, she participated in            *"
                + "\n* numerous neutralization bombardments at Wotje and Taroa. The only Japanese resistance encountered           *"
                + "\n* came from shore batteries which failed to hit their mark.                                                   *"
                + "\n***************************************************************************************************************"
        );
        
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
        enemyBattleship1.setShipClass(ShipClass.battleship1);
        enemyBattleship1.setSymbol(enemyBattleship1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyBattleship1.ordinal()] = enemyBattleship1;
        
        Ship enemyBattleship2 = new Ship();
        enemyBattleship2.setShipName("Yamato2");
        enemyBattleship2.setType("Battleship");
        enemyBattleship2.setDefense(0);
        enemyBattleship2.setAccuracy(60);
        enemyBattleship2.setUserControl(false);
        enemyBattleship2.setAttack(10);
        enemyBattleship2.setHull(12);
        enemyBattleship2.setMaxHull(12);
        enemyBattleship2.setDescription("");
        enemyBattleship2.setShipClass(ShipClass.battleship1);
        enemyBattleship2.setSymbol(enemyBattleship2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyBattleship2.ordinal()] = enemyBattleship2;
        
        Ship enemyBattlecruisers1 = new Ship();
        enemyBattlecruisers1.setShipName("Kongō");
        enemyBattlecruisers1.setType("Battlecruiser");
        enemyBattlecruisers1.setDefense(0);
        enemyBattlecruisers1.setAccuracy(60);
        enemyBattlecruisers1.setUserControl(false);
        enemyBattlecruisers1.setAttack(10);
        enemyBattlecruisers1.setHull(12);
        enemyBattlecruisers1.setMaxHull(12);
        enemyBattlecruisers1.setDescription("");
        enemyBattlecruisers1.setShipClass(ShipClass.battleship1);
        enemyBattlecruisers1.setSymbol(enemyBattlecruisers1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyBattlecruisers1.ordinal()] = enemyBattlecruisers1;
        
        Ship enemyBattlecruisers2 = new Ship();
        enemyBattlecruisers2.setShipName("Kongō2");
        enemyBattlecruisers2.setType("Battlecruiser");
        enemyBattlecruisers2.setDefense(0);
        enemyBattlecruisers2.setAccuracy(60);
        enemyBattlecruisers2.setUserControl(false);
        enemyBattlecruisers2.setAttack(10);
        enemyBattlecruisers2.setHull(12);
        enemyBattlecruisers2.setMaxHull(12);
        enemyBattlecruisers2.setDescription("");
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
        enemySubmarine1.setShipClass(ShipClass.battleship1);
        enemySubmarine1.setSymbol(enemySubmarine1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemySubmarine1.ordinal()] = enemySubmarine1;
        
        Ship enemySubmarine2 = new Ship();
        enemySubmarine2.setShipName("I-506-2");
        enemySubmarine2.setType("submarine");
        enemySubmarine2.setDefense(0);
        enemySubmarine2.setAccuracy(60);
        enemySubmarine2.setUserControl(false);
        enemySubmarine2.setAttack(10);
        enemySubmarine2.setHull(12);
        enemySubmarine2.setMaxHull(12);
        enemySubmarine2.setDescription("");
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
        enemyDestroyer1.setShipClass(ShipClass.battleship1);
        enemyDestroyer1.setSymbol(enemyDestroyer1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyDestroyer1.ordinal()] = enemyDestroyer1;
        
        Ship enemyDestroyer2 = new Ship();
        enemyDestroyer2.setShipName("Yūgumo2");
        enemyDestroyer2.setType("Destroyer");
        enemyDestroyer2.setDefense(2);
        enemyDestroyer2.setAccuracy(60);
        enemyDestroyer2.setUserControl(false);
        enemyDestroyer2.setAttack(10);
        enemyDestroyer2.setHull(12);
        enemyDestroyer2.setMaxHull(12);
        enemyDestroyer2.setDescription("");
        enemyDestroyer2.setShipClass(ShipClass.battleship1);
        enemyDestroyer2.setSymbol(enemyDestroyer2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyDestroyer2.ordinal()] = enemyDestroyer2;
        
        Ship enemyAircraftCarrier1 = new Ship();
        enemyAircraftCarrier1.setShipName("Shōkaku");
        enemyAircraftCarrier1.setType("Aircraft Carrier");
        enemyAircraftCarrier1.setDefense(0);
        enemyAircraftCarrier1.setAccuracy(60);
        enemyAircraftCarrier1.setUserControl(false);
        enemyAircraftCarrier1.setAttack(10);
        enemyAircraftCarrier1.setHull(12);
        enemyAircraftCarrier1.setMaxHull(12);
        enemyAircraftCarrier1.setDescription("");
        enemyAircraftCarrier1.setShipClass(ShipClass.battleship1);
        enemyAircraftCarrier1.setSymbol(enemyAircraftCarrier1.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyAircraftCarrier1.ordinal()] = enemyAircraftCarrier1;
        
        Ship enemyAircraftCarrier2 = new Ship();
        enemyAircraftCarrier2.setShipName("Shōkaku2");
        enemyAircraftCarrier2.setType("Aircraft Carrier");
        enemyAircraftCarrier2.setDefense(0);
        enemyAircraftCarrier2.setAccuracy(60);
        enemyAircraftCarrier2.setUserControl(false);
        enemyAircraftCarrier2.setAttack(10);
        enemyAircraftCarrier2.setHull(12);
        enemyAircraftCarrier2.setMaxHull(12);
        enemyAircraftCarrier2.setDescription("");
        enemyAircraftCarrier2.setShipClass(ShipClass.battleship1);
        enemyAircraftCarrier2.setSymbol(enemyAircraftCarrier2.getShipClass().getSymbol());
        enemyShips[EnemyShipList.enemyAircraftCarrier2.ordinal()] = enemyAircraftCarrier2;
        
        return enemyShips;
    }

   public static void createUpgrades() {
        
        Upgrade[] upgrades = new Upgrade[UpgradeList.values().length];
        Ship[] ships = PacificBattleship.getCurrentGame().getShip();
        
        Upgrade battleshipAttack = new Upgrade();
        battleshipAttack.setShipType("Battleship");
        battleshipAttack.setName("Guns");
        battleshipAttack.setCurrentAllocation(0);
        battleshipAttack.setMaxAllocation(5);
        battleshipAttack.setUpgradeType("attack");
        upgrades[UpgradeList.battleshipAttack.ordinal()] = battleshipAttack;
        ships[ShipList.battleship.ordinal()].setUpgradeAttack(battleshipAttack);
        
        Upgrade transportAttack = new Upgrade();
        transportAttack.setShipType("Transport");
        transportAttack.setName("Infantry Strength");
        transportAttack.setCurrentAllocation(0);
        transportAttack.setMaxAllocation(5);
        transportAttack.setUpgradeType("attack");
        upgrades[UpgradeList.transportAttack.ordinal()] = transportAttack;
        ships[ShipList.transport.ordinal()].setUpgradeAttack(transportAttack);
        
        Upgrade submarineAttack = new Upgrade();
        submarineAttack.setShipType("Submarine");
        submarineAttack.setName("Torpedoes");
        submarineAttack.setCurrentAllocation(0);
        submarineAttack.setMaxAllocation(5);
        submarineAttack.setUpgradeType("attack");
        upgrades[UpgradeList.submarineAttack.ordinal()] = submarineAttack;
        ships[ShipList.submarine.ordinal()].setUpgradeAttack(submarineAttack);
        
        Upgrade aircraftCarrierAttack = new Upgrade();
        aircraftCarrierAttack.setShipType("Aircraft Carrier");
        aircraftCarrierAttack.setName("Planes");
        aircraftCarrierAttack.setCurrentAllocation(0);
        aircraftCarrierAttack.setMaxAllocation(5);
        aircraftCarrierAttack.setUpgradeType("attack");
        upgrades[UpgradeList.aircraftCarrierAttack.ordinal()] = aircraftCarrierAttack;
        ships[ShipList.aircraftCarrier.ordinal()].setUpgradeAttack(aircraftCarrierAttack);
        
        Upgrade destroyerAttack = new Upgrade();
        destroyerAttack.setShipType("Destroyer");
        destroyerAttack.setName("Heavy Guns");
        destroyerAttack.setCurrentAllocation(0);
        destroyerAttack.setMaxAllocation(5);
        destroyerAttack.setUpgradeType("attack");
        upgrades[UpgradeList.destroyerAttack.ordinal()] = destroyerAttack;
        ships[ShipList.destroyer.ordinal()].setUpgradeAttack(destroyerAttack);
        
        Upgrade battleshipSpecial = new Upgrade();
        battleshipSpecial.setShipType("Battleship");
        battleshipSpecial.setName("Radar");
        battleshipSpecial.setCurrentAllocation(0);
        battleshipSpecial.setMaxAllocation(5);
        battleshipSpecial.setUpgradeType("special");
        upgrades[UpgradeList.battleshipAttack.ordinal()] = battleshipAttack;
        ships[ShipList.battleship.ordinal()].setUpgradeSpecial(battleshipSpecial);
        
        Upgrade transportSpecial = new Upgrade();
        transportSpecial.setShipType("Transport");
        transportSpecial.setName("Troops on Board");
        transportSpecial.setCurrentAllocation(0);
        transportSpecial.setMaxAllocation(5);
        transportSpecial.setUpgradeType("special");
        upgrades[UpgradeList.transportSpecial.ordinal()] = transportSpecial;
        ships[ShipList.transport.ordinal()].setUpgradeSpecial(transportSpecial);
        
        Upgrade submarineSpecial = new Upgrade();
        submarineSpecial.setShipType("Submarine");
        submarineSpecial.setName("Sink Level");
        submarineSpecial.setCurrentAllocation(0);
        submarineSpecial.setMaxAllocation(5);
        submarineSpecial.setUpgradeType("special");
        upgrades[UpgradeList.submarineSpecial.ordinal()] = submarineSpecial;
        ships[ShipList.submarine.ordinal()].setUpgradeSpecial(submarineSpecial);
        
        Upgrade aircraftCarrierSpecial = new Upgrade();
        aircraftCarrierSpecial.setShipType("Aircraft Carrier");
        aircraftCarrierSpecial.setName("Range");
        aircraftCarrierSpecial.setCurrentAllocation(0);
        aircraftCarrierSpecial.setMaxAllocation(5);
        aircraftCarrierSpecial.setUpgradeType("special");
        upgrades[UpgradeList.aircraftCarrierSpecial.ordinal()] = aircraftCarrierSpecial;
        ships[ShipList.aircraftCarrier.ordinal()].setUpgradeSpecial(aircraftCarrierSpecial);
        
        Upgrade destroyerSpecial = new Upgrade();
        destroyerSpecial.setShipType("Destroyer");
        destroyerSpecial.setName("Massive Artillery");
        destroyerSpecial.setCurrentAllocation(0);
        destroyerSpecial.setMaxAllocation(5);
        destroyerSpecial.setUpgradeType("special");
        upgrades[UpgradeList.destroyerSpecial.ordinal()] = destroyerSpecial;
        ships[ShipList.destroyer.ordinal()].setUpgradeSpecial(destroyerSpecial);
    }
    
}
