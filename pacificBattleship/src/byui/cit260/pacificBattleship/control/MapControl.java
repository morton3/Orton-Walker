/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.SceneType;
import byui.cit260.pacificBattleship.model.Ship;
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
    Collectable[] collectables = new Collectable[CollectableType.values().length];
    
    return collectables;
     }


}
