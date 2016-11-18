/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Player;
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
        PacificBattleship.setPlayer(player);

        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        PacificBattleship.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        Ship[] ships = ShipControl.createShips();        
        game.setShip(ships);
        
        PacificBattleship.setActiveShip(ships[ShipList.battleship.ordinal()]);
        
        
        

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


    

}
