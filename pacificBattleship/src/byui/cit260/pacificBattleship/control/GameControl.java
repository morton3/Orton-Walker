/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Player;
import byui.cit260.pacificBattleship.model.Rank;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.SceneType;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipList;
import java.util.HashSet;
import java.util.Set;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author Nathan
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setUserName(name);
        player.setRank(Rank.OneStarGeneral);
        PacificBattleship.setPlayer(player);

        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        PacificBattleship.setCurrentGame(game);
        
        game.setPlayer(player);
        
        int nuclearParts = 0;
        int numOfPOWS = 0;
        int numOfUsedPOW = 0;
        
        
        game.setNumOfPOW(numOfPOWS);
        game.setNuclearParts(nuclearParts);
        game.setNumOfUsedPOW(numOfUsedPOW);
        
        
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        Ship[] ships = ShipControl.createShips();        
        game.setShip(ships);
        
        
        
        PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.battleship.ordinal()]);
        
        
        

    }

    public static void upgradeView(String upgrade) {
        int POW = 1;
        int current = 2;
        int max = 5;

        if (POW < 1 || current == max) {
            System.out.println("You can not upgrade this ship " + upgrade);
        } else {
            System.out.println("You have upgraded your ship " + upgrade);
        }
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.land.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.water.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.land.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.water.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.land.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.land.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[4][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[5][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[6][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[7][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.land.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.land.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[8][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[9][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.land.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.land.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.water.ordinal()]);



    }

    static void moveShipsToStartingLocations(Ship[] ships, Map map) {
    
        Location[][] locations = map.getLocations();
        locations[9][2].setShip(ships[ShipList.battleship.ordinal()]);
        locations[6][0].setShip(ships[ShipList.transport.ordinal()]);
        locations[9][9].setShip(ships[ShipList.submarine.ordinal()]);
        locations[3][9].setShip(ships[ShipList.aircraftCarrier.ordinal()]);
        locations[1][9].setShip(ships[ShipList.destroyer.ordinal()]);
    
    }


    

}
