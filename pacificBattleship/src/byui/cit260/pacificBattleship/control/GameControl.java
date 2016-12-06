/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.CollectableType;
import byui.cit260.pacificBattleship.model.EnemyShipList;
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
        
        ShipControl.createUpgrades();
        
        Ship[] enemyShips = ShipControl.createEnemyShips();
        game.setEnemyShips(enemyShips);
        
        GameControl.moveShipsToStartingLocations();
        
        PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.battleship.ordinal()]);
        
        Location [][] locationObjects = game.getMap().getLocations();
        MapControl.assignNukesPartsToLocation(locationObjects);
        

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
        locations[0][1].setScene(scenes[SceneType.verticalPass.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.land.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.shoreBottom.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.water.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.shoreTop.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.shoreRight.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.land.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.water.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.horizontalPass.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.shoreBottom.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.shoreTop.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.pearlHarbor.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.shoreRight.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.land.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[4][0].setScene(scenes[SceneType.shoreTop.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.shoreTop.ordinal()]);
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
        locations[6][3].setScene(scenes[SceneType.shoreBottom.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.shoreBottom.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[7][0].setScene(scenes[SceneType.shoreBottom.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.shoreRight.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.land.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.shoreRight.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.land.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[8][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.shoreBottom.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.shoreTop.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.shoreBottom.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.shoreTop.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.water.ordinal()]);

        locations[9][0].setScene(scenes[SceneType.land.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.verticalPass.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.land.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.shoreRight.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.land.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.shoreLeft.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.water.ordinal()]);
            
            for (Location[] row : locations){
                for (Location location : row){
                    location.setHidden(true);
                }
            }
            
        locations[2][9].setHidden(false);
        locations[0][6].setHidden(false);
        locations[9][9].setHidden(false);
        locations[9][3].setHidden(false);
        locations[9][1].setHidden(false);
    
    }

    public static void moveShipsToStartingLocations() {
        
        Map map = PacificBattleship.getCurrentGame().getMap();
        Ship[] ships = PacificBattleship.getCurrentGame().getShip();
        Ship[] enemyShips = PacificBattleship.getCurrentGame().getEnemyShips();
        
        Ship battleship = ships[ShipList.battleship.ordinal()];
        Ship transport = ships[ShipList.transport.ordinal()];
        Ship submarine = ships[ShipList.submarine.ordinal()];
        Ship aircraftCarrier = ships[ShipList.aircraftCarrier.ordinal()];
        Ship destroyer = ships[ShipList.destroyer.ordinal()];
        
        Ship enemyBattleship1 = enemyShips[EnemyShipList.enemyBattleship1.ordinal()];
        Ship enemyBattleship2 = enemyShips[EnemyShipList.enemyBattleship2.ordinal()];
        Ship enemyBattlecruisers1 = enemyShips[EnemyShipList.enemyBattlecruisers1.ordinal()];
        Ship enemyBattlecruisers2 = enemyShips[EnemyShipList.enemyBattlecruisers2.ordinal()];
        Ship enemySubmarine1 = enemyShips[EnemyShipList.enemySubmarine1.ordinal()];
        Ship enemySubmarine2 = enemyShips[EnemyShipList.enemySubmarine2.ordinal()];
        Ship enemyAircraftCarrier1 = enemyShips[EnemyShipList.enemyAircraftCarrier1.ordinal()];
        Ship enemyAircraftCarrier2 = enemyShips[EnemyShipList.enemyAircraftCarrier2.ordinal()];
        Ship enemyDestroyer1 = enemyShips[EnemyShipList.enemyDestroyer1.ordinal()];
        Ship enemyDestroyer2 = enemyShips[EnemyShipList.enemyDestroyer2.ordinal()];
    
        Location[][] locations = map.getLocations();
        
        // Player Ships
        locations[2][9].setShip(battleship);
        locations[0][6].setShip(transport);
        locations[9][9].setShip(submarine);
        locations[9][3].setShip(aircraftCarrier);
        locations[9][1].setShip(destroyer);
        
        battleship.setLocation(locations[2][9]);
        transport.setLocation(locations[0][6]);
        submarine.setLocation(locations[9][9]);
        aircraftCarrier.setLocation(locations[9][3]);
        destroyer.setLocation(locations[9][1]);
        
        // Enemy Ships
        locations[0][0].setShip(enemyBattleship1);
        locations[0][0].setShip(enemyBattleship2);
        locations[0][0].setShip(enemyBattlecruisers1);
        locations[0][0].setShip(enemyBattlecruisers2);
        locations[0][0].setShip(enemySubmarine1);
        locations[0][0].setShip(enemySubmarine2);
        locations[0][0].setShip(enemyAircraftCarrier1);
        locations[0][0].setShip(enemyAircraftCarrier2);
        locations[0][0].setShip(enemyDestroyer1);
        locations[0][0].setShip(enemyDestroyer2);
        
        enemyBattleship1.setLocation(locations[0][0]);
        enemyBattleship2.setLocation(locations[0][0]);
        enemyBattlecruisers1.setLocation(locations[0][0]);
        enemyBattlecruisers2.setLocation(locations[0][0]);
        enemySubmarine1.setLocation(locations[0][0]);
        enemySubmarine2.setLocation(locations[0][0]);
        enemyAircraftCarrier1.setLocation(locations[0][0]);
        enemyAircraftCarrier2.setLocation(locations[0][0]);
        enemyDestroyer1.setLocation(locations[0][0]);
        enemyDestroyer2.setLocation(locations[0][0]);
    
    }

    public static void assignCollectablesToLocations(Map map, Collectable[] collectables) {
        
        Location[][] locations = map.getLocations();
        
        
        for (Location[] row : locations){
            for (Location location : row){
                location.setCollectable(collectables[CollectableType.empty.ordinal()]);
            }
        }
        

        
        locations[2][0].setCollectable(collectables[CollectableType.schematicBattleship2.ordinal()]);
        locations[2][1].setCollectable(collectables[CollectableType.schematicBattleship3.ordinal()]);
        locations[2][2].setCollectable(collectables[CollectableType.schematicTransport2.ordinal()]);
        locations[2][3].setCollectable(collectables[CollectableType.schematicTransport3.ordinal()]);
        locations[2][4].setCollectable(collectables[CollectableType.schematicSubmarine2.ordinal()]);
        locations[2][5].setCollectable(collectables[CollectableType.schematicSubmarine3.ordinal()]);
        locations[2][6].setCollectable(collectables[CollectableType.schematicAircraftCarrier2.ordinal()]);
        locations[2][7].setCollectable(collectables[CollectableType.schematicAircraftCarrier3.ordinal()]);
        locations[2][8].setCollectable(collectables[CollectableType.schematicDestroyer2.ordinal()]);
        locations[2][9].setCollectable(collectables[CollectableType.schematicDestroyer3.ordinal()]);
        
    }


    

}
