/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.SceneType;

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
        water.setDescription("Pacific Ocean that navy ships travel on");
        water.setActive(true);
        scenes[SceneType.water.ordinal()] = water;
        
        Scene land = new Scene();
        land.setDescription("Islands in the Pacific Ocean");
        land.setActive(true);
        scenes[SceneType.land.ordinal()] = land;
        
        
            return scenes;
    }

}
