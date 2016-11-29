/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.NukeParts;
import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.CollectableType;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.SceneType;
import byui.cit260.pacificBattleship.model.Ship;

import java.util.Random;

import byui.cit260.pacificBattleship.model.ShipClass;

import pacificbattleship.PacificBattleship;
/**
 *
 * @author ort09
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(10,10);
        
        Scene[] scenes = createScenes();
        
        Collectable[] collectables = createCollectables();
        
        
        GameControl.assignScenesToLocations(map, scenes);
        
        GameControl.assignCollectablesToLocations(map, collectables);
        
        
        
        return map;
    }
    
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
    
        Scene water = new Scene();
        String waterSymTop =    "~~~~~~~";
        String[] waterSymMid = {"~~","~~"};
        String waterSymBot =    "~~~~~~~";
        water.setDescription("Pacific Ocean that navy ships travel on");
        water.setActive(true);
        water.setSymTop(waterSymTop);
        water.setSymMid(waterSymMid);
        water.setSymBot(waterSymBot);
        scenes[SceneType.water.ordinal()] = water;
        
        Scene land = new Scene();
        String landSymTop =    "+++++++";
        String[] landSymMid = {"++","++"};
        String landSymBot =    "+++++++";
        land.setDescription("Islands in the Pacific Ocean");
        land.setActive(true);
        land.setSymTop(landSymTop);
        land.setSymMid(landSymMid);
        land.setSymBot(landSymBot);
        scenes[SceneType.land.ordinal()] = land;
        
        
        return scenes;
    }

    
    private static Collectable[] createCollectables() {
        Collectable[] collectables = new Collectable[CollectableType.values().length];

       Collectable empty = new Collectable();
       empty.setName("<empty>");
       empty.setCollectableType("<empty>");
       empty.setActive(false);
       
       Collectable schematicBattleship2 = new Collectable();
        schematicBattleship2.setCollectableType("schematicPiece");
        schematicBattleship2.setName("Battleship Class 2 Collectable");
        schematicBattleship2.setShipClass(ShipClass.battleship2);
        collectables[CollectableType.schematicBattleship2.ordinal()] = schematicBattleship2;
        schematicBattleship2.setActive(true);
        
        Collectable schematicBattleship3 = new Collectable();
        schematicBattleship3.setCollectableType("schematicPiece");
        schematicBattleship3.setName("Battleship Class 3 Collectable");
        schematicBattleship3.setShipClass(ShipClass.battleship3);
        collectables[CollectableType.schematicBattleship3.ordinal()] = schematicBattleship3;
        schematicBattleship3.setActive(true);
        
        Collectable schematicTransport2 = new Collectable();
        schematicTransport2.setCollectableType("schematicPiece");
        schematicTransport2.setName("Transport Class 2 Collectable");
        schematicTransport2.setShipClass(ShipClass.transport2);
        collectables[CollectableType.schematicTransport2.ordinal()] = schematicTransport2;
        schematicTransport2.setActive(true);
        
        Collectable schematicTransport3 = new Collectable();
        schematicTransport3.setCollectableType("schematicPiece");
        schematicTransport3.setName("Transport Class 3 Collectable");
        schematicTransport3.setShipClass(ShipClass.transport3);
        collectables[CollectableType.schematicTransport3.ordinal()] = schematicTransport3;
        schematicTransport3.setActive(true);
        
        Collectable schematicSubmarine2 = new Collectable();
        schematicSubmarine2.setCollectableType("schematicPiece");
        schematicSubmarine2.setName("Submarine Class 2 Collectable");
        schematicSubmarine2.setShipClass(ShipClass.submarine2);
        collectables[CollectableType.schematicSubmarine2.ordinal()] = schematicSubmarine2;
        schematicSubmarine2.setActive(true);
        
        Collectable schematicSubmarine3 = new Collectable();
        schematicSubmarine3.setCollectableType("schematicPiece");
        schematicSubmarine3.setName("Submarine Class 3 Collectable");
        schematicSubmarine3.setShipClass(ShipClass.submarine3);
        collectables[CollectableType.schematicSubmarine3.ordinal()] = schematicSubmarine3;
        schematicSubmarine3.setActive(true);
        
        Collectable schematicAircraftCarrier2 = new Collectable();
        schematicAircraftCarrier2.setCollectableType("schematicPiece");
        schematicAircraftCarrier2.setName("Aircraft Carrier Class 2 Collectable");
        schematicAircraftCarrier2.setShipClass(ShipClass.aircraftCarrier2);
        collectables[CollectableType.schematicAircraftCarrier2.ordinal()] = schematicAircraftCarrier2;
        schematicAircraftCarrier2.setActive(true);
        
        Collectable schematicAircraftCarrier3 = new Collectable();
        schematicAircraftCarrier3.setCollectableType("schematicPiece");
        schematicAircraftCarrier3.setName("Aircraft Carrier Class 3 Collectable");
        schematicAircraftCarrier3.setShipClass(ShipClass.aircraftCarrier3);
        collectables[CollectableType.schematicAircraftCarrier3.ordinal()] = schematicAircraftCarrier3;
        schematicAircraftCarrier3.setActive(true);
        
        Collectable schematicDestroyer2 = new Collectable();
        schematicDestroyer2.setCollectableType("schematicPiece");
        schematicDestroyer2.setName("Destroyer Class 2 Collectable");
        schematicDestroyer2.setShipClass(ShipClass.destroyer2);
        collectables[CollectableType.schematicDestroyer2.ordinal()] = schematicDestroyer2;
        schematicDestroyer2.setActive(true);
        
        Collectable schematicDestroyer3 = new Collectable();
        schematicDestroyer3.setCollectableType("schematicPiece");
        schematicDestroyer3.setName("Destroyer Class 3 Collectable");
        schematicDestroyer3.setShipClass(ShipClass.destroyer3);
        collectables[CollectableType.schematicDestroyer3.ordinal()] = schematicDestroyer3;
        schematicDestroyer3.setActive(true);
        
        
        return collectables;
    }


    static void assignNukesPartsToLocation(Location[][] mapLocations) {
      //for all Nuke parts
      NukeParts [] parts = NukeParts.values();{
       Random randomRow = new Random();
       Random randomColumn = new Random();
       for (int i = 0; i < parts.length; i++){
               
        //random row
         
         int row = randomRow.nextInt(10);
         
        //randomm column
         int column = randomColumn.nextInt(10);
        //get location at random row and random column
        Location mapLocation = mapLocations [row][column];
        //assign current random Nuke part to locations
        mapLocation.setNukePart(parts [i]);
      }
   
    }
      
     }

      }
      


