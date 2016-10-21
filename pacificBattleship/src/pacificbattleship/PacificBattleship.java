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
//<editor-fold defaultstate="collapsed" desc="comment">
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.NuclearPart;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.Trap;
import byui.cit260.pacificBattleship.model.Base;
/**
 *
 * @author ort09
 */
public class PacificBattleship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /********************************************************
         * Base
         ********************************************************/
        Base base0 = new Base();
        
        base0.setDefense(1);
        base0.setAttack(4);
        base0.setPower(15);
        
        String baseInfo = base0.toString();
        System.out.println(baseInfo);
        
        
        /********************************************************
         * Game
         ********************************************************/
        
        Game gameOne = new Game();
        
        gameOne.setUserName("Nathan");
        gameOne.setNuclearParts(1);
        gameOne.setNumOfUsedPOW(2);
        gameOne.setNumOfPOW(5);
        
 
      
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
     
        /********************************************************
         * Upgrade
         ********************************************************/
        
        Upgrade battleshipAttack = new Upgrade();
        
        battleshipAttack.setShipType("battleship");
        battleshipAttack.setName("Guns");
        battleshipAttack.setCurrentAllocation(2);
        battleshipAttack.setMaxAllocation(5);
        
        String upgradeInfo = battleshipAttack.toString();
        System.out.println(upgradeInfo);
        
        /********************************************************
         * Ship
         ********************************************************/
        
        Ship battleship0 = new Ship();
        
        battleship0.setName("USS Tennessee");
        battleship0.setDescription("The lead ship of her class of battleship,\n"
                + " was the third ship of the United States Navy named in\n"
                + " honor of the 16th US state.[5] During World War II in the\n"
                + " Pacific Theater, she was damaged during the attack on\n"
                + " Pearl Harbor in December 1941 but was repaired and\n"
                + " modernized. She participated in shore bombardments at the\n"
                + " Aleutian Islands, Tarawa, the Marshall Islands, the\n"
                + " Marianas, the Philippines, Iwo Jima, Okinawa among\n"
                + " others. She was also involved in the Battle of Surigao\n"
                + " Strait, the final battleship vs. battleship conflict\n"
                + " ever.\n"
                + "\n"
                + "After the end of World War II, Tennessee was placed on\n"
                + " reserve in the \"mothball fleet\" for nearly 15 years\n"
                + " before finally being scrapped in 1959. - Wikipedia\n");
        battleship0.setType("battleship");
        battleship0.setDefense(1);
        battleship0.setAccuracy(80);
        battleship0.setUserControl(true);
        battleship0.setAttack(1);
        battleship0.setHull(10);
        
        String shipInfo = battleship0.toString();
        System.out.println(shipInfo);
        
        /********************************************************
         * SalvageShip
         ********************************************************/
        
        SalvageShip submarine = new SalvageShip();
        
        submarine.setType("submarine");
        submarine.setSpawnCoordinate(00);
        
        String transportInfo = submarine.toString();
        System.out.println(transportInfo);
        
        /********************************************************
         * ShipMenu
         ********************************************************/
        
        ShipMenu battleshipMenu = new ShipMenu();
        
        battleshipMenu.setShipName("battleship");
        
        String shipMenuInfo = battleshipMenu.toString();
        System.out.println(shipMenuInfo);
        
        /********************************************************
         * Schematic
         ********************************************************/
        
        Schematic submarinePlan = new Schematic();
        
        submarinePlan.setShipType("Submarine");
        
        String schematicInfo = submarinePlan.toString();
        System.out.println(schematicInfo);
        
        /********************************************************
         * ShipClass
         ********************************************************/
        
        ShipClass dreadnaught = new ShipClass();
        
        dreadnaught.setName("Dreadnaught");
        dreadnaught.setBonusDefense(1);
        dreadnaught.setBonusHull(2);
        
        String shipClassInfo = dreadnaught.toString();
        System.out.println(shipClassInfo);
        
          /********************************************************
         * Location
         ********************************************************/
        
        Location A1 = new Location();
        
        A1.setRow(0);
        A1.setColumn(0);
        A1.setType("Sea");
        A1.setRank(2);
       
        
        String locationInfo = A1.toString();
        System.out.println(locationInfo);
        
         /********************************************************
         * nuclearPart
         ********************************************************/
        
        NuclearPart oneOfFifteen = new NuclearPart();
        
        oneOfFifteen.setPartNo(1);
        
        String nuclearPartInfo = oneOfFifteen.toString();
        System.out.println(nuclearPartInfo);
        
        
         /********************************************************
         * Scene
         ********************************************************/
        Scene base1 = new Scene();
        
        base1.setType("Base");
        base1.setName("Lv.5 Stronghold");
        
          String sceneInfo = base0.toString();
        System.out.println(sceneInfo);
        
         /********************************************************
         * Trap
         ********************************************************/
       
         Trap kamikaze0 = new Trap();
         kamikaze0.setType("Kamikaze");
         kamikaze0.setDamage(10);
        
         String trapInfo = kamikaze0.toString();
        System.out.println(trapInfo);
           
        /********************************************************
         * Collectable
         ********************************************************/
        
        
        Collectable salvageSubmarine = new Collectable();
        
        salvageSubmarine.setType("salvageShip");
        salvageSubmarine.setName("submarine");
        
        String collectableInfo = salvageSubmarine.toString();
        System.out.println(collectableInfo);
        
        /********************************************************
         * Invasion
         ********************************************************/
        
        
        Invasion midway = new Invasion();
        
        midway.setDescription("The battle of midway...");
        midway.setUnit("midwayFleet");
        
        String invasionInfo = midway.toString();
        System.out.println(invasionInfo);
        
        /********************************************************
         * Map
         ********************************************************/
        
        Map grid = new Map();
        
        grid.setRowCount(9);
        grid.setColumnCount(9);
                
        String MapInfo = grid.toString();
        System.out.println(MapInfo);
        
           
           
    }   
}
