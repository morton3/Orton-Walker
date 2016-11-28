/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.SceneType;
import byui.cit260.pacificBattleship.model.Ship;
import java.util.Random;
import pacificbattleship.PacificBattleship;
/**
 *
 * @author ort09
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(10,10);
        
        Scene[] scenes = createScenes();
        
        
        GameControl.assignScenesToLocations(map,scenes);
        
        
        
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
    Collectable[] collectables = new Collectable[NukeParts.values().length];
    
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
        mapLocation.setCollectable(parts [i]);
      }
    
    }
       private static Collectable1[] createCollectable1s() {
    Collectable[] collectables = new Collectable[NukeParts.values().length];
    
    return collectables;
     }
      
      static void assignScrapShipToLocation(Location[][] mapLocations) {
      //for all Scrap parts
      ScrapShip [] parts = ScrapShip.values();{
       Random randomRow = new Random();
       Random randomColumn = new Random();
       for (int i = 0; i < parts.length; i++){
               
        //random row
         
         int row = randomRow.nextInt(10);
         
        //randomm column
         int column = randomColumn.nextInt(10);
        //get location at random row and random column
        Location mapLocation = mapLocations [row][column];
        //assign current random Scrap part to locations
        mapLocation.setCollectable1(parts [i]);
}
}
      }
}

